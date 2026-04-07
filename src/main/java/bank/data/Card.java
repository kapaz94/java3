package bank.data;

public abstract class Card {

    protected String cardHolder;
    protected int balance;
    protected String carNumber;
    protected PaymentSystem paymentSystem;

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public void setBalance(int balance) {
        if (balance < 0) {
            return;
        }
        else {
            System.out.println("added balance: "+ balance);
        this.balance = balance;
    }
    }

    public int getBalance() {
        return balance;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public void setPaymentSystem(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public Card(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public PaymentSystem getPaymentSystem(){
        return paymentSystem;
    }

    protected boolean isBalanceGreaterThan(int amount){
        return balance >= amount;
    }


    public void payInCountry(Country country, int amount){
        if (isCountryValidForTheseCard(country) && isBalanceGreaterThan(amount)) {
            balance = balance - amount;
            System.out.println("Acceted!");
    }
    }

    protected abstract boolean isCountryValidForTheseCard(Country country);


}
