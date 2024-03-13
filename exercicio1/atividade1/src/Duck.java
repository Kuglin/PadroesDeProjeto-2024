public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void swin(){

        System.out.println("NADANDO");

    };

    public abstract void display();

    public void performQuack(){

        quackBehavior.quack();

    }; 
    
    public void performFly(){

        flyBehavior.fly();

    }

    public void setFlyBehavior(FlyBehavior behavior) {

        this.flyBehavior = behavior;

    }

    public void setQuackBehavior(QuackBehavior behavior) {

        this.quackBehavior = behavior;

    }

}
