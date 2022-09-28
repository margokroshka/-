public class Main {
    public static void main(String[] args) {
       Contract contract=new Contract("12345","Margo");
       Suplier suplier0 =new Suplier("123456","type1", 10);
       Suplier suplier1=new Suplier("1234567","type2", 20);
       Invoice invoice0=new Invoice("12345678",10, 204);
       Invoice invoice1=new Invoice("1234",20, 404);

       int code=invoice0.getCode();
       System.out.println(code);
       invoice0.setResult(11);

       Register register=new Register();

       register.save(contract);
       register.save(suplier0);
       register.save(suplier1);
       register.save(invoice0);
       register.save(invoice1);

       register.info(0);

    }
}