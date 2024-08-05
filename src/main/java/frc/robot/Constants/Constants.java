package frc.robot.Constants;

public final class Constants {
    //Arm Constants --
        public static final int kArmMotorPort = 16;
        public static final double ampPos = 70;
        public static final double spkPos = 10;
        public static final double basePos= 0;

        public class ArmPIDConstants {
            public static final double kG = 0.25;
            public static final double kP = 1.5;
            public static final double kI = 0;
            public static final double kD = 0.2;
        }

        public class ShooterPIDConstants {
            public static final double kP = 1;
            public static final double kI = 0;
            public static final double kD = 0.1;
        }
    }