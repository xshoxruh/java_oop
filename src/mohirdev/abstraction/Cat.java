package mohirdev.abstraction;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " - meow meow");
    }

    @Override
    public String sayHello() {
        return null;
    }

    @Override
    public String run() {
        return null;
    }
}
