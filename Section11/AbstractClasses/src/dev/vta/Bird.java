package dev.vta;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("CHIRP CHIRP BREATHE");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping it's wings");
    }
}
