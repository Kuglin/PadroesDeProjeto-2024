public class Apartamento extends Imovel{

    Apartamento(int comodos, int espaco, char localizacao) {
        super(comodos, espaco, localizacao);
        valor = new DefinirValorComEdificacao();
    }

}
