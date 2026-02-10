package exerciciosPOO.ParcelamentoDeContrato.model.services;

import exerciciosPOO.ParcelamentoDeContrato.model.entities.Contract;
import exerciciosPOO.ParcelamentoDeContrato.model.entities.Installment;

public class InstallmentService {

    private Contract contract;
    private PaymentService paymentService;
    private Integer InstallmentQuantity;

    public InstallmentService(Contract contract, PaymentService paymentService, Integer installmentQuantity) {
        this.contract = contract;
        this.paymentService = paymentService;
        InstallmentQuantity = installmentQuantity;
    }

    public void Installment(){

        Double InstallmentBruteValue = contract.getTotalValue() / InstallmentQuantity;

        for (int i = 1; i <= InstallmentQuantity; i++){
            Double InstallmentLiquidValue = InstallmentBruteValue + (paymentService.simpleTax() * i * InstallmentBruteValue);
            InstallmentLiquidValue += InstallmentLiquidValue * paymentService.paymentTax();

            Installment installment = new Installment(contract.getDate().plusMonths(i),  InstallmentLiquidValue);
            contract.addInstallment(installment);
        }

    }
}
