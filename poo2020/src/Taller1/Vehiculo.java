package Taller1;

public class Vehiculo {
    String modelo;
    String color;
    String tamaño;
    String marca;
    String motor;
    String tipo;
    String capacidad;
    public String obtener_Nombre(){
        return modelo;
    }
    public String obtener_Apellido(){
        return color;
    }
    public String obtener_Nacionalidad(){
        return tamaño;
    }
    public String obtener_Genero(){
        return marca;
    }
    public String obtener_Identificacion(){
        return motor;
    }
    public String obtener_Edad() {
        return tipo;
    }
    public String obtener_capacidad() {
        return capacidad;
    }
    public void actualizar_nombre(){
        this.modelo=modelo;
    }
    public void actualizar_obtener_Apellidos(){
        this.marca=marca;
    }
    public void actualizar_obtener_Nacionalidad(){
        this.motor=motor;
    }
    public void actualizar_obtener_Genero(){
        this.tipo=tipo;
    }
    public void actualizar_obtener_Identificacion(){
        this.capacidad=capacidad;
    }
    public void actualizar_obtener_Edad(){
        this.capacidad=capacidad;
    }


}



