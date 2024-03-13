public class DecoyDuck extends Duck{

    @Override
    public void display() {
        
        System.out.println("DECOY DUCK");
        
    }

    DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

}
