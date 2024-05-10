package teclas;

import java.awt.*;

public abstract class TeclaBlanca extends Tecla{

    public static final int ANCHURA = 25;
    public static final int ALTURA = 100;

    TeclaBlanca(int n) {
        super(n);
    }


    public Color getColorNoPulsado() {
        return Color.WHITE;
    }

    public int getAnchura() {
        return this.ANCHURA;
    }

    public int getAltura() {
        return this.ALTURA;
    }
}

