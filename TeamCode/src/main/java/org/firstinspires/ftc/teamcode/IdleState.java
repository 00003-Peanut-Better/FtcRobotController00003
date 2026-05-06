package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.subsystems.Robot;

public class IdleState extends State{
    public IdleState(Robot robot) {
        super(robot);
    }

    @Override
    public void enter(){}

    @Override
    public void run() {
        robot.driveBase.drive(0,0,0);
    }

    @Override
    public void exit(){}
}
