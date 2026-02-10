package exerciciosPOO.ParcelamentoDeContrato.model.services;

public class PaypalService implements PaymentService{

    public double simpleTax() {
        return 1.0/100.0;
    }

    public double paymentTax() {
        return 2.0/100.0;
    }
}
