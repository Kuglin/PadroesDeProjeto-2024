public class DefinirValorComEdificacao implements DefinirValorComportamento{

    @Override
    public float definirValor(float espaco, char localizacao, int comodos) {
        
        if (localizacao == 'A'){
            return espaco*3000 + (1000*comodos);
        }
        else if (localizacao == 'B'){
            return espaco*1000 + (1000*comodos);
        }
        else if (localizacao == 'C'){
            return espaco*500 + (1000*comodos);
        }
        
        return 0;
    }


}
