package sampleRobot;
import math;


public class StageC{
	Enemy enemy = EmenyManager.getEnemiesAsIterator();
	//�Ƃ肠����������₷�����\�b�h�����������čs��������
	public double onShootingBullet(double myX, double myY, double enemyX, double enemyY){
		double shootEnergy;
		double total = 30.0;
		double tooFar = 300.0;
		double tooNear = 10.0;
		double absRange = sqrt(pow(myX - enemyX, 2) + pow(myY - enemyY, 2));
		if (absRange > tooFar) shootEnergy = 0.1;
		else if (absRange > tooNear) shootEnergy = shootEnergy / absRange;
		else shootEnergy = 3.0;
		//���˕�����ݒ肷��
		
		return shootEnergy;
	}
	


}
