package exerciciosPOO.utilitarios;

public class ConversorDeMoeda {

    public static double conversor (double valorDaMoeda, double quantidade) {
        return (valorDaMoeda * quantidade) + (valorDaMoeda * quantidade * 6 / 100);
    }
}
