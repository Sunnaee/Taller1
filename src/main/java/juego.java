import java.util.Random;

public class juego {
    public static void main(String[] args){
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
    public static void jugar(){
        String[][] mazo = inicializarCartasJuego(crearMatrizCartas());
        int jugador1 = 0;
        int jugador2 = 0;
        for(int i=0;i<3;i++){
            int obtenerPuntaje = obtenerCartas();
            jugador1 = jugador1 + Integer.parseInt(mazo[obtenerPuntaje][1]);
        }
        for(int i=0;i<3;i++) {
            int obtenerPuntaje = obtenerCartas();
            jugador2 = jugador2 + Integer.parseInt(mazo[obtenerPuntaje][1]);
        }
        System.out.println("El puntaje del jugador 1 es: "+jugador1);
        System.out.println("El puntaje del jugador 2 es: "+jugador2);
        if((jugador1 == 20 && jugador2 < 20) || (jugador1 <= 20 && jugador2 > 20)){
            System.out.println("El ganador es el jugador 1");
        }
        if((jugador2 == 20 && jugador1 < 20) || (jugador1 > 20 && jugador2 <= 20)){
            System.out.println("El ganador es el jugador 2");
        }
    }
    //menú
}