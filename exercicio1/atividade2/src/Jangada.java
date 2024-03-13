public class Jangada extends Barco{

    Jangada(String nome){

        this.nome = nome;
        movementBehavior = new MovementRemo();

    }

}

