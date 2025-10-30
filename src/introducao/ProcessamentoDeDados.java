package introducao;

public class ProcessamentoDeDados {

    public static void main (String[] args){

        int a, b, x;
        double resultado, y;

        a = 5;
        b = 2;
        y = 5.0;
        // O casting de um double para int deve ocorrer para certificar-se do risco de perder
        // as casas decimais
        x =(int) y;

        // Aqui é necessário fazer o casting do double, pois o resultado sem o casting
        // sairia como 2 (um número inteiro), e queremos que saia como 2.5 (um número com ponto
        // flutuante).
        resultado =(double) a / b;

        System.out.println(resultado);
        System.out.println(x);
    }
}
