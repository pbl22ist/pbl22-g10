package sampleRobot;

import java.util.HashMap;
import java.util.Iterator;

import robocode.AdvancedRobot;
import robocode.Robot;
import robocode.RobotDeathEvent;
import robocode.ScannedRobotEvent;

/**
 * MyClass - a class by (Kousuke Takeuchi)
 */
public class EnemyManager extends AdvancedRobot
{
	private static HashMap enemyList; // List of enemy inf.
	private Robot user; // Register Robot uses this class
	private int enemyNum = 0;
	
	// constructer
	public EnemyManager(Robot user) {
		this.user = user;
		enemyList = new HashMap();
		enemyNum = user.getOthers();
	}
	
	/**
	 * update information by ScannedRobotEvent
	 */
	@SuppressWarnings("unchecked")
	public boolean updateOnScannedRobot(ScannedRobotEvent e) {
		String name = e.getName();
		double heading = e.getHeading();
		double bearing = e.getBearing();
		double velocity = e.getVelocity();
		double distance = e.getDistance();
		double energy = e.getEnergy();
		if (!enemyList.containsKey(name)) {
			int id;
			// confirm whether any enemies 
			// are deleted on RobotDeathEvent
			if (!e.removeOnUpdate || e.enemyCnt < enemyNum - 1) {
				id = e.enemyCnt;
				e.enemyCnt++;
			}
			enemyList.put(name, new Enemy(name, bearing, heading,
							velocity, distance, energy, id));
			return false;
		} else {
			Enemy enemy = (Enemy)enemyList.get(name);
			if (!enemy.isAlive()) enemy.setAlive(true);
			// update information
			enemy.setHeading(heading);
			enemy.setBearing(bearing);
			enemy.setVelocity(velocity);
			enemy.setDistance(distance);
			enemy.setEnergy(energy);
			enemy.setAlive(true);
			return true;
		}
	}
	

	/**
	 * set flag on enemy robot deathing
	 */
	public boolean updateOnRobotDeath(RobotDeathEvent e) {
		if (!enemyList.containsKey(e.getName())) {
			return false;
		} else {
			Enemy enemy = (Enemy)enemyList.get(e.getName());
			enemy.setAlive(false);
			return true;
		}
	}
	
	/**
	 * return all enemy information as iterator
	 */
	public Iterator getEnemiesAsIterator() {
		return enemyList.values().iterator();
	}
	
	/**
	 * return robot on given name
	 */
	public Enemy get(String name) {
		return (Enemy)enemyList.get(name);
	}
}
			