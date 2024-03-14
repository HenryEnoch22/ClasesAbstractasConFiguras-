package FiguraGeometrica;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(4, 8, 4);
        Triangulo triangulo1 = new Triangulo(3, 5,5);

        System.out.println(rectangulo1.toString());
        System.out.println(triangulo1.toString());
        rectangulo1.cambiarDimenciones(2);
        System.out.println(rectangulo1.toString());

    }
}
