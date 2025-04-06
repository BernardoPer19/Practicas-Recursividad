 interface Volador {
    void Moverse();
}

interface Nadador {
    void Moverse();    
}

class Pato extends Animal implements Volador, Nadador{
    private String color; 
    public Pato(String raza, int TiempoVida, String nombre, int numPatas, String genero ){
        super(raza,TiempoVida,nombre,numPatas,genero);
    }
    
    @Override
    public void respirar() {
        System.out.println("El Pato se está Moverse.");
    }
}




