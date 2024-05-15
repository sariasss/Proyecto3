package programa;

import teclas.Tecla;
import teclas.TeclaBlanca;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MultiPiano extends Piano{
    private List<PianoSencillo> pianos;

    public MultiPiano(int teclaInicio, int teclaFinal) {
        super(teclaInicio, teclaFinal);
        this.pianos= new ArrayList<>();
        for (int i=0; i<16;i++){
            this.pianos.add(new PianoSencillo(teclaInicio, teclaFinal));
        }
    }

    @Override
    public Tecla getTecla(int canal, int nota) {
        return this.pianos.get(canal).getTecla(0,nota);
    }
    @Override
    public void dibujar() {
        int x = this.posicion.x;
        int x2= this.getTeclaFinal()*TeclaBlanca.ANCHURA-500;
        int y = this.posicion.y-200;
        int y2= this.posicion.y-200;
        for (int i=0;i<this.pianos.size();i++) {
            if (i<8){
                y+=TeclaBlanca.ALTURA+20;
                this.pianos.get(i).setPosicion(x,y);
            }else{
                y2+=TeclaBlanca.ALTURA+20;
                this.pianos.get(i).setPosicion(x2,y2);
            }
            this.pianos.get(i).setGraphics(this.graphics);
            this.pianos.get(i).dibujar();
        }
    }
}
