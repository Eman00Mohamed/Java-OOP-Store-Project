public class Customer {
    private String custName;
    private FootballShop[] itemList ;
    private int numOfItems;
    private double totalPay;


    public Customer(String custName) {
        this.custName = custName ;
        this.itemList = new FootballShop[10] ;
        this.numOfItems = 0 ;
        this.totalPay =0;
    }

    public String getCustName() {
        return custName;
    }
    public int getNumOfItems() {
        return numOfItems;
    }
    public double getTotalPay() {
        return totalPay;
    }
    public void buy(FootballShop product){
        if (numOfItems < itemList.length) {
            itemList[numOfItems] = product;
            numOfItems++;
            System.out.println("Item " + numOfItems);
            product.display();
        } else {
            System.out.println("Shopping cart is full. Cannot add more items.");
        }
    }
    public String toString() {
        return "Welcome " + custName + "\n\nList of Football Items Bought\n";
    }

    public void print() {
        for (int i = 0; i < numOfItems; i++){
            totalPay += itemList[i].calcPrice();
        }
        System.out.printf("TOTAL: $%.2f%n",totalPay );
    }
    
}
