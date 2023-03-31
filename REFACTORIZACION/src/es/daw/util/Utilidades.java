package es.daw.util;

/**
 * @author Carlos Martin Salvatierra
 */
public class Utilidades {

    // Ejercicio 1: simplificar una estructura condicional
    public static void exercise1(int x) {
        String message = (x > 0) ? "El número es positivo" : "El número es negativo o cero";
        System.out.println(message);
    }

    // Ejercicio 2: extraer una constante final
    public static void exercise2(int x) {
        final int MAX_NUMBER = 10;
        String message = (x > MAX_NUMBER) ? "El número es mayor que 10" : "El número es menor o igual que 10";
        System.out.println(message);
    }

    // Ejercicio 3: renombrar variables para mejorar la legibilidad
    public static void exercise3(int numItems, double itemPrice) {
        double totalPrice = numItems * itemPrice;
        System.out.println("El precio total es: " + totalPrice);
    }

    // Ejercicio 4: separar una función larga en funciones más pequeñas
    public static double exercise4(double x, double y) {
        double sum = add(x, y);
        double diff = subtract(x, y);
        double product = multiply(x, y);
        double quotient = divide(x, y);
        return average(sum, diff, product, quotient);
    }

    private static double add(double x, double y) {
        return x + y;
    }

    private static double subtract(double x, double y) {
        return x - y;
    }

    private static double multiply(double x, double y) {
        return x * y;
    }

    private static double divide(double x, double y) {
        return x / y;
    }

    private static double average(double... nums) {
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }

    // Ejercicio 5: eliminar código duplicado
    public static void exercise5(int x, int y) {
        String message;
        if (x > y) {
            message = "El primer número es mayor";
        } else if (x < y) {
            message = "El segundo número es mayor";
        } else {
            message = "Los números son iguales";
        }
        System.out.println(message);
    }

    // Ejercicio 6: simplificar el código redundante
    public static void exercise6(int x) {
        String message;
        if (x <= 2) {
            message = "El número es pequeño";
        } else if (x <= 4) {
            message = "El número es mediano";
        } else {
            message = "El número es grande";
        }
        System.out.println(message);
    }

}
