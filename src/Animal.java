public class Animal {
    private String name;
    private boolean dogOrNot;

    public Animal(String name, boolean dogOrNot) {
        this.name = name;
        this.dogOrNot = dogOrNot;
    }
    public String getName() {
        return this.name;
    }
    public boolean dogOrNot() {
        return this.dogOrNot;
    }

    @Override
    public String toString() {
        return getName() + " is a dog = " + dogOrNot();
    }
}
