package interceptFilter;

public class AuthenticationFilter implements Filter{

    @Override
    public void execte(String request) {
        System.out.println("Authticating request:" + request);
    }
}
