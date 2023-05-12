public class Animal {
    private String name;
    private boolean dogOrNot;

    //constructors
    public Animal(String name, boolean dogOrNot) {
        this.name = name;
        this.dogOrNot = dogOrNot;
    }

    public Animal(String name) {
        this.name = name;
        this.dogOrNot = false;
    }
    public Animal(boolean dogOrNot) {
        this.name = "Buddy";
        this.dogOrNot = dogOrNot;
    }

    public String getName() {
        return this.name;
    }
    public boolean dogOrNot() {
        return this.dogOrNot;
    }

    public String toString() {
        return getName() + " is a dog = " + dogOrNot();
    }
}
