package main.model;

public class Neurosurgeon extends Surgeon {

    public Neurosurgeon(String name, String surname, int experience) {
        super(name, surname, experience);
        specialization = "neurosurgeon";
    }

    public void treat() {
        super.treat("neurosystem");
    }
}
