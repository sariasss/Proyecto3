package teclas;

import java.awt.*;

public class TeclaBlanca2 extends TeclaBlanca{
    TeclaBlanca2(int n){
        super(n);
    }

    @Override
    protected int[] getVerticesX() {
        int n = TeclaNegra.ANCHURA;
        int b = this.getAnchura();
        int[] verticesX = new int[8];
        verticesX[0] = posicion.x+n/2;
        verticesX[1] = posicion.x+b-n/2;
        verticesX[2] = posicion.x+b-n/2;
        verticesX[3] = posicion.x+b;
        verticesX[4] = posicion.x+b;
        verticesX[5] = posicion.x;
        verticesX[6] = posicion.x;
        verticesX[7] = posicion.x+n/2;
        return verticesX;

    }

    @Override
    protected int[] getVerticesY() {
        int[] verticesY = new int[8];
        verticesY[0] = posicion.y;
        verticesY[1] = posicion.y;
        verticesY[2] = posicion.y + TeclaNegra.ALTURA;
        verticesY[3] = posicion.y + TeclaNegra.ALTURA;
        verticesY[4] = posicion.y + this.getAltura();
        verticesY[5] = posicion.y + this.getAltura();
        verticesY[6] = posicion.y + TeclaNegra.ALTURA;
        verticesY[7] = posicion.y + TeclaNegra.ALTURA;
        return verticesY;
    }
}
