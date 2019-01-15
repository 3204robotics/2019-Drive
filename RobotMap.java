package frc.robot;

// Prospective motor control import: import com.ctre.phoenix.motorcontrol.ControlMode;
//import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.DMC60;




/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
   public static int frontLeftMotorPort = 1;
   public static int backLeftMotorPort = 2;
   public static int frontRightMotorPort = 3;
   public static int backRightMotorPort = 4;
   

  public DMC60 frontLeftMotor, backLeftMotor;
   public VictorSPX frontRightMotor, backRightMotor;

   RobotMap() {

		// Apply port addresses to the robot
		frontLeftMotor = new DMC60(1);
	  backLeftMotor = new DMC60(2);
		frontRightMotor = new VictorSPX(3);
    backRightMotor = new VictorSPX(4);

  //frontLeftMotor.set();
  //backLeftMotor.set();
  //frontRightMotor.set();
  //backRightMotor.set();


  }

}
