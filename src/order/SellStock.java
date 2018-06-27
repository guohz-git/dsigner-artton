package order;

public class SellStock implements Order {

    public Stock absStock;

    public SellStock(Stock absStock) {
        this.absStock = absStock;
    }

    @Override
    public void execute() {
        absStock.sell();
    }
}
