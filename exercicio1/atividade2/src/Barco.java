public abstract class Barco {

    public MovementBehavior movementBehavior;
    public String nome;

    public void mover(){

        movementBehavior.movement();

    };

}
