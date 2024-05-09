package teclas;

import java.awt.*;

public interface Pulsable {
    public void pulsar();
    public void soltar();
    public boolean estaPulsado();
    public void setColorPulsado(Color c);
    public Color getColorPulsado();
    public Color getColorNoPulsado();
    public default Color getColor(){
        throw new UnsupportedOperationException("no programado");
    }
}
