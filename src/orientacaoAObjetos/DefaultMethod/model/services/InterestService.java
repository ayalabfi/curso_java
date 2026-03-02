package orientacaoAObjetos.DefaultMethod.model.services;

import java.security.InvalidParameterException;

public interface InterestService {

    double getInterestRate();

    /* Esse default faz com que eu não tenha que repetir o código nas 2 classes que implementam essa
    interface, ambas as implementações já tem essa função abaixo atribuída ao utilizar "default" */
    default double payment(double amount, int months) {
        if (months < 1) {
            throw new InvalidParameterException("A quantidade de meses tem que ser maior que zero");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }
}
