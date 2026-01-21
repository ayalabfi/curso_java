package orientacaoAObjetos;

import orientacaoAObjetos.entidades.ClasseExtensao;
import orientacaoAObjetos.entidades.ClasseExtensaoDois;
import orientacaoAObjetos.entidades.ClasseHeranca;

public class ProgramaHeranca {

    public static void main(String[] args) {

        ClasseHeranca conta = new ClasseHeranca(1001, "Alex", 0.0);
        ClasseExtensao contab = new ClasseExtensao(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        /* Atribui um objeto da classe derivada a classe base, isso é possível por conta da relação "é-um"
            ou seja, a classe derivada também é uma classe base
         */
        ClasseHeranca conta1 = contab;
        ClasseHeranca conta2 = new ClasseExtensao(1003, "Bob", 0.0, 200.0);
        ClasseHeranca conta3 = new ClasseExtensaoDois(1004, "Ana", 0.0, 0.01);

        /* DOWNCASTING
        Não é possível converter um objeto do tipo classe derivada para classe base da mesma forma que
        da classe base para a classe derivada, para fazer dessa forma, é necessário um casting, conforme
        mostrado abaixo
         */

        ClasseExtensao conta4 = (ClasseExtensao) conta2;
        conta4.emprestimo(100.0);

        /* A linha abaixo dará erro pois não é possível converter os dados de uma classe derivada para outra
        classe derivada com atributos diferentes.
         ClasseExtensao = ClasseHeranca + limiteEmprestimo;
         ClasseExtensaoDois = ClasseHeranca + taxaDeJuros;
         O corretor não entende que dará erro, no entanto, o compilador retorna erro devido a essa divergência.

         ClasseExtensao conta5 = (ClasseExtensao) conta3;

         Para conseguir fazer esse procedimento sem que ocorra erro no código, deve ser feita a sintaxe
         da forma abaixo.
         */

        // Se o objeto conta3 for uma instancia de ClasseExtensao, o casting ocorrerá
        if (conta3 instanceof ClasseExtensao){
            // Declaração que anteriormente retornaria erro
            ClasseExtensao conta5 = (ClasseExtensao) conta3;
            conta5.emprestimo(200.0);
            System.out.println("Emprestimo!");
        }

        if (conta3 instanceof ClasseExtensaoDois){
            ClasseExtensaoDois conta5 = (ClasseExtensaoDois) conta3;
            conta5.atualizarSaldo();
            System.out.println("Atualizado!");

            /*
            -------------------------------------------------------------------------------------------------
             */

            System.out.println("Classe base (Não sobrescrita):\n");
            ClasseHeranca conta6 = new ClasseHeranca(1005, "Alexandre", 1000.0);
            conta6.sacar(200.0);
            System.out.println(conta6.getSaldo());

            System.out.println("\n Classe derivada (sobrescrita):\n");
            ClasseHeranca conta7 = new ClasseExtensaoDois(1006, "Alessandra", 1000.0, 0.01);
            conta7.sacar(200.0);
            System.out.println(conta7.getSaldo());

            System.out.println("\n Classe derivada (sobrescrita e utilizando super\n" +
                    "para fazer a ação de saque da classe base):\n");
            ClasseHeranca conta8 = new ClasseExtensao(1007, "Antonio", 1000.0, 200.0);
            conta8.sacar(200.0);
            System.out.println(conta8.getSaldo());
        }

    }
}
