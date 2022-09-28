public class Suplier extends Document {
    String type;
    int count;


    public Suplier(String numDock, String type, int cont) {
        super(numDock);
        this.count=cont;
        this.type=type;
    }

    @Override
    void docInfo() {
        System.out.println("This number of document " + this.numDock);
        System.out.println("This date " + this.date);
        System.out.println("This count " + this.count);
        System.out.println("This type " + this.type);
    }
}
