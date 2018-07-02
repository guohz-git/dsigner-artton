package interceptFilter;

public class DebugFilter implements  Filter {
    @Override
    public void execte(String request) {
        System.out.println("request log: " + request);
    }
}
