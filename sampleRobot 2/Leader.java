package sampleRobot;

import java.util.HashMap;
import java.util.List;

import robocode.AdvancedRobot;
import robocode.MessageEvent;

/**
 * MyClass - a class by (your name here)
 */
public class Leader extends AdvancedRobot
{
	List<String> livingTeammateName;
	List<String> livingEnemyName;
	HashMap<String, EnemyManager> enemyStatus = new HashMap<String, EnemyManager>();
	
	
	public void onMessageRecieved(MessageEvent e) {
		if (e.getMessage() instanceof EnemyManager) {
			enemyStatus.put(e.getSender(), (EnemyManager)e.getMessage());
		} else {
			out.println(e.getMessage());
		}
	}
}
