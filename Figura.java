package FiguraGeometrica;

public abstract class Figura {
    private int numeroLados;

    Figura(){
    }

    Figura(int numeroLados){
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados(){
        return numeroLados;
    }

    public abstract int calcularPerimetro();

    public abstract float calcularArea();

    @Override
    public String toString() {
        return "Esta figura tiene " + numeroLados + " numero de lados.";
    }

    
}
