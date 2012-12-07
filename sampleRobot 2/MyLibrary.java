package sampleRobot;

/**
 * MyClass - a class by (your name here)
 */
public class MyLibrary
{
	public double threeDimensionDistance(double d1, double d2, double d3) {
		return Math.sqrt(d1*d1 + d2*d2 + d3*d3);
	}
	public int getMin(double... distance) {
		double min = distance[0];
		int minNum = -1;
		for (int i=1; i<distance.length; i++) {
			if (min > Math.min(distance[i], min)) {
				min = distance[i];
				minNum = i;
			}
		}
		if (min > 0 && minNum >0) return minNum;
		return -1;
	}
}
