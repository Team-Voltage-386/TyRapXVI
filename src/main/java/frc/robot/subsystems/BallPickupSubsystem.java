package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.BallPickup;

public class BallPickupSubsystem extends Subsystem {

    private DigitalInput limitSwitch = new DigitalInput(RobotMap.limitSwitchPort);
    private Victor suckMotor = new Victor(RobotMap.suckMotorPort);

    protected void initDefaultCommand(){
        setDefaultCommand(new BallPickup());
    }

    public void setSuckSpeed(int POV){
        if(limitSwitch.get() && POV == 0) {                     //Suck In
            suckMotor.set(-0.5);
            //SmartDashboard.putString("Debug Thing", "negative");
          }
          else if(POV == 180) {                                 //Suck Out
            suckMotor.set(0.5);
            //SmartDashboard.putString("Debug Thing", "positive");
          }
          else{                                                 //No Suck
            suckMotor.set(0);
            //SmartDashboard.putString("Debug Thing", "none");
          }
    }
    
    public void suckUp(){
        suckMotor.set(-0.5);
    }

}