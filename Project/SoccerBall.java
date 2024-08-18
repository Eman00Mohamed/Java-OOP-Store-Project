public class SoccerBall extends FootballShop{
    private int ballType;
    private static final String[] ballTypeNames = {"Professional Match", "Match", "Training", "Recreational"};
    private static final double[] ballTypePrices = {200, 80, 50, 20};
    
    public SoccerBall(){}

    public SoccerBall(String brand, double price, int quantity, int ballType) {
        super(brand, price, quantity);
        this.ballType = ballType;
    }

    @Override
    public void display() {
        if (ballType < 1 || ballType > 4) {
            try {
                System.out.println("SOCCER BALL"+"\nBrand: " + getBrand());
                throw new NotBallTypeException(ballType);
            } catch (NotBallTypeException e) {
                System.out.println(e.getMessage());
                this.ballType = 3; // change ball type to Training
            }
        }
        System.out.println("SOCCER BALL"+"\nBrand: " + getBrand());
        System.out.println("Type: " + ballTypeNames[ballType - 1]);
        System.out.printf("Price: $%.1f%n" , ballTypePrices[ballType - 1]);
        System.out.println("No Discount!");
        System.out.println("Quantity: " + getQuantity());
        System.out.printf("Subtotal: $%.2f%n" , calcPrice());
        System.out.println();

    }
    @Override
    public double calcPrice() {
        return ballTypePrices[ballType - 1] * getQuantity();
    }
    


    
}
