/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author Programming
 */
public class MetalGear extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    Talon frontLeft, frontRight, backLeft, backRight;
    Solenoid sol1, sol2;
    RobotDrive drive;
    
    Joystick stick, stick2;
    
    MetalGear MetalGear;
    
    public MetalGear(){
        frontLeft = new Talon(RobotMap.TALON1);
        frontRight = new Talon(RobotMap.TALON2);
        backLeft = new Talon(RobotMap.TALON3);
        backRight= new Talon(RobotMap.TALON4);
        
        sol1 = new Solenoid(RobotMap.SOL1);
        sol2 = new Solenoid(RobotMap.SOL2);
        
        drive = new RobotDrive(frontLeft, frontRight, backLeft, backRight);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void Forward(){
        drive.tankDrive(stick, stick2);
    }
    
    public void Shoot(){
        sol1.set(true);
        sol2.set(false);
    }
    
    public void Reload(){
        sol1.set(false);
        sol2.set(true);
        
    }
}
