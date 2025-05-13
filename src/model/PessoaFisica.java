package model;

import java.time.LocalDate;

public class PessoaFisica extends Cliente {
    private String cpf;
    private String nome;
    private LocalDate nascimento;

    public PessoaFisica(String cpf, String nome, LocalDate nascimento, LocalDate dataCadastro) {
        super(dataCadastro);
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
    }
}