package model;

import java.time.LocalDate;

public abstract class Cliente {
    protected LocalDate dataCadastro;

    public Cliente(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}