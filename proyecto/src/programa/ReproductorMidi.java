package programa;

import teclas.Tecla;

import javax.sound.midi.*;
import java.awt.Color;
import java.io.File;

public class ReproductorMidi implements Receiver {

    // PROPIEDADES
    private static final Color[] COLORES = {
            Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE,
            Color.PINK, Color.CYAN, Color.MAGENTA, Color.GRAY, Color.LIGHT_GRAY,
            Color.DARK_GRAY, Color.BLACK, Color.WHITE, new Color(467532), new Color(0x663399), new Color(0x6699CC)
    };
    private Piano piano;

    // CONSTRUCTOR
    public ReproductorMidi() {
        this.piano = null;
    }

    // MÉTODOS
    public void conectar(Piano p) {
        this.piano = p;
    }

    public void reproducir(String ruta) {
        try {
            Sequence sequence = MidiSystem.getSequence(new File(ruta));
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            Transmitter transmitter = sequencer.getTransmitter();
            transmitter.setReceiver(this);
            sequencer.setSequence(sequence);
            sequencer.start();

            Thread.sleep(sequencer.getMicrosecondLength() / 1000);
            sequencer.stop();
            transmitter.close();
            sequencer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void send(MidiMessage message, long timeStamp) {
        if (!(message instanceof ShortMessage)) return;

        ShortMessage sm = (ShortMessage) message;
        int canal = sm.getChannel();
        if (canal == 9) return;

        int numNota = sm.getData1();
        int comando = sm.getCommand();
        int velocidad = sm.getData2();

        Tecla tecla = piano.getTecla(canal, numNota);
        if (tecla == null) return;

        if (comando == ShortMessage.NOTE_ON && velocidad > 0) {
            tecla.setColorPulsado(COLORES[canal % COLORES.length]);
            tecla.pulsar();
        } else if (comando == ShortMessage.NOTE_OFF || (comando == ShortMessage.NOTE_ON && velocidad == 0)) {
            tecla.soltar();
        }

        tecla.dibujar();
    }

    @Override
    public void close() {
    }
}

