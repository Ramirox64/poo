package Intropoo;

public class EjecutaTiempo {

    public static void main(String[] args) {
        //Creacion de objeto tiempo
        Tiempo tiempo = new Tiempo();
        tiempo.actualizar_hora(10);
        tiempo.actualizar_minuto(52);
        tiempo.actualizar_segundo(35);
        String mostrar_tiempo = tiempo.obtener_tiempo();
        System.out.println("La hora es:"+mostrar_tiempo);
    }
}
