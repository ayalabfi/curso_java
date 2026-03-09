package orientacaoAObjetos.hashCodeEEquals;

public class Program {

    public static void main(String[] args) {

        /* equals compara se uma variável é igual a outra, para a.equals(b), o retorno é false, pois Maria
        é diferente de Alex, mas para a.equals(c), é true, pois Maria é igual a Maria

         */
        System.out.println("-- Inicio de equals --");
        System.out.println();

        String a = "Maria";
        String b = "Alex";
        String c = "Maria";

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        System.out.println();
        System.out.println("-- Fim de equals --");

        System.out.println();

        System.out.println("-- Inicio de hashCode --");
        System.out.println();

        String d = "Maria";
        String e = "Alex";

        System.out.println(d.hashCode());
        System.out.println(e.hashCode());

        System.out.println();
        System.out.println("-- Fim de hashCode --");
    }
}
