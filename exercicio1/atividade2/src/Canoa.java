public class Canoa extends Barco{

    Canoa(String nome){

        this.nome = nome;
        movementBehavior = new MovementRemo();

    }

}

