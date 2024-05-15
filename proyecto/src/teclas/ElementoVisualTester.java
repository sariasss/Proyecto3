package teclas;

import bpc.daw.consola.Consola;
import bpc.daw.consola.FondoColorSolido;
import programa.MultiPiano;
import programa.Piano;
import programa.PianoSencillo;

import java.awt.*;

public class ElementoVisualTester {
    private Graphics graphics;
    private ElementoVisual elemento;

    public ElementoVisualTester(Graphics g, ElementoVisual e){
        this.graphics=g;
        this.elemento=e;
    }
    public ElementoVisualTester(ElementoVisual e){
        Consola consola = new Consola();
        consola.getCapaFondo().setFondo(new FondoColorSolido(Color.GRAY));
        this.graphics=consola.getCapaCanvas().getGraphics();
        e.setGraphics(this.graphics);
        this.elemento=e;

    }
    public void hacerPrueba(){
        this.elemento.setPosicion(120,90);
        this.elemento.setGraphics(this.graphics);
        this.elemento.dibujar();
        if (this.elemento instanceof Pulsable p){
            try {
                p.setColorPulsado(Color.BLUE);
                Thread.sleep(2000);
                p.pulsar();
                this.elemento.dibujar();
                Thread.sleep(2000);
                p.soltar();
                this.elemento.dibujar();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Piano t = new PianoSencillo(1,16);
        ElementoVisualTester e = new ElementoVisualTester(t);
        e.hacerPrueba();
    }
}