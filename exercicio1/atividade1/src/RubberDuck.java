public class RubberDuck extends Duck{

    @Override
    public void display() {
        
        System.out.println("RUBBERDUCK");
        
    }

    RubberDuck() {

        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());

    }

}
