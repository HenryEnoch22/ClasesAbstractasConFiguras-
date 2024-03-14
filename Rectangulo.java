package FiguraGeometrica;

public class Rectangulo extends Figura implements Redimencionar{
    private int anchura;
    private int altura;

    public Rectangulo(){
    }

    public Rectangulo(int numeroLados, int anchura, int altura) {
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
        return (this.anchura * 2) + (this.altura * 2);
    }

    @Override
    public float calcularArea(){
        return (float)(this.anchura * this.altura);
    }

    @Override
    public void cambiarDimenciones(int factor){
        this.altura *= factor;
        this.anchura *= factor;
    }

    @Override
    public String toString() {
        return super.toString() + " El rectangulo de anchura " + anchura + " y altura " + altura  + " tiene un area de " + calcularArea() + " y un perimetro de " + calcularPerimetro();
    }

    

    
    
}
