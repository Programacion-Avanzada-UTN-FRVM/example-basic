package com.example.PA.repository;

import com.example.PA.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface MarcaRepository extends JpaRepository<Marca,Integer> {

    // Método encontrar todas las marcas con estado = 0
    List<Marca> findByEstado(int estado);
}
