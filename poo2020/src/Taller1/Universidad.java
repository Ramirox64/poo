package Taller1;

import com.sun.javafx.geom.CubicApproximator;

public class Universidad {
    private String nombre;
    private String Ubicacion;
    private String Infraestructura;
    private String carreras;
    private String Area;
    private String Tipo_uni;
    private String calificacion;

    public String obtener_Nombre() {
        return nombre;
    }
    public String obtener_Ubicacion() {
        return Ubicacion;
    }
    public String obtener_Infraestructura() {
        return Infraestructura;
    }
    public String obtener_carreras() {
        return carreras;
    }
    public String obtener_Area() {
        return Area;
    }
    public String obtener_Tipo_uni() {
        return Tipo_uni;

    }public String obtener_calificacion() {
        return calificacion;
    }
    public void actualizar_Nombre(){
        this.nombre = nombre;

    }
    public void  actualizar_ubicacion(){
        this.Ubicacion= Ubicacion;
    }
    public void  actualizar_Infraestructura(){
        this.Ubicacion=Ubicacion;
    }
    public void  actualizar_carreras(){
        this.carreras=carreras;
    }
    public void  actualizar_Area(){
        this.Area=Area;
    }
    public void  actualizar_Tipo_uni(){
        this.Tipo_uni=Tipo_uni;
    }
    public void  calificacion(){
        this.calificacion=calificacion;
    }
}





