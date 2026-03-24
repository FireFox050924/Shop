public class Garden extends Product{
    public Garden(String title, double price) {
        super(title, price);
    }
    @Override
    public void korob() {
        System.out.println("Цена: " + super.price);
    }

}
