package teclas;

import java.awt.*;

public class TeclaBlanca2 extends TeclaBlanca{

    TeclaBlanca2(int n) {
        super(n);
    }

    @Override
    protected int[] getVerticesX() {
        int[] verticesX = new int[8];
        verticesX[0] = posicion.x;
        verticesX[1] = posicion.x + (TeclaNegra.ANCHURA/2);
        verticesX[2] = posicion.x + (TeclaNegra.ANCHURA/2);
        verticesX[3] = (posicion.x + TeclaBlanca.ANCHURA)-(TeclaNegra.ANCHURA/2);
        verticesX[4] = (posicion.x + TeclaBlanca.ANCHURA)-(TeclaNegra.ANCHURA/2);
        verticesX[5] = posicion.x + TeclaBlanca.ALTURA;
        verticesX[6] = posicion.x + TeclaBlanca.ALTURA;
        verticesX[7] = posicion.x;
        return verticesX;

    }

    @Override
    protected int[] getVerticesY() {
        int[] verticesY = new int[8];
        verticesY[0] = posicion.y + TeclaNegra.ALTURA;
        verticesY[1] = posicion.y + TeclaNegra.ALTURA;
        verticesY[2] = posicion.y;
        verticesY[3] = posicion.y;
        verticesY[4] = posicion.y + TeclaNegra.ALTURA;
        verticesY[5] = posicion.y + TeclaNegra.ALTURA;
        verticesY[6] = posicion.y + TeclaBlanca.ALTURA;
        verticesY[7] = posicion.y + TeclaBlanca.ALTURA;
        return verticesY;
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
