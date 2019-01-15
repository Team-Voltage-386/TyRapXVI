package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class TankDrive extends Command {

    public TankDrive(){
        requires(Robot.drive_subsystem);
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        // Robot.driveSubsystem.driveArcade(Robot.oi.xboxControl.getRawAxis(RobotMap.driveLeftJoystickVertical),
        // Robot.oi.xboxControl.getRawAxis(RobotMap.driveRightJoystickHorizontal));
        SmartDashboard.putNumber("Encoder Number Left", Robot.drive_subsystem.retrieveEncoderValueLeft());
        SmartDashboard.putNumber("Encoder Number Right", Robot.drive_subsystem.retrieveEncoderValueRight());
        double leftSpeed  = OI.driverController.getRawAxis(RobotMap.leftJoystickY);
        double rightSpeed = OI.driverController.getRawAxis(RobotMap.rightJoystickY);
        Robot.drive_subsystem.makeTankDrive(leftSpeed, rightSpeed);
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }

}