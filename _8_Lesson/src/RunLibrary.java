public class RunLibrary {
    public static void main(String[] args) {
        Person person0 = new Person("jack", 101, 1234567);
        Person person1 = new Person("joue", 102, 1234577);
        Person person2 = new Person("nick", 103, 1234777);

        Library library = new Library();

        Library.registerReader(person0);
        Library.registerReader(person1);
        Library.registerReader(person2);

        System.out.println( library.getReaders()[0]);
        System.out.println( library.getReaders()[1]);
        System.out.println( library.getReaders()[2]);

        library.takeBook(1,1234567);
        System.out.println(library.getReaders()[0]);


    }
}
