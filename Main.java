public class Main {
    public static void main(String[] args) {

        Product nout = new Product("Ноутбук", 11.1);
        nout.id = 1;
        
        System.out.println("товар:");
        nout.printInfo();
    }
}