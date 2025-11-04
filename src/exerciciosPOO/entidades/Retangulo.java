package exerciciosPOO.entidades;

public class Retangulo {

    public double altura;
    public double largura;

    public double area() {return largura * altura;}
    public double perimetro() {return 2 * (largura + altura);}
    public double diagonal() {return Math.sqrt((altura * altura) + (largura * largura));}

    public String toString (){
        return "Area: " + area()
                + "\nPerimetro: " + perimetro()
                + "\nDiagonal: " + diagonal();
    }

}
