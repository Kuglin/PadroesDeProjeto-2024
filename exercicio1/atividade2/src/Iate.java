public class Iate extends Barco{

    Iate(String nome){

        this.nome = nome;
        movementBehavior = new MovementMotor();

    }

}

