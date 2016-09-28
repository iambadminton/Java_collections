package learn_collections;

/**
 * Created by a.shipulin on 27.09.16.
 */

import java.util.*;

public class Person
        implements Iterable<Person> {
    public Person(String fn, String ln, int a, Person... kids) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = a;
        for (Person child : kids)
            children.add(child);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public Iterator<Person> iterator() {
        return children.iterator();
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }


    public void setAge(int value) {
        this.age = value;
    }

    public String toString() {
        return "[Person: " +
                "firstName=" + firstName + " " +
                "lastName=" + lastName + " " +
                "age=" + age + "]";
    }

    private String firstName;
    private String lastName;
    private int age;
    private List<Person> children = new ArrayList<Person>();
}