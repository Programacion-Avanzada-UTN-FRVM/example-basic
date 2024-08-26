package com.example.PA.controller;
import com.example.PA.service.IMarcaService;
import com.example.PA.model.Marca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ejemplo")

public class MarcaController {

    @Autowired
    private IMarcaService modelService;

        @GetMapping("/marcas")
        public List<Marca> getAll(){
            return modelService.listar();
        }

        @GetMapping("/marca/{id}")
        public ResponseEntity<Marca> getMarca(@PathVariable Integer id){
            Marca model=modelService.buscarPorId(id);
            return ResponseEntity.ok(model);
        }

        @PostMapping("/marca")
        public Marca guardar(@RequestBody Marca model){
            return modelService.guardar(model);
        }

        @PutMapping("/marca")
        public Marca actualizar(@RequestBody Marca model){
            return modelService.guardar(model);
        }

        @DeleteMapping("/marca/{id}")
        public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
           Marca model=modelService.buscarPorId(id);
           modelService.eliminar(model);
           return ResponseEntity.noContent().build();
        }


}
