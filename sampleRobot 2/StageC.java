package robocode;


public class StageC{
	Enemy enemy = EnemyManager.getEnemiesAsIterator();
	//�Ƃ肠����������₷�����\�b�h�����������čs��������
	public double onShootingBullet(double myX, double myY, double enemyX, double enemyY){
		double shootEnergy;
		double total = 30.0;
		double tooFar = 300.0;
		double tooNear = 10.0;
		double absRange = Math.sqrt(Math.pow(myX - enemyX, 2) + Math.pow(myY - enemyY, 2));
		if (absRange > tooFar) shootEnergy = 0.1;
		else if (absRange > tooNear) shootEnergy = shootEnergy / absRange;
		else shootEnergy = 3.0;
		//���˕�����ݒ肷��
		
		return shootEnergy;
	}
	


}
