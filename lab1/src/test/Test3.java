package test;

import main.task3.Person;
import main.task3.Spaceship;
import main.task3.State;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test3 {
    Person person;
    Spaceship spaceship;

    @Before
    public void createPerson() {
        person = new Person("Ford");
        spaceship = new Spaceship();
        person.boardSpaceship(spaceship);
    }

    @Test
    public void testAllLevers(){
        assertEquals(State.STILL, person.turnOnAllLevers());
        assertEquals(State.STILL, person.turnOffAllLevers());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidLevers() {
        person.turnOnSomeLevers(new int[spaceship.levers.length + 1]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoShip(){
        person.getOffSpaceship();
        person.turnOnAllLevers();
    }

    @Test
    public void testDirections() {
        assertEquals(State.MOVING_FORWARD, person.turnOnSomeLevers(new int[]{2}));
        assertEquals(State.STILL, person.turnOffSomeLevers(new int[]{2}));

        assertEquals(State.MOVING_BACK, person.turnOnSomeLevers(new int[]{1}));
        assertEquals(State.STILL, person.turnOffSomeLevers(new int[]{1}));

        assertEquals(State.MOVING_LEFT, person.turnOnSomeLevers(new int[]{4}));
        assertEquals(State.STILL, person.turnOffSomeLevers(new int[]{4}));

        assertEquals(State.MOVING_RIGHT, person.turnOnSomeLevers(new int[]{3}));
        assertEquals(State.STILL, person.turnOffSomeLevers(new int[]{3}));

    }

    @Test
    public void testLeversChain() {
        assertEquals(State.MOVING_FORWARD, person.turnOnSomeLevers(new int[]{2}));
        assertEquals(State.TURNING, person.turnOnSomeLevers(new int[]{4}));
        assertEquals(State.MOVING_FORWARD, person.turnOnSomeLevers(new int[]{3}));
        assertEquals(State.STILL, person.turnOnSomeLevers(new int[]{1}));
    }

    @Test
    public void testTaskSequence(){
        person.turnOnAllLevers();
        assertEquals(State.TURNING, person.turnOffSomeLevers(new int[]{1,3}));
        assertEquals(State.MOVING_FORWARD, person.turnOffSomeLevers(new int[]{4}));
    }

}
