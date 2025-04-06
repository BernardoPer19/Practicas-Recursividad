interface Persona {
    void comer();
    void hablar();
    void reir();
    void bolear();
}

class Persona implements Persona {
    @Override
    public void hablar() {
        System.out.println("ya pesh heja");
    }

    @Override 
    public void bolear() {
        System.out.println("el masista esta hablando");
    }

    @Override
    public void reir() {
        System.out.println("El Masista está riendo.");
    }
 
    @Override
    public void comer() {
        System.out.println("El masista come chuño");
    }

    @Override
    public void nadar() {
        System.out.println("El masista está nadando.");
    }

}
