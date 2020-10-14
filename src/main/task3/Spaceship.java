package main.task3;

public class Spaceship {
    private final Engine engineFront = new Engine(1);
    private final Engine engineBack = new Engine(2);
    private final Engine engineLeft = new Engine(3);
    private final Engine engineRight = new Engine(4);
    public boolean[] levers = new boolean[5];
    State state = State.STILL;

    public State doneLevers() {
        engineFront.isOn = levers[engineFront.number];
        engineLeft.isOn = levers[engineLeft.number];
        engineRight.isOn = levers[engineRight.number];
        engineBack.isOn = levers[engineBack.number];
        return this.updateState();
    }

    private State updateState() {
        if (engineFront.isOn == engineBack.isOn && engineRight.isOn == engineLeft.isOn) {
            state = State.STILL;
            return state;
        }
        if (engineLeft.isOn == engineRight.isOn) {
            state = engineFront.isOn ? State.MOVING_BACK : State.MOVING_FORWARD;
            return state;
        }
        if (engineFront.isOn == engineBack.isOn)
            state = engineRight.isOn ? State.MOVING_LEFT : State.MOVING_RIGHT;
        else
            state = State.TURNING;
        return state;
    }
}
