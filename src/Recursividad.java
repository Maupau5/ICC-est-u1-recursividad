public class Recursividad {
    public int factorial(int n) {
        System.out.println("Calculando el factorial de: " + n);
        // Caso base: n = 0! y 1! sean iguales a 1
        if(n == 0 || n == 1) {
            System.out.println("Caso base alcanzado el factorial de " + n + " es 1");
            return 1;
        }
        int resultado = n * factorial(n-1);
        System.out.println("Resultado parcial para "+ n +" * factorial("+(n+1)+") = "+ resultado);
        return resultado;
        //return n * factorial(n-1);
    }

    // calcular la suma de los numero consecutivos
    // n = 5 resultado= 5+4+3+2+1 = 15
    public int sumaConsecutivos(int n) {
        System.out.println("Calculando el factorial de: " + n);
        // Caso base: n = 0! y 1! sean iguales a 1
        if(n == 1) {
            System.out.println("Caso base alcanzado el factorial de " + n + " es 1");
            return 1;
        }
        return n + sumaConsecutivos(n - 1);
    }

    // calcula la potencia de numero

    public int potencial(int base, int exponente) {
        if (exponente == 0) {
            return 1; 
        } else {
            return base * potencial(base, exponente - 1);
        }
    }

    // crear un metodo que sume los digitos de un numero si mando 456 sea igual a 15
    // 4+5+6 = 15
    // pista se una % mod
    public int sumarDigitos(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + sumarDigitos(n / 10);    }
    
}
