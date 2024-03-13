public class Bateira extends Barco{

    Bateira(String nome){

        this.nome = nome;
        movementBehavior = new MovementMotor();

    }

}
