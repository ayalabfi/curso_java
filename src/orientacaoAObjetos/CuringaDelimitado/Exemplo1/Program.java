package orientacaoAObjetos.CuringaDelimitado.Exemplo1;

import orientacaoAObjetos.CuringaDelimitado.Exemplo1.entities.Circle;
import orientacaoAObjetos.CuringaDelimitado.Exemplo1.entities.Rectangle;
import orientacaoAObjetos.CuringaDelimitado.Exemplo1.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        System.out.println("Total area: " + totalArea(myShapes));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(4.0));
        myCircles.add(new Circle(4.6));

        /* A operação abaixo retorna um erro de casting, pois o List<Shape> da função totalArea não é um supertipo
        de List<Circle>, para fazer funcionar, é necessário utilizar List<? extends Shape>
        System.out.println("Circles total area: " + totalArea(myCircles));


         */
        System.out.println("Circles total area: " + totalArea(myCircles));
    }

    //    Da forma a frente não funcionaria por conta da explicação anterior: public static double totalArea(List<Shape> list){
    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}
