package org.usfirst.frc.team6331.robot.commands;

import org.usfirst.frc.team6331.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class SuckCube extends InstantCommand {

    public SuckCube() {
        requires(Robot.claw);
    }

    // Called once when the command executes
    protected void initialize() {
    	Robot.claw.in();
    }
}
