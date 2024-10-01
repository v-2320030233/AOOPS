public class MediumGameFactory extends GameFactory
{
    @Override
    public Weapon createWeapon()
    {
        return new MediumWeapon();
    }
    @Override
    public PowerUp createPowerUp()
    {
        return new MediumPowerUp();
    }
}