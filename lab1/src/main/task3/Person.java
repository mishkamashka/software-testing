package main.task3;

import java.util.Arrays;

public class Person {
    String name;
    Spaceship ship = null;

    public Person(String name) {
        this.name = name;
    }

    public void boardSpaceship(Spaceship ship){
        this.ship = ship;
    }
    public void getOffSpaceship(){
        this.ship = null;
    }

    public State turnOnAllLevers() {
        if (ship == null)
            throw new IllegalArgumentException("There are no levers around. Board a ship first.");
        Arrays.fill(ship.levers, true);
        return ship.doneLevers();
    }

    public State turnOffAllLevers() {
        if (ship == null)
            throw new IllegalArgumentException("There are no levers around. Board a ship first.");
        Arrays.fill(ship.levers, false);
        return ship.doneLevers();
    }

    public State turnOnSomeLevers(int[] leversNumbers) {
        if (ship == null)
            throw new IllegalArgumentException("There are no levers around. Board a ship first.");
        if (leversNumbers.length > ship.levers.length)
            throw new IllegalArgumentException("You can't pull more levers than there are on board.");
        for (int leversNumber : leversNumbers)
            ship.levers[leversNumber] = true;
        return ship.doneLevers();
    }

    public State turnOffSomeLevers(int[] leversNumbers) {
        if (ship == null)
            throw new IllegalArgumentException("There are no levers around. Board a ship first.");
        if (leversNumbers.length > ship.levers.length)
            throw new IllegalArgumentException("You can't pull more levers than there are on board.");
        for (int leversNumber : leversNumbers)
            ship.levers[leversNumber] = false;
        return ship.doneLevers();
    }
}
