package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

public class RobotDriveSubsystem extends Subsystem {

//   public static int frontLeftMotorPort = 0;
//   public static int slaveLeftMotorPort = 1;
//   public static int frontRightMotorPort = 4;
//   public static int slaveRightMotorPort = 3;

    //Speed Controller Variables
    private Victor frontLeft = new Victor(RobotMap.frontLeftMotorPort);
    private Victor frontRight = new Victor(RobotMap.frontRightMotorPort);
    private Victor slaveLeft = new Victor(RobotMap.slaveLeftMotorPort);
    private Victor slaveRight = new Victor(RobotMap.slaveRightMotorPort);

    //Establish Drive
    private RobotDrive robotDrive = new RobotDrive(frontLeft, slaveLeft, frontRight, slaveRight);

    //Shifter Variables
    DoubleSolenoid shifter = new DoubleSolenoid(RobotMap.doubleSolenoidPortOne,RobotMap.shifterForwardPort,RobotMap.shifterReversePort);

    //Encoder Variable
    Encoder rightEncoder = new Encoder(RobotMap.rightEncoderPortOne,RobotMap.rightEncoderPortTwo);
    Encoder leftEncoder = new Encoder(RobotMap.leftEncoderPortOne, RobotMap.leftEncoderPortTwo);

    //Gyro Variable
    AnalogGyro gyro = new AnalogGyro(RobotMap.gyroPort);

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new TankDrive());
    }

    //Default Constructor
    public RobotDriveSubsystem(){
        super();
        shifter.set(DoubleSolenoid.Value.kReverse);
    }

    public void makeTankDrive(double leftSpeed, double rightSpeed){
        robotDrive.tankDrive(leftSpeed, rightSpeed);
    }

    public void shiftDrive(){
        if(shifter.get() == DoubleSolenoid.Value.kForward) {
            shifter.set(DoubleSolenoid.Value.kReverse);
        }
        else if(shifter.get()==DoubleSolenoid.Value.kReverse){
            shifter.set(DoubleSolenoid.Value.kForward);
        }
    }

    public void resetEncoders(){
        leftEncoder.reset();
        rightEncoder.reset();
    }

    public int retrieveEncoderValueLeft(){
        return leftEncoder.get();
    }

    public int retrieveEncoderValueRight(){
        return rightEncoder.get();
    }

    public void resetGyro(){
        gyro.reset();
    }

    public double retrieveGyroAngle(){
        return gyro.getAngle();
    }

}