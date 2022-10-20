package javaapplication9;

public class Brayaneitor {
    
    private String nombre;
    private String equipofavorito;
    private String arma;
    private int edad;
    
    Brayaneitor(){
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getEquipofavorito() {
        return equipofavorito;
    }


    public void setEquipofavorito(String equipofavorito) {
        this.equipofavorito = equipofavorito;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
    
    public void informacion(){
        System.out.println("Nombre: "+ nombre + "| Edad: " + edad + "| Equipo favorito: "+ equipofavorito + "| Arma: " + arma);
    }
    
    public void preguntar(){
        System.out.println(nombre+": Qhubo socio me regala la hora?");
    }
    
    public void chuzar(){
        System.out.println("* "+nombre+"usa su "+arma+" para chuzar a su victima y luego corre *");
    }
}
