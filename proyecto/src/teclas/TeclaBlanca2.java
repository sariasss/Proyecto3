package teclas;

import java.awt.*;

public class TeclaBlanca2 extends TeclaBlanca{
    TeclaBlanca2(int n){
        super(n);
    };

    @Override
    protected int[] getVerticesX() {
        return new int[0];
    }

    @Override
    protected int[] getVerticesY() {
        return new int[0];
    }

    @Override
    public void setPosicion(int x, int y) {

    }

    @Override
    public void setGraphics(Graphics g) {

    }

    @Override
    public void dibujar() {

    }

    @Override
    public void pulsar() {

    }

    @Override
    public void soltar() {

    }

    @Override
    public boolean estaPulsado() {
        return false;
    }

    @Override
    public void setColorPulsado(Color c) {

    }

    @Override
    public Color getColorPulsado() {
        return null;
    }
}
