package sampleRobot;

import robocode.AdvancedRobot;
import robocode.RobotDeathEvent;
import robocode.ScannedRobotEvent;


/**
 * MyClass - a class by (Kousuke Takeuchi)
 */

public class RobotActivity extends AdvancedRobot
{
	private EnemyManager em;
	
	public void run() {
		em = new EnemyManager(this);
	}
	
	public void onScannedRobot(ScannedRobotEvent e) {
		em.updateOnScannedRobot(e);
	}
	
	public void onRobotDeath(RobotDeathEvent e) {
		em.updateOnRobotDeath(e);
	}

	
}
		