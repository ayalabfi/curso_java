package orientacaoAObjetos.TiposCuringa;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        /*
        A ação abaixo dá erro pois a lista de Integer não é uma lista de Object, por mais que Integer seja
        um subtipo de Object

        List<Object> myObjs = new ArrayList<Object>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        myObjs = myNumbers;
         */

        // O tipo ? é o supertipo de qualquer tipo de lista, dessa forma, ele recebe qualquer tipo genérico.
        List<?> myObjs = new ArrayList<Object>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        myObjs = myNumbers;
    }
}
