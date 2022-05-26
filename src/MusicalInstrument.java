public class MusicalInstrument {

    private int id;
    private int price;
    private String category;
    private String brand;

    // Inner class
    public class Piano {
        public void display() {

            System.out.println("< Piano >");
            System.out.println("+-------------------+");
            System.out.println("ID: " + getId());
            System.out.println("Price: " + getPrice());
            System.out.println("Category: " + getCategory());
            System.out.println("Brand: " + getBrand());
            System.out.println("+-------------------+");
        }
    }

    public void displayPiano() {
        Piano piano = new Piano();
        piano.display();
    }

    // Local class
    public void displayDrum() {
        class Drum {
            public void display() {

                System.out.println("< Drum >");
                System.out.println("+-------------------+");
                System.out.println("ID: " + getId());
                System.out.println("Price: " + getPrice());
                System.out.println("Category: " + getCategory());
                System.out.println("Brand: " + getBrand());
                System.out.println("+-------------------+");
            }
        }

        Drum drum = new Drum();
        drum.display();
    }

    // anonymous class
    public void displayGuitar() {
        Guitar guitar = new Guitar() {
            @Override
            public void display() {
                System.out.println("< Guitar >");
                System.out.println("+-------------------+");
                System.out.println("ID: " + id);
                System.out.println("Price: " + price);
                System.out.println("Category: " + category);
                System.out.println("Brand: " + brand);
                System.out.println("+-------------------+");
            }
        };
        guitar.display();
    }

    //getter and setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
