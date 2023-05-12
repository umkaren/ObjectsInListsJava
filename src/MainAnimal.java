import java.util.ArrayList;
import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        System.out.println("Animal Menu");
        System.out.println("Entering nothing for the animal name will stop the loop");

        while (true) {
            System.out.println("Please enter a name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }
            System.out.println("Is it a dog? Yes or no: ");
            String dogInput = scanner.nextLine();
            boolean dogOrNot = dogInput.equalsIgnoreCase("Yes") || dogInput.equalsIgnoreCase("Y");

            Animal animal = new Animal(name, dogOrNot);
            animals.add(animal);
        }
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
