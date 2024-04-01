class Invoice {
    String part;
    String description;
    int quantity;
    double price;

    public Invoice(String part, String description, int quantity,double price){
        this.part = part;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setquantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public void setprice(double price) {
        if (price > 0){
            this.price = price;
        }else {
            this.price = 0.0;
        }
    }

    public String getPart() {
        return part;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return quantity * price;
    }

}
public class Q1Invoice {
    public static void main(String args[]){
        Invoice b1 = new Invoice("Hammer","A hammer is a tool, most often a hand tool",2,250.50);
        System.out.println("Part = " + b1.getPart());
        System.out.println("Description = " + b1.getDescription());
        System.out.println("Quantity = " + b1.getQuantity());
        System.out.println("Price per item = " + b1.getPrice());
        System.out.println("Total bill amount = " + b1.getAmount());

    }
}
