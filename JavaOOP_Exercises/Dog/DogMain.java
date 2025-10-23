package Dog;

public class DogMain {
    //kani nga iro kay sa imagination lng po sir <3
    public static void main(String[] args) {
        Dog dog1 = new Dog("Planetary Destroyer", "Galactic Dog");
        Dog dog2 = new Dog("Cupcake", "Robotic Dog");
        System.out.println(dog1.getName() + " is " + dog1.getBreed());
        System.out.println(dog2.getName() + " is " + dog2.getBreed());

        dog1.setName("Planetary God");
        dog1.setBreed("Boundless Dog");
         System.out.println(dog1.getName() + " is " + dog1.getBreed());
         dog2.setName("God of Dogs");
         dog2.setBreed("The Sun");
         System.out.println(dog2.getName() + " is " + dog2.getBreed());



        
    }
    
}
