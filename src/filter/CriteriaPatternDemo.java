package filter;

import bridge.Circle;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria female = new CriteriaFemale();
        Criteria male = new CriteriaMale();
        Criteria single = new CriteriaSingle();

        Criteria andCriteria = new AndCriteria(female,single);
        OrCriteria orCriteria = new OrCriteria(female, single);
        System.out.println("Males:");
        List<Person> malePersons = male.meetCriteria(persons);
        printPersons(malePersons);

        System.out.println("Female:");
        List<Person> femalePersons = female.meetCriteria(persons);
        printPersons(femalePersons);

        System.out.println("Single:");
        List<Person> singlePersons = single.meetCriteria(persons);
        printPersons(singlePersons);


        System.out.println("Single And Female:");
        List<Person> singleFemale = andCriteria.meetCriteria(persons);
        printPersons(singleFemale);

        System.out.println("Single Or Female:");
        List<Person> singleOrFemale = orCriteria.meetCriteria(persons);
        printPersons(singleOrFemale);




    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons){
            System.out.println("name: "+person.getName()+" , gender: "+person.getGender()+" , maritalStatus: "+person.getMaritalStatus());
        }
    }
}
