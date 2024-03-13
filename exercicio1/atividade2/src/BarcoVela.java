public class BarcoVela extends Barco{

    BarcoVela(String nome){

        this.nome = nome;
        movementBehavior = new MovementVela();

    }

}
