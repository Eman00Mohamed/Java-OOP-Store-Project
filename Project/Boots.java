public class Boots extends FootballShop implements DisConsiderable {
    private int size;
    public Boots(){}
    
    public Boots(String brand, double price, int quantity, int size) {
        super(brand, price, quantity);
        this.size = size;
    }

    @Override
    public double calcDisc() {
        return getPrice() * Rate;
    }

    @Override
    public void display() {
        System.out.println("SOCCER BOOTS"+"\nBrand: " + getBrand());
        System.out.printf("Price: $%.1f" , getPrice()); 
        System.out.println(" for Size " + size);
        System.out.println("Discount: 17.0%");
        System.out.println("Quantity: " +getQuantity());
        System.out.printf("Subtotal: $%.2f%n" , calcPrice());
        System.out.println();
    }

    @Override
    public double calcPrice() {
        return (getQuantity() * getPrice()) - (getQuantity() * calcDisc());
    }
    
}
