package teclas;

public class TeclaNegra extends Tecla{
    public static int ANCHURA=15;
    public static int ALTURA=50;

    TeclaNegra(int n){
        super(n);
    }

    @Override
    protected int[] getVerticesX() {
        return new int[0];
    }

    @Override
    protected int[] getVerticesY() {
        return new int[0];
    }
}
