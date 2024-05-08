package teclas;

import java.awt.*;

public abstract class TeclaBlanca extends Tecla{

    public static final int ANCHURA = 25;
    public static final int ALTURA = 100;

    Tecla(int n){};


    public Color getColorNoPulsado() {
        throw new UnsupportedOperationException("No programado");
    }

    public int getAnchura() {
        return ANCHURA;
    }

    public int getAltura() {
        return ALTURA;
    }
}

