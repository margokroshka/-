import java.time.LocalDate;

public class Reader {
    private final String name;
    private final int number;
    private Book book;
    private LocalDate date;

    public Reader(String name, int number) {
        this.name = name;
        this.number = number;
    }


    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", book=" + book +
                ", date=" + date +
                '}';
    }

    public void setDate(LocalDate now) {
        this.date=now;
    }
}
