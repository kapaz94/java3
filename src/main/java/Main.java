import bank.data.Card;
import bank.data.VisaCard;

import static bank.data.Country.CN;
import static bank.data.Country.RU;

public class Main {

    public static void main(String[] args) {
        Card visaCard = new VisaCard();
        visaCard.setBalance(100);
        visaCard.payInCountry(CN, 75);
        System.out.println(visaCard.getBalance());

    }
}