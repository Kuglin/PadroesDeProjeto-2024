public class RedheadhDuck extends Duck{

    @Override
    public void display() {
        
        System.out.println("REDHEAD");
        
    }

    RedheadhDuck() {

        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());

    }

}
