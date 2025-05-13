import model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente pf = new PessoaFisica("12345678900", "Joao", LocalDate.of(1990, 5, 10), LocalDate.now());
        Cliente pj = new PessoaJuridica("12345678000199", "Empresa X", LocalDate.now());

        ContaCorrente contaPF = new ContaCorrente(1, 500.0, pf, 200.0);
        ContaCorrente contaPJ = new ContaCorrente(2, 5000.0, pj, 1000.0);

        contaPF.sacar(650.0); // usa R$150 do cheque especial
        contaPF.cobrarTaxa(); // R$10

        contaPJ.sacar(5500.0); // usa R$500 do cheque especial
        contaPJ.cobrarTaxa(); // R$100

        System.out.println("Saldo PF: R$" + contaPF.getSaldo());
        System.out.println("Saldo PJ: R$" + contaPJ.getSaldo());
    }
}