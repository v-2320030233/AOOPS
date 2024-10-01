public class EasyEnemyFactory extends EnemyFactory 
{
    @Override
    public Enemy createEnemy()
    {
        return new EasyEnemy();
    }
}