package teclas;

import java.awt.*;

public class TeclaBlanca1 extends TeclaBlanca {
    TeclaBlanca1(int n) {
        super(n);
    }

    @Override
    protected int[] getVerticesX() {
        int n=TeclaNegra.ANCHURA;
        int b=TeclaBlanca.ANCHURA;
        int[] verX=  new int[6];
        int x= posicion.x;
        verX[0]=x;
        verX[1]=x+b-n/2;
        verX[2]=x+b-n/2;
        verX[3]=x+b;
        verX[4]=x+b;
        verX[5]=x;

        return verX;
    }
    @Override
    protected int[] getVerticesY() {
        int[] verY= new int[6];
        int y=posicion.y;
        verY[0]=y;
        verY[1]=y;
        verY[2]=y+TeclaNegra.ALTURA;
        verY[3]=y+TeclaNegra.ALTURA;
        verY[4]=y+TeclaBlanca.ALTURA;
        verY[5]=y+TeclaBlanca.ALTURA;

        return verY;
    }


}