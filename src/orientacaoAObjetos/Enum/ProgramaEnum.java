package orientacaoAObjetos.Enum;

import orientacaoAObjetos.Enum.entidades.ClasseEnum;
import orientacaoAObjetos.Enum.entidades.enums.ClasseEnumBase;

import java.util.Date;

public class ProgramaEnum {

    public static void main(String[] args) {

        ClasseEnum situacao = new ClasseEnum(1080, new Date(), ClasseEnumBase.AGUARDANDO_PAGAMENTO);

        System.out.println(situacao);

        // Conversão de String para enum

        ClasseEnumBase os1 = ClasseEnumBase.ENTREGUE;
        ClasseEnumBase os2 = ClasseEnumBase.valueOf("ENTREGUE");

        System.out.println("os1 = " + os1);
        System.out.println("os2 = " + os2);

    }
}
