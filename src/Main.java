public class Main {
    public static void main(String[] args) {
    Programmer programmer = new Programmer("Ilyaz", "Java","Male");
        System.out.println(programmer);
        programmer.coding();
        Person person = new Person();
        person.learn();
        person.walk();
        person.eat();
        System.out.println(" ");

        Dancer dancer = new Dancer("Jenish","Java","Java-8");
        System.out.println(dancer);
        dancer.dancing();
        Person person1 = new Person();
        person1.learn();
        person1.walk();
        person1.eat();
        System.out.println(" ");

        Singer singer = new Singer("Syimyk","Java","Boys");
        System.out.println(singer);
        singer.singing();
        singer.playGitar();
        Person person2 = new Person();
        person2.learn();
        person2.walk();
        person2.eat();

    }
}