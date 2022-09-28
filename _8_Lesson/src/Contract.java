import java.time.LocalDate;
import java.util.Date;

public class Contract extends Document {
    String name;
    LocalDate dateEnd = LocalDate.now().plusYears(5);

    public Contract(String numDock, String name) {
        super(numDock);
        this.name = name;
    }

    @Override
    void docInfo() {
        System.out.println("This number of document " + this.numDock);
        System.out.println("This date " + this.date);
        System.out.println("This name " + this.name);
        System.out.println("This end of contract " + this.dateEnd);

    }
}
