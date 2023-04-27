public class Cafe {
    protected float gramosCafe;

    protected int mililitrosAgua;
    protected char tamaño;

    public Cafe(float gramosCafe, int mililitrosAgua, char tamaño) {
        this.gramosCafe= gramosCafe;
        this.mililitrosAgua= mililitrosAgua;
        this.tamaño=tamaño;

    }

    public char getTamaño() {
        return tamaño;
    }

    public float getGramosCafe() {
        return gramosCafe;
    }

    public int getMililitrosAgua() {
        return mililitrosAgua;
    }

    public void setGramosCafe(float gramosCafe) {
        this.gramosCafe = gramosCafe;
    }

    public void setTamaño(char tamaño) {
        this.tamaño = tamaño;
    }

    public void setMililitrosAgua(int mililitrosAgua) {
        this.mililitrosAgua = mililitrosAgua;
    }
    public static void main(String[] args) {
    }


}
