package main.model;

public class Surgeon implements Doctor {

    private String name;
    private String surname;
    private int experience;
    String specialization;
    
    public Surgeon(String name, String surname, int experience) {
        this.name = name;
        this.surname = surname;
        this.experience = experience;
        specialization = "surgeon";
    }
    
    @Override
    public void greet() {
        System.out.println("Hello, I'm a " + specialization + " "
                + name + " " + surname + " with experience of " + experience + " years!");
    }

    @Override
    public void treat(String organ) {
        doAnesthesia();
        heal(organ);
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Good bye! Hope not to see you later.\n");
    }

    private void doAnesthesia() {
        System.out.println("Doing anesthesia...");
        System.out.println("Done!");
    }

    private void heal(String organ) {
        System.out.println("Fixing...");
        System.out.println("Done, " + organ + " cured!");
    }

}
