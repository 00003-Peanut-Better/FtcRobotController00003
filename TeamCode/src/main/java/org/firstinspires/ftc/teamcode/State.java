package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.subsystems.Robot;

public abstract class State {
    Robot robot;

    public State(Robot robot){
        this.robot = robot;
    }
    public abstract void enter();

    public abstract void run();

    public abstract void exit();
}
