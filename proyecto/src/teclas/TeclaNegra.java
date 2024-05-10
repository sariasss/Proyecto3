package teclas;

import java.awt.*;

public class TeclaNegra extends Tecla{
    public static int ANCHURA=15;
    public static int ALTURA=50;

    TeclaNegra(int n){
        super(n);
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

    public Color getColorNoPulsado(){
        return Color.BLACK;
    }

    public int getAltura(){
        return ALTURA;
    }

    public int getAnchura(){
        return ANCHURA;
    }
    @Override
    protected int[] getVerticesX() {
        int[] verticesX = new int[4];
        int x = this.getAnchura();
        verticesX[0] = posicion.x;
        verticesX[1] = posicion.x + x;
        verticesX[2] = posicion.x + x;
        verticesX[3] = posicion.x;
        return verticesX;

    }

    @Override
    protected int[] getVerticesY() {
        int[] verticesY = new int[4];
        int y = this.getAltura();
        verticesY[0] = posicion.y;
        verticesY[1] = posicion.y;
        verticesY[2] = posicion.y + y;
        verticesY[3] = posicion.y + y;
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
}



