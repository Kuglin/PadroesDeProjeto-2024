public class App {
    public static void main(String[] args) throws Exception {
        
        Casa casa = new Casa(1, 10, 'A');
        Terreno terreno = new Terreno(0, 10, 'B');

        System.out.println(casa.definirValor());
        System.out.println(terreno.definirValor());


    }
}
