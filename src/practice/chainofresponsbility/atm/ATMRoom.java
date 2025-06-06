package practice.chainofresponsbility.atm;

public class ATMRoom {
    ATMMachine machine;
    User user;
    public static void main(String[] args) throws Exception {
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.init();
        atmRoom.machine.currentStatus();
        atmRoom.machine.getState().insertCard(atmRoom.machine,atmRoom.user.card);
        atmRoom.machine.getState().authenticateCard(atmRoom.machine,atmRoom.user.card, 1111);
        atmRoom.machine.getState().selectOperation(atmRoom.machine,atmRoom.user.card,Transaction.WITHDRAW);
        atmRoom.machine.getState().withDrawCash(atmRoom.machine,atmRoom.user.card,100);
        atmRoom.machine.currentStatus();
    }
    private void init(){
        machine = new ATMMachine();
        machine.addThousand(1);
        machine.addTen(7);
        machine.addHundred(2); //1270

        ATMCard atmCard = new ATMCard();
        atmCard.setPin(1111);

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(11111);
        bankAccount.setBalance(1000);
        atmCard.setBankAccount(bankAccount);

        user = new User(atmCard,bankAccount);

    }
}
