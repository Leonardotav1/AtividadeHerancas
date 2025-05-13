package model;

public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(int numero, double saldo, Cliente cliente, double chequeEspecial) {
        super(numero, saldo, cliente);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo + chequeEspecial >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void cobrarTaxa() {
        if (cliente instanceof PessoaJuridica) {
            saldo -= 100.0;
        } else if (cliente instanceof PessoaFisica) {
            saldo -= 10.0;
        }
    }
}