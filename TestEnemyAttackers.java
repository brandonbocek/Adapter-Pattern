package Adapter;

public class TestEnemyAttackers {
	public static void main(String[] args){
		
		EnemyTank rx7Tank = new EnemyTank();
		EnemyRobot fred2000 = new EnemyRobot();
		EnemyAttacker robotAdapter = new EnemyRobotAdapter(fred2000);
		
		
		System.out.println("The Robot\n");
		
		fred2000.reactToHuman("Paul");
		fred2000.walkForward();
		fred2000.smashWithHands();
		
		System.out.println("\nEnemy Tank\n");
		
		rx7Tank.assignDriver("Bob");
		rx7Tank.driveForward();
		rx7Tank.fireWeapon();
		
		System.out.println("\nThe Robot with Adapter\n");
		
		robotAdapter.assignDriver("Mark");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
		
	}

}
