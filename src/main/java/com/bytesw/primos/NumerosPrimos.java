package com.bytesw.primos;

public class NumerosPrimos {

    public static void main(String[] args) {
        int numeros = Integer.parseInt(args[0]);
        imprimirNumerosPrimos(numeros);
    }

    private static void imprimirNumerosPrimos(int numeros) {
        if (numeros < 0) {
            System.out.println("Cantidad de números ingresda incorrecta: " + numeros);
        }

        int contador = 0;
        int numeroActual = 0;

        while (contador < numeros) {
            if (esPrimo(numeroActual)) {
                System.out.println("[" + ++contador + "]" + numeroActual);
            }
            numeroActual++;
        }
    }

    private static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1) {
            return false;
        }

        for (int i = 2; i < numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

}
