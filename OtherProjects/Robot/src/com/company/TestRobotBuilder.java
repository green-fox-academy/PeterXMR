package com.company;


public class TestRobotBuilder {

    public static void main(String[] args) {

	RobotBuilder oldStyleRobot = new OldRobotBuilder();

	RobotDirector robotDirector = new RobotDirector(oldStyleRobot);

	robotDirector.makeRobot();

	Robot firstRobot = robotDirector.getRobot();

		System.out.println("Robot Built");

		System.out.println("Robot Head Type: " + firstRobot.getRobotHead());

		System.out.println("Robot Head Torso: " + firstRobot.getRobotTorso());

		System.out.println("Robot Head Arm: " + firstRobot.getRobotArms());

		System.out.println("Robot Head Leg: " + firstRobot.getRobotLegs());
    }
}
