package com.example.PA.Service;

import com.example.PA.Repository.MarcaRepository;
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
        return modelRepository.findAll();
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
       modelRepository.delete(model);
    }
}
