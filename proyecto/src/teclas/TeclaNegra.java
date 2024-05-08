package teclas;

import bpc.daw.consola.Consola;

import java.awt.*;

public class TeclaNegra extends Tecla{
    public static int ANCHURA=15;
    public static int ALTURA=50;

    TeclaNegra(int n){
        super(n);
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
        return new int[0];
    }

    @Override
    protected int[] getVerticesY() {
        return new int[0];
    }
}
