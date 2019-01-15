/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  //DoubleSolenoid
  public static int doubleSolenoidPortOne = 1;
  
  //Drive Ports
  public static int frontLeftMotorPort = 0;
  public static int slaveLeftMotorPort = 1;
  public static int frontRightMotorPort = 4;
  public static int slaveRightMotorPort = 3;

  //Controller Ports
  public static int driverControllerPort = 0;
  public static int manipControllerPort = 100;

  //Ball Pickup Ports
  public static int limitSwitchPort = 4;
  public static int suckMotorPort = 2;

  //Okie Poker Ports
  public static int okiePokerAirSolenoidForwardPort = 2;
  public static int okiePokerAirSolenoidReversePort = 3;

  //Catapult Ports
  public static int shootResetSolenoidForwardPort = 0;
  public static int shootResetSolenoidReversePort = 1;
  public static int shootLockSolenoidForwardPort = 4;
  public static int shootLockSolenoidReversePort = 5;

  //Shifter Ports
  public static int shifterForwardPort = 6;
  public static int shifterReversePort = 7;

  //Controller Button Ports
  public static int leftJoystickY = 1;
  public static int rightJoystickY = 5;
  public static int okiePokerButtonPort = 1;
  public static int catapultButtonPort = 2;
  public static int shifterButtonPort = 3;
  public static int autoSquarePort = 4;

  //Encoder Ports
  public static int rightEncoderPortOne = 0;
  public static int rightEncoderPortTwo = 1;
  public static int leftEncoderPortOne = 2;
  public static int leftEncoderPortTwo = 3;

  //Gyro Port
  public static int gyroPort = 0;

}
