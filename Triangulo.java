package FiguraGeometrica;

public class Triangulo extends Figura{
    private int anchura;
    private int altura;
    
    public Triangulo() {
    }

    
    public Triangulo(int numeroLados, int anchura, int altura) {
        super(numeroLados);
        this.anchura = anchura;
        this.altura = altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int calcularPerimetro(){
        return this.anchura * getNumeroLados();
    }

    @Override
    public float calcularArea(){
        return (float)(this.altura * this.anchura / 2.0);
    }


    @Override
    public String toString() {
        return super.toString() + " El triangulo de anchura " + anchura + " y altura " + altura  + " tiene un area de " + calcularArea() + " y un perimetro de " + calcularPerimetro();
    }

    
    
}
