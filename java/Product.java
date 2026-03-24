import java.util.HashMap;
import java.util.ArrayList;

//TODO Сделать ранее созданый класс abstract
//TODO hashmap в abstract классе
//TODO метод abstract
//TODO унаследованные классы
//TODO создать три объекта
//TODO private метод при создании нового объекта прибавляет к id еденичку для нового id объекта

public abstract class Product {

        static int counterId = 0;
        private int id;
        public String title;
        public double price;
        public HashMap<String, ArrayList<String>> mapa;



        public Product() {};

        public Product(String title, double price) {
            this.id = getCounterId();
            this.title = title;
            this.price = price;
        }

        public abstract void korob();

        private int getCounterId() {
            return ++counterId;
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




