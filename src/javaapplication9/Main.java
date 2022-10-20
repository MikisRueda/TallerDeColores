package javaapplication9;

public class Main {
    public static void main(String[] args){
        
        Brayaneitor b1 = new Brayaneitor();
        
        b1.setNombre("Brayaneitor");
        b1.setEdad(19);
        b1.setEquipofavorito("Atletico Bucaramanga");
        b1.setArma("Patecabra");
        
        b1.preguntar();
        b1.chuzar();
        b1.informacion();
    }
}
