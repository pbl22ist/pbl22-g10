package sampleRobot;

import java.util.Comparator;

import robocode.AdvancedRobot;

/**
 * MyClass - a class by (Kousuke Takeuchi)
 */
public class EnergyComparator extends AdvancedRobot implements Comparator
{
	public boolean equals(Object o) {
		return this.equals(o);
	}
	
	public int compare(Object o1, Object o2) {
		return compare((Enemy)o1, (Enemy)o2);
	}
	
	public int compare(Enemy e1, Enemy e2) {
		double energy1 = e1.getEnergy();
		double energy2 = e2.getEnergy();
		if (energy1 > energy2) return 1;
		else if (energy1 < energy2) return -1;
		else return 0;
	}
}
