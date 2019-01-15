package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;

public class BallPickup extends Command {

    public BallPickup(){
        requires(Robot.pickup_subsystem);
    }

    //Never Finished Unless Interrupted
    protected boolean isFinished(){
        return false;
    }

    //Execute Loop of Command
    protected void execute(){
        Robot.pickup_subsystem.setSuckSpeed(OI.driverController.getPOV());
    }

}