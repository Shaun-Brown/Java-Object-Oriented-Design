package lib;

public class OrderLine {

    private String id;
    private int unitPrice, quantity;

    public OrderLine(){
        id = "";
        unitPrice = 0;
        quantity = 0;
    }

    public OrderLine(String id, int unitPrice, int quantity){
        this.id = id;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return unitPrice * quantity;
    }

    @Override
    public String toString(){
        return "OrderLine:[id=" + id + ", unit price=" + unitPrice + ", quantity=" + quantity + "]";
    }

    @Override
    public boolean equals(Object obj) {
        // test exceptional cases, i.e. obj not null and is a Die
        if (obj == null  || this.getClass() != obj.getClass())
            return false;

        OrderLine other = (OrderLine) obj; // downcast to a Die object

        // compare sides and score using the == operator as they are primitive types
        return this.id.equals(other.id) && this.unitPrice == other.unitPrice && this.quantity == other.quantity;
    }
}
