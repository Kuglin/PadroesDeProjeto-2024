public class App {

    public static void main(String[] args) {
        
        MallardDuck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();

        DecoyDuck decoy = new DecoyDuck();

        decoy.performFly();
        decoy.performQuack();
    
    }

}
