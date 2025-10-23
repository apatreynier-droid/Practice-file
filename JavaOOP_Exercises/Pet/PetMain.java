package Pet;

public class PetMain {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 4, "Rubber Bone");
        Bird myBird = new Bird("Chirpy", 2, 25.5);

        myDog.displayPetDetails();
        System.out.println();
        myBird.displayPetDetails();
    }
}
