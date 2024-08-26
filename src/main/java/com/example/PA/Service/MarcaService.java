package com.example.PA.service;

import com.example.PA.repository.MarcaRepository;
import com.example.PA.model.Marca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MarcaService implements IMarcaService{
    @Autowired
    private MarcaRepository modelRepository;

    @Override
    public List<Marca> listar() {
        return modelRepository.findByEstado(0);
    }

    @Override
    public Marca buscarPorId(Integer id) {
        return modelRepository.findById(id).orElse(null);
    }

    @Override
    public Marca guardar(Marca model) {
        return modelRepository.save(model);
    }

    @Override
    public void eliminar(Marca model) {

        model.asEliminar();
        modelRepository.save(model);
    }
}
