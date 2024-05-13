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
        verticesX[0] = posicion.x;
        verticesX[1] = posicion.x+n/2;
        verticesX[2] = posicion.x+n/2;
        verticesX[3] = posicion.x+b-n/2;
        verticesX[4] = posicion.x+b-n/2;
        verticesX[5] = posicion.x+b;
        verticesX[6] = posicion.x+b;
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
        verticesY[6] = posicion.y + this.getAltura();
        verticesY[7] = posicion.y + this.getAltura();

        return verticesY;
    }
}
