/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class OkiePokerSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private DoubleSolenoid okiePokerAirSolenoid = new DoubleSolenoid(RobotMap.doubleSolenoidPortOne,RobotMap.okiePokerAirSolenoidForwardPort,RobotMap.okiePokerAirSolenoidReversePort);

  public OkiePokerSubsystem(){
    super();
    okiePokerAirSolenoid.set(DoubleSolenoid.Value.kReverse);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    
  }

  public void movePoker(){
    if(okiePokerAirSolenoid.get() == DoubleSolenoid.Value.kForward) {
      okiePokerAirSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
    else if(okiePokerAirSolenoid.get()==DoubleSolenoid.Value.kReverse){
      okiePokerAirSolenoid.set(DoubleSolenoid.Value.kForward);
    }
  }

}
