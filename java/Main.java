public class Main {
    public static void main(String[] args) {

        Garden produc = new Garden(" ПК", 19.6);
        Garden produc2 = new Garden(" монитор ", 17.6);
        Garden produc3 = new Garden(" мышка ", 13.6);

        System.out.println("товар: ");
        produc.printInfo();
        System.out.println(produc.getId());
        System.out.println(produc2.getId());
    }
}