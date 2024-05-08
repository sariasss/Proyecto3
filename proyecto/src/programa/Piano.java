package programa;

import teclas.Tecla;

import java.awt.*;

public abstract class Piano {

    // PROPIEDADES
    private int teclaInicial;
    private int teclaFinal;
    protected Point posicion;
    protected Graphics graphics;

    // CONSTRUCTOR
    public Piano(int i, int tf){
        throw new UnsupportedOperationException("Método no implementado");
    }


    // MÉTODOS
    public void getTeclaInicial() {
        throw new UnsupportedOperationException("Método no implementado");
    }

    public void getTeclaFinal() {
        throw new UnsupportedOperationException("Método no implementado");
    }

    public abstract Tecla getTecla(int canal, int nota);


}
