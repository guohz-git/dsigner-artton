package businessDelegate;

public class BusinessDelegateDemo {

    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();

        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();
    }

}
