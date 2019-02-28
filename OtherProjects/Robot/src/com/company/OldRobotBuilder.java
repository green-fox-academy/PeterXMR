package com.company;

public class OldRobotBuilder implements RobotBuilder {

    private Robot robot;

    public OldRobotBuilder(){
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Metal head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Metal Troso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Metal Arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Metal Legs");
    }

    public Robot getRobot(){
        return  this.robot;
    }
}
