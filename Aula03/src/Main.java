public class Main {
    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercicio Quadrilatero com Return");

        double areaQuadrado = metodoReturnQuadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = metodoReturnQuadrilatero.area(5,5);
        System.out.println("Área do retangulo: " + areaRetangulo);

        double areaTrapezio = metodoReturnQuadrilatero.area(7, 8, 9);
        System.out.println("Área do trapezio: " + areaTrapezio);

    }
}