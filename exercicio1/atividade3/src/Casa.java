public class Casa extends Imovel{

    Casa(int comodos, int espaco, char localizacao) {
        super(comodos, espaco, localizacao);
        valor = new DefinirValorComEdificacao();
    }


}
