package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.subsystems.Robot;

@Autonomous(name="AutoOpMode", group="LinearOpMode")
public class AutoOpMode extends LinearOpMode {
    Robot robot;

    @Override
    public void runOpMode() throws InterruptedException {
        robot = new Robot(hardwareMap, gamepad1, gamepad2);

        waitForStart();

        while(opModeIsActive()) {
            wait(5000);
            robot.driveBase.drive(0.3, 0, 0);
            wait(3000);
            robot.driveBase.stop();
            wait(500);
            robot.driveBase.drive(0, 0, 0.1);
            wait(1000);
            robot.driveBase.stop();
            robot.driveBase.drive(0.3, 0, 0);
            wait(2000);
            robot.driveBase.stop();
        }
    }
}
