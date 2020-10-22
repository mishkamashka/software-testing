package main.task3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ford");
        Spaceship spaceship = new Spaceship();
        person.boardSpaceship(spaceship);
        person.turnOnAllLevers();
        System.out.println("Ship is : " + person.turnOffSomeLevers(new int[]{1,3}));
        System.out.println("Ship is : " + person.turnOffSomeLevers(new int[]{4}));
    }
}
