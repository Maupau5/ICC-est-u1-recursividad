public class App {
    public static void main(String[] args) throws Exception {
        Recursividad rec = new Recursividad();
        int resultado = rec.factorial(5);
        System.out.println("El resultado es: "+resultado);

        System.out.println("La suma de consecutivos es: "+rec.sumaConsecutivos(5));

        System.out.println("La potencia del numero es: "+rec.potencial(5, 5));

        System.out.println("La suma de digitos es: " + rec.sumarDigitos(456));
    }
}
