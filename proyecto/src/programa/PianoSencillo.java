package programa;

import teclas.Tecla;

import java.util.Map;

public class PianoSencillo extends Piano {

    // PROPIEDADES
    private Map<Integer, Tecla> teclas;

    // CONSTRUCTOR
    public PianoSencillo(int teclaInicial, int teclaFinal) {
        super(teclaInicial,teclaFinal);

    }

    @Override
    public Tecla getTecla(int canal, int nota) {
        return null;
    }

}
