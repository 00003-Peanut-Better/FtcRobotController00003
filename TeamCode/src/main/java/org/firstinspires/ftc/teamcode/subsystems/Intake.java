package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {
    public CRServo inmotor1;
    public CRServo inmotor2;

    final boolean INMOTORREVERSE = true;

    public Intake(HardwareMap map) {
        inmotor1 = map.get(CRServo.class, "intakeMotor1");
        inmotor2 = map.get(CRServo.class, "intakeMotor2");

        inmotor1.setDirection(INMOTORREVERSE ? DcMotorSimple.Direction.REVERSE : DcMotorSimple.Direction.FORWARD);
    }

    public void run_intake(boolean IntakeBool) {
        if (IntakeBool) {
            inmotor1.setPower(1);
            inmotor2.setPower(1);
        }
    }

    public void reverse_intake (boolean ReverseIntakeBool) {
        if (ReverseIntakeBool) {
            inmotor1.setPower(-1);
            inmotor2.setPower(-1);
        }
    }
}
