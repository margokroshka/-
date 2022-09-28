import java.time.LocalDate;

public class CreditCard {
    private final int number;
    private final int CVV;
    private final LocalDate date=LocalDate.now();


    public CreditCard(int number, int CVV) {
        this.number = number;
        this.CVV = CVV;
    }



    public int getNumber() {
        return number;
    }

    public int getCVV() {
        return CVV;
    }

    public LocalDate getDate() {
        return date;
    }
}
