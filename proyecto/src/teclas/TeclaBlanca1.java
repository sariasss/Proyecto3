package teclas;

import java.awt.*;

public class TeclaBlanca1 extends TeclaBlanca{
    TeclaBlanca1(int n){
        super(n);

    }

    @Override
    protected int[] getVerticesX() {
        int[] verticesX = new int[6];
        verticesX[0] = posicion.x;
        verticesX[1] = (posicion.x + TeclaBlanca.ANCHURA)-(TeclaNegra.ANCHURA/2);
        verticesX[2] = (posicion.x + TeclaBlanca.ANCHURA)-(TeclaNegra.ANCHURA/2);
        verticesX[3] = posicion.x + TeclaBlanca.ANCHURA;
        verticesX[4] = posicion.x + TeclaBlanca.ANCHURA;
        verticesX[5] = posicion.x;
        return verticesX;
    }
    @Override
    protected int[] getVerticesY() {
        int[] verticesY = new int[6];
        verticesY[0] = posicion.y;
        verticesY[1] = posicion.y;
        verticesY[2] = posicion.y + TeclaNegra.ALTURA;
        verticesY[3] = posicion.y + TeclaNegra.ALTURA;
        verticesY[4] = posicion.y + TeclaBlanca.ALTURA;
        verticesY[5] = posicion.y + TeclaBlanca.ALTURA;
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

    ;
}
