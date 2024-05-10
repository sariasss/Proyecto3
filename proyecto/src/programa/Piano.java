package programa;

import teclas.ElementoVisual;
import teclas.Tecla;

import java.awt.*;

public abstract class Piano implements ElementoVisual {

    // PROPIEDADES
    private int teclaInicial;
    private int teclaFinal;
    protected Point posicion;
    protected Graphics graphics;

    // CONSTRUCTOR
    public Piano(int ti, int tf){
        this.teclaInicial = ti;
        this.teclaFinal = tf;
    }


    // MÉTODOS
    public int getTeclaInicial() {
        return this.teclaInicial;
    }

    public int getTeclaFinal() {
        return this.teclaFinal;
    }

    public abstract Tecla getTecla(int canal, int nota);

    @Override
    public void setGraphics(Graphics g){
        this.graphics = g;
    }
    @Override
    public void setPosicion(int x, int y){
        this.posicion = new Point(x, y);
    }

    @Override
    public void dibujar(){

}
}