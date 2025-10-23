package Person;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Balbin", 25);
        Person p2 = new Person("Glodobe", 30);
        System.out.println(p1.getName() + " is " + p1.getAge() + " years old.");
        System.out.println(p2.getName() + " is " + p2.getAge() + " years old.");

        p1.setName("Torremucha");
        p1.setAge(19);
        System.out.println("Your name is : " + p1.getName() + "" + "Age :" + p1.getAge());
        p2.setName("Reyniner");
        p2.setAge(20);
        System.out.println("Your Name is : " + p2.getName() + "" + " Age :" + p2.getAge());
    }
}