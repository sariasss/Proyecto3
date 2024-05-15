package programa;

import bpc.daw.consola.*;
import java.awt.*;
import java.awt.event.KeyEvent;


public class Programa {
    public static void main(String[] args) throws InterruptedException {

        Consola consola = new Consola();
        CapaFondo capaFondo = consola.getCapaFondo();
        capaFondo.setFondo(new FondoColorSolido(new Color(237, 181, 255)));


        CapaTexto capaTexto = consola.getCapaTexto();
        Teclado teclado = consola.getTeclado();
        capaTexto.setColorTexto(Color.WHITE);
        capaTexto.print("Introduzca la ruta del archivo MIDI: ");
        String rutaArchivo = teclado.leerCadenaCaracteres();

        PianoSencillo piano = new PianoSencillo(24, 108);

        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Graphics graphics = capaCanvas.getGraphics();
        piano.setGraphics(graphics);
        piano.setPosicion(120, 90);
        piano.dibujar();

        ReproductorMidi reproductorMidi = new ReproductorMidi();
        reproductorMidi.conectar(piano);
        reproductorMidi.reproducir(rutaArchivo);

    }
}