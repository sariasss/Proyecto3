package Test;

import bpc.daw.consola.Consola;
import bpc.daw.consola.FondoColorSolido;
import teclas.ElementoVisualTester;
import teclas.Tecla;
import teclas.TeclaFactory;

import java.awt.*;

public class ProgramaTestFactory {
    public static void main(String[] args) {
        Consola c= new Consola();
        c.getCapaFondo().setFondo(new FondoColorSolido(Color.gray));
        for (int i=60; i<=64;i++){
            Tecla t=TeclaFactory.crearTecla(i);
            ElementoVisualTester tester= new ElementoVisualTester(c.getCapaCanvas().getGraphics(),t);
            tester.hacerPrueba();
        }
    }
}
