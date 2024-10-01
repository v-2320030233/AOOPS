public class Main 
{
    public static void main(String[] args) 
    {
        GameState gameState = GameState.getInstance();
        GameFactory easyFactory = new EasyGameFactory();
        EnemyFactory easyEnemyFactory = new EasyEnemyFactory();
        System.out.println("Starting Level: " + gameState.getCurrentLevel());
        gameState.addScore(100);
        System.out.println("Score: " + gameState.getScore());
        Enemy easyEnemy = easyEnemyFactory.createEnemy();
        easyEnemy.attack();
        Weapon easyWeapon = easyFactory.createWeapon();
        easyWeapon.use();
        PowerUp easyPowerUp = easyFactory.createPowerUp();
        easyPowerUp.activate();
        gameState.levelUp();
        GameFactory mediumFactory = new MediumGameFactory();
        EnemyFactory mediumEnemyFactory = new MediumEnemyFactory();
        System.out.println("\nStarting Level: " + gameState.getCurrentLevel());
        gameState.addScore(200);
        System.out.println("Score: " + gameState.getScore());
        Enemy mediumEnemy = mediumEnemyFactory.createEnemy();
        mediumEnemy.attack();
        Weapon mediumWeapon = mediumFactory.createWeapon();
        mediumWeapon.use();
        PowerUp mediumPowerUp = mediumFactory.createPowerUp();
        mediumPowerUp.activate();
        gameState.levelUp();
        GameFactory hardFactory = new HardGameFactory();
        EnemyFactory hardEnemyFactory = new HardEnemyFactory();
        System.out.println("\nStarting Level: " + gameState.getCurrentLevel());
        gameState.addScore(300);
        System.out.println("Score: " + gameState.getScore());
        Enemy hardEnemy = hardEnemyFactory.createEnemy();
        hardEnemy.attack();
        Weapon hardWeapon = hardFactory.createWeapon();
        hardWeapon.use();
        PowerUp hardPowerUp = hardFactory.createPowerUp();
        hardPowerUp.activate();
    }
}
