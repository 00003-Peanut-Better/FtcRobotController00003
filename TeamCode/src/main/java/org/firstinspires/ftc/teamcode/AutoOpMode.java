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
            continue;
        }
    }
}
