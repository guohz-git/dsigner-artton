package proxy;

public class ProxyImage implements Image {

    private Reallmage reallmage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(reallmage == null){
            reallmage = new Reallmage(fileName);

        }
        reallmage.display();
    }
}
