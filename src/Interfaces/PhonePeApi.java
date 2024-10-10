package Interfaces;

public class PhonePeApi {
    public static void main(String[] args) {
        BankApi bankapi = new IciciBankApi();

        bankapi.checkBalance();
        bankapi.depositMoney("123",34.63);
        bankapi.transferMoney("123","456",56.73);
        bankapi.showTransactionHistory();
    }
}
