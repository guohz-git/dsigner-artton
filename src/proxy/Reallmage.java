package proxy;

public class Reallmage implements Image {

    private String fileName;

    public Reallmage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying ：" + fileName);
    }


    private void loadFromDisk(String fileName){
        System.out.println("Loading : "+fileName);
    }
}
