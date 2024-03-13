public class MallardDuck extends Duck{

    @Override
    public void display() {
        
        System.out.println("MALLARD");
        
    }

    MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());

    }

}
