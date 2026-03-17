

public class Product {
    public int id;
    public String title;
    public double price;
    
    public Product() {

    }

    public Product(String title, double price) {
        this.id = 0;
        this.title = title;
        this.price = price;
    }
    
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
    
    public void printInfo() {
        System.out.println(id);
        System.out.println(title);
        System.out.println(price);
    }
}

