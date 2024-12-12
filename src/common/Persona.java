package common;

import java.util.ArrayList;
import java.util.Collections;

public class Persona {
    private String firstName;
    private ArrayList<String> lastNames;

    public Persona(String firstName) {
        this.firstName = firstName;
        this.lastNames = new ArrayList<String>();
    }

    public Persona(String firstName, String... lastNames) {
        this(firstName);

        Collections.addAll(this.lastNames, lastNames);       
    }

    @Override
    public String toString() {
        return firstName + " " + String.join(" ", lastNames);
    }

    public void addLastName(String lastName) {
        lastNames.add(lastName);
    }
}
