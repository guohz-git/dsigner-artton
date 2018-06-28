package memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");

        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        System.out.println("Current State:"+originator);
        originator.setState("State #4");
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("Current State:"+originator);
    }
}
