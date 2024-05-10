package teclas;

import java.awt.*;

public class TeclaBlanca3 extends TeclaBlanca{
    TeclaBlanca3(int n){
        super(n);
    }

    @Override
    protected int[] getVerticesX() {
        int[] verticesX = new int[6];
        int x = this.getAnchura();
        verticesX[0] = (posicion.x + TeclaBlanca.ANCHURA)-(TeclaNegra.ANCHURA);
        verticesX[1] = (posicion.x + TeclaBlanca.ANCHURA);
        verticesX[2] = (posicion.x + TeclaBlanca.ANCHURA);
        verticesX[3] = posicion.x;
        verticesX[4] = posicion.x;
        verticesX[5] = (posicion.x + TeclaBlanca.ANCHURA)-(TeclaNegra.ANCHURA);
        return verticesX;
    }

    @Override
    protected int[] getVerticesY() {
        int[] verticesY = new int[6];
        int y = this.getAltura();
        verticesY[0] = posicion.y;
        verticesY[1] = posicion.y;
        verticesY[2] = posicion.y + TeclaBlanca.ALTURA;
        verticesY[3] = posicion.y + TeclaBlanca.ALTURA;
        verticesY[4] = posicion.y + TeclaNegra.ALTURA;
        verticesY[5] = posicion.y + TeclaNegra.ALTURA;
        return verticesY;
    }

}
