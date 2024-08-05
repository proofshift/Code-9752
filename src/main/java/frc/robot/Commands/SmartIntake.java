// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.ArmSubsystem;
import frc.robot.Subsystems.IntakeSubsystem;
import frc.robot.Subsystems.ShooterSubsystem;
import frc.robot.Subsystems.TransferSubsystem;

public class SmartIntake extends Command {
  /** Creates a new SmartIntake. */

  IntakeSubsystem intake;
  TransferSubsystem transfer;
  ArmSubsystem arm;


  public SmartIntake(IntakeSubsystem i, TransferSubsystem t, ArmSubsystem a) {
    intake = i;
    transfer = t;
    arm = a;
    addRequirements(intake, transfer, arm);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    arm.setArmPosition(0);
    if (arm.armPositionReached) {
      intake.setIntake(.3);
      transfer.setTransfer(.1);
    }
    

    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
