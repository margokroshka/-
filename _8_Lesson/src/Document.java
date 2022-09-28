import java.time.LocalDate;
import java.util.Date;
public abstract class Document {
    String numDock;
    LocalDate date= LocalDate.now();


    public Document(String numDock) {
        this.numDock = numDock;
    }

    abstract void docInfo();
}
