package exerciciosPOO.ParcelamentoDeContrato.model.services;

import exerciciosPOO.ParcelamentoDeContrato.model.entities.Contract;
import exerciciosPOO.ParcelamentoDeContrato.model.entities.Installment;

public class ContractService {

    private Contract contract;
    private OnlinePaymentService onlinePaymentService;
    private Integer InstallmentQuantity;

    public ContractService(Contract contract, OnlinePaymentService onlinePaymentService, Integer installmentQuantity) {
        this.contract = contract;
        this.onlinePaymentService = onlinePaymentService;
        InstallmentQuantity = installmentQuantity;
    }

    public void Installment(){

        Double InstallmentBruteValue = contract.getTotalValue() / InstallmentQuantity;

        for (int i = 1; i <= InstallmentQuantity; i++){
            Double InstallmentLiquidValue = InstallmentBruteValue + (onlinePaymentService.simpleTax() * i * InstallmentBruteValue);
            InstallmentLiquidValue += InstallmentLiquidValue * onlinePaymentService.paymentTax();

            Installment installment = new Installment(contract.getDate().plusMonths(i),  InstallmentLiquidValue);
            contract.addInstallment(installment);
        }

    }
}
