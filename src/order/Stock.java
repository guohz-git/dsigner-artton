package order;

public class Stock  {

    private String name = "ABC";
    private int quanity = 10;

    public void buy(){
        System.out.println("Stock [Name: "+name+ " ," +
                "Quantity: " + quanity +" ]bought");
    }

    public void sell(){
        System.out.println("Stock [Name: "+name+ " ," +
                "Quantity: " + quanity +" ]sold");
    }
}
