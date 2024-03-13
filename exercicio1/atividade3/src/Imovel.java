public abstract class Imovel {

    private int comodos;
    private float espaco;
    private char localizacao;

    DefinirValorComportamento valor;

    Imovel(int comodos, int espaco, char localizacao){

        this.comodos = comodos;
        this.espaco = espaco;
        this.localizacao = localizacao;

    }

    public float definirValor(){

        return valor.definirValor(espaco, localizacao, comodos);

    }
}
