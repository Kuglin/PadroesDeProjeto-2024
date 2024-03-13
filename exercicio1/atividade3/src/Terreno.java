public class Terreno extends Imovel{

    Terreno(int comodos, int espaco, char localizacao) {
        super(comodos, espaco, localizacao);
        valor = new DefinirValorSemEdificacao();
    }

    

}
