package orientacaoAObjetos.ClasseAbstrata;

import orientacaoAObjetos.ClasseAbstrata.entidades.Conta;
import orientacaoAObjetos.ClasseAbstrata.entidades.ContaEmpresarial;
import orientacaoAObjetos.ClasseAbstrata.entidades.ContaPoupanca;

import java.util.Locale;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
/*
        O código abaixo dará erro, pois no "new Conta", está sendo instânciada a Classe base, que está declarada
        como uma classe abstrata.
        Conta conta1 = new Conta(1001, "Alex", 1000.0);
*/
        Conta conta2 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
        Conta conta3 = new ContaEmpresarial(1003, "Bob", 1000.0, 500.0);
    }
}
