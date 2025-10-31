// pacote da classe
package exercicios.entidades;

/* prefixo (public -> indica que o atributo ou método pode ser usado em outros arquivos)
e o nome da classe (Triangulo) */
public class Triangulo {

    // Atributos da classe
    public double a;
    public double b;
    public double c;

    // declaração de um método com prefixo, tipo de dado retornado, nome do método e parâmetros
    public double area() {
        // Corpo do método
        double p = (a + b + c) / 2;
        return Math.sqrt(p*(p - a)*(p - b)*(p - c));
    }
}
