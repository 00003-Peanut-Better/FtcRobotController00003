package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Outtake {
    DcMotor outmotor1;
    DcMotor outmotor2;

    final boolean OUTMOTORREVERSE = true;

    public Outtake(HardwareMap map) {
        outmotor1 = map.get(DcMotor.class, "outtakeMotor1");
        outmotor2 = map.get(DcMotor.class, "outtakeMotor2");

        outmotor1.setDirection(OUTMOTORREVERSE ? DcMotorSimple.Direction.REVERSE : DcMotorSimple.Direction.FORWARD);
        outmotor2.setDirection(OUTMOTORREVERSE ? DcMotorSimple.Direction.REVERSE : DcMotorSimple.Direction.FORWARD);
    }

    public void outtake(boolean OuttakeBool) {
        if (OuttakeBool) {
            outmotor1.setPower(1);
            outmotor2.setPower(1);
        } else {
            outmotor1.setPower(0);
            outmotor2.setPower(0);
        }
    }

    public void reverse_outtake (boolean ReverseOuttakeBool) {
        if (ReverseOuttakeBool) {
            outmotor1.setPower(-1);
            outmotor2.setPower(-1);
        } else {
            outmotor1.setPower(0);
            outmotor2.setPower(0);
        }
    }
}
