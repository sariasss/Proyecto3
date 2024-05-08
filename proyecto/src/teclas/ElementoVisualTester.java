package teclas;

import bpc.daw.consola.Consola;
import bpc.daw.consola.FondoColorSolido;

import java.awt.*;

public class ElementoVisualTester {
    private Graphics graphics;
    private ElementoVisual elemento;

    public ElementoVisualTester(Graphics g, ElementoVisual e){
        this.graphics=g;
        this.elemento=e;
    }
    public ElementoVisualTester(ElementoVisual e){
        this.elemento=e;
        Consola consola = new Consola();
        consola.getCapaFondo().setFondo(new FondoColorSolido(Color.GRAY));
        this.graphics=consola.getCapaCanvas().getGraphics();

    }
    public void hacerPrueba(){
        this.elemento.setPosicion(120,90);
        this.elemento.setGraphics(this.graphics);
        this.elemento.dibujar();
        if (this.elemento instanceof Pulsable){
            ((Pulsable) this.elemento).estaPulsado();
        }
        throw new UnsupportedOperationException("no programado");
    }

    public static void main(String[] args) {
        throw new UnsupportedOperationException("no programado");
    }
}

