import java.util.Random;

public class juego {
    public static void main(String[] args){
            String[][] mazo = inicializarCartasJuego(crearMatrizCartas());
            for(int i=0;i<12;i++){
                System.out.print(mazo[i][0]);
                System.out.println(mazo[i][1]);
            }
    }
    //crear Matriz de las cartas.
    public static String[][] crearMatrizCartas(){
        String[][] cartas = new String[12][2];
        return cartas;
    }
    //integer.parseInt()
    //agregar cartas.
    public static String[][] agregarCartas(String[][] matriz,String nombreCarta,String puntaje){
        for(int i=0;i<12;i++){
            if(matriz[i][0] == null){
                matriz[i][0] = nombreCarta;
                matriz[i][1] = puntaje;
                break;
            }
        }
        return matriz;
    }
    //inicializar cartas para el juego.
    public static String[][] inicializarCartasJuego(String[][] matriz){
        matriz = agregarCartas(matriz,"As","11");
        matriz = agregarCartas(matriz,"2","2");
        matriz = agregarCartas(matriz,"3","3");
        matriz = agregarCartas(matriz,"4","4");
        matriz = agregarCartas(matriz,"5","5");
        matriz = agregarCartas(matriz,"6","6");
        matriz = agregarCartas(matriz,"7","7");
        matriz = agregarCartas(matriz,"8","8");
        matriz = agregarCartas(matriz,"9","9");
        matriz = agregarCartas(matriz,"Jota","10");
        matriz = agregarCartas(matriz,"Quina","10");
        matriz = agregarCartas(matriz,"Kaiser","10");
        return matriz;
    }
    //obtener cartas
    public static int obtenerCartas(){
        Random numeroRandom = new Random();
        int posicionCarta = numeroRandom.nextInt(12);
        return posicionCarta;
    }
    //jugar
    //imprimir resultado
    //menú
}