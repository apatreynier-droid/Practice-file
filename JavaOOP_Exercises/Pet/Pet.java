package Pet;

public class Pet {
    protected String name;
    protected String species;
    protected int age; 

    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public double calculateHumanAge() {
        return age * 7.0; 
    }

    public void displayPetDetails() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years");
        System.out.println("Estimated Human Age: " + calculateHumanAge() + " years");
    }
}

class Dog extends Pet {
    private String favoriteToy;

    public Dog(String name, int age, String favoriteToy) {
        super(name, "Dog", age);
        this.favoriteToy = favoriteToy;
    }

    @Override
    public double calculateHumanAge() {
        if (age <= 2) {
            return age * 10.5;
        } else {
            return 21 + (age - 2) * 4; 
        }
    }

    @Override
    public void displayPetDetails() {
        System.out.println("=== Dog Information ===");
        super.displayPetDetails();
        System.out.println("Favorite Toy: " + favoriteToy);
    }
}

class Bird extends Pet {
    private double wingspan; 

    public Bird(String name, int age, double wingspan) {
        super(name, "Bird", age);
        this.wingspan = wingspan;
    }

    @Override
    public double calculateHumanAge() {
        return age * 5.0;
    }

    @Override
    public void displayPetDetails() {
        System.out.println("=== Bird Information ===");
        super.displayPetDetails();
        System.out.println("Wingspan: " + wingspan + " cm");
    }
}

