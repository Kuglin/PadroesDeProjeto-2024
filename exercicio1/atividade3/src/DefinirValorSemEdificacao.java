public class DefinirValorSemEdificacao implements DefinirValorComportamento{

    @Override
    public float definirValor(float espaco, char localizacao, int comodos) {
        
        if (localizacao == 'A'){
            return espaco*1500;
        }
        else if (localizacao == 'B'){
            return espaco*750;
        }
        else if (localizacao == 'C'){
            return espaco*200;
        }
        
        return 0;
    }


}
