package main;

import main.model.Neurosurgeon;
import main.model.Surgeon;

public class Test {

    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon("Ivan", "Popov", 5);
        surgeon.greet();
        surgeon.treat("arm");
        surgeon.sayGoodbye();

        Neurosurgeon neurosurgeon = new Neurosurgeon("Anastasia", "Fomenko", 10);
        neurosurgeon.greet();
        neurosurgeon.treat();
        neurosurgeon.sayGoodbye();
    }
}
