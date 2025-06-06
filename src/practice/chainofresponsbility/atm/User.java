package practice.chainofresponsbility.atm;

public class User {
    ATMCard card;
    BankAccount bankAccount;

    public User(ATMCard card, BankAccount bankAccount) {
        this.card = card;
        this.bankAccount = bankAccount;
    }

    public ATMCard getCard() {
        return card;
    }

    public void setCard(ATMCard card) {
        this.card = card;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
