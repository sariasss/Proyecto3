package programa;

import teclas.*;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PianoSencillo extends Piano {

    // PROPIEDADES
    private Map<Integer, Tecla> teclas;

    // CONSTRUCTOR
    public PianoSencillo(int teclaInicial, int teclaFinal) {
        super(teclaInicial,teclaFinal);
        this.teclas = new HashMap<>();

        for (int i = this.getTeclaInicial(); i < this.getTeclaFinal(); i++){
            this.teclas.put(TeclaFactory.crearTecla(i).getNumeroNota(),TeclaFactory.crearTecla(i));
        }
    }


    @Override
    public void dibujar() {
        Point punto = new Point(this.posicion.x, this.posicion.y);
        int x = punto.x;
        int y = punto.y;
        for (Tecla tecla : teclas.values()) {
            tecla.setGraphics(this.graphics);
            tecla.setPosicion(x, y);
            tecla.dibujar();
            if (tecla instanceof TeclaBlanca3){
                x +=tecla.getAnchura();
            }else {
                x +=tecla.getAnchura()- (TeclaNegra.ANCHURA/2);
            }

        }
    }

    @Override
    public Tecla getTecla(int canal, int nota) {
        return teclas.get(nota);
    }

}