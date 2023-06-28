package abstractFactory;

public class magicFactory implements AbstractFactory{
    @Override
    public Food createFood() {
        return new MushRoom();
    }

    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }
}
