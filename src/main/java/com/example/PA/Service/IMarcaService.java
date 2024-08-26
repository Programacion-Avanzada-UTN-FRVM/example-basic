package com.example.PA.service;

import com.example.PA.model.Marca;

import java.util.List;

public interface IMarcaService {

    public List<Marca> listar();

    public Marca buscarPorId(Integer id);

    public Marca guardar(Marca model);

    public void eliminar(Marca model);
}

