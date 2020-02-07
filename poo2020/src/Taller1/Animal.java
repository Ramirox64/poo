package Taller1;

public class Animal {
    String especie;
    String tamaño;
    String peso;
    String alimentacion;
    String reproduccion;
    String clasificacion;
    public String obtener_especie(){
        return especie;
    }
    public String obtener_tamaño(){
        return tamaño;
    }
    public String obtener_peso(){
        return peso;
    }
    public String obtener_alimentacion(){
        return alimentacion;
    }
    public String obtener_reproduccion(){
        return reproduccion;
    }
    public String obtener_clasificacion() {
        return clasificacion;
    }
    public void actualizar_nombre(){
        this.especie=especie;
    }
    public void actualizar_obtener_Apellidos(){
        this.tamaño=tamaño;
    }
    public void actualizar_obtener_Nacionalidad(){
        this.peso=peso;
    }
    public void actualizar_obtener_Genero(){
        this.alimentacion=alimentacion;
    }
    public void actualizar_obtener_Identificacion(){
        this.reproduccion=reproduccion;
    }
    public void actualizar_obtener_Edad(){
        this.clasificacion=clasificacion;
    }


}


