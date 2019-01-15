/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class CatapultSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private DoubleSolenoid shootResetSolenoid = new DoubleSolenoid(RobotMap.doubleSolenoidPortOne,RobotMap.shootResetSolenoidForwardPort,RobotMap.shootResetSolenoidReversePort);
  private DoubleSolenoid shootLockSolenoid = new DoubleSolenoid(RobotMap.doubleSolenoidPortOne,RobotMap.shootLockSolenoidForwardPort,RobotMap.shootLockSolenoidReversePort);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void launchPartTwo() {
    shootLockSolenoid.set(DoubleSolenoid.Value.kForward);
    Timer.delay(1);
    shootResetSolenoid.set(DoubleSolenoid.Value.kReverse);
    Timer.delay(2.5);
    shootLockSolenoid.set(DoubleSolenoid.Value.kReverse);
    Timer.delay(0.5);
    shootResetSolenoid.set(DoubleSolenoid.Value.kForward);
    Timer.delay(1);
  }

}
