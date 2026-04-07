package bank.data;


public class Mir extends Card{


    public Mir() {
        super(PaymentSystem.MIR);
    }

    protected boolean isCountryValidForTheseCard(Country country){
        if (country == Country.RU)
            return true;
        else
            return false;
    }
}
