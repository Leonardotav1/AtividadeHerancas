package model;

import java.time.LocalDate;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String cnpj, String razaoSocial, LocalDate dataCadastro) {
        super(dataCadastro);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }
}