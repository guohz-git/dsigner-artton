package iterator;

public class IntertorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Interator iter = nameRepository.getInterator();iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name: " + name);
        }
    }
}
