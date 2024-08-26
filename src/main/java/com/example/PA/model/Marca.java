package com.example.PA.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.ToString;


@Entity
@Data
@ToString
@Table(name="brand")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(min = 2, max = 50)
    private String denominacion;

    @Size(max = 200)
    private String observaciones;

    @NotNull
    private int estado;

    public void asEliminar() {
        this.setEstado(1);
    }
}
