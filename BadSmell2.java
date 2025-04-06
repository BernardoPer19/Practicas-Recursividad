interface Volador {
    void Moverse();
}

interface Moverse {
    void nadar();
}

class Animal implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El animal está moviendose.");
    }

    @Override
    public void nadar() {
        System.out.println("El animal está moviendose.");
    }
}
