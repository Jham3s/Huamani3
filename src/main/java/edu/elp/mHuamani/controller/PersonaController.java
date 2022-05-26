package edu.elp.mHuamani.controller;

import edu.elp.mHuamani.Service.IPersonaService;
import edu.elp.mHuamani.entidades.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class PersonaController {
    @Autowired
    private IPersonaService iPersonaService;

    @GetMapping("/persona")
    public ResponseEntity<List<Persona>> listar(){
        return ResponseEntity.status(HttpStatus.OK).body(iPersonaService.listaPersona());
    }

    @PostMapping("/persona")
    public void registrar(@RequestBody Persona persona){
        iPersonaService.registrar(persona);
    }

    @PutMapping("/persona")
    public void actualizar(@RequestBody Persona persona){
        iPersonaService.registrar(persona);
    }

    @DeleteMapping("/persona/{idpersona}")
    public void eliminar(@PathVariable Long idpersona){
        iPersonaService.eliminar(idpersona);
    }

    @GetMapping("/persona/{codigo}")
    public ResponseEntity<Persona> buscarpersona(@PathVariable String  codigo){

        return ResponseEntity.status(HttpStatus.OK).body( iPersonaService.obtenerPersonaByCodigo(codigo));
    }

}
