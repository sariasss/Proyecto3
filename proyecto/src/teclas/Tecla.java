package teclas;

import java.awt.*;


public abstract class Tecla implements Medible,Pulsable{
    protected Point posicion;
    private int nota;
    private boolean pulsada;
    private Color colorPulsada;
    private Graphics graphics;
    Tecla(int n){
        this.nota=n;
        this.posicion=null;
        this.colorPulsada=null;
    }
    public int getNumeroNota(){
        return this.nota;
    }
    @Override
    public int getAnchura(){
        return 0;
    }
    @Override
    public int getAltura(){
        return 0;
    }
    @Override
    public void setPosicion(int x, int y){
        this.posicion= new Point(x,y);
    }
    @Override
    public void setGraphics(Graphics g){
        this.graphics=g;
    }
    @Override
    public void dibujar(){

    }
    protected abstract int[] getVerticesX();
    protected abstract int [] getVerticesY();

}
