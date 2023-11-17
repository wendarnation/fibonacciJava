package es.iessoterhernandez.daw.endes.fibonacci;

public class Fibonacci {
	public String calcularFibonacci(int caracteres) {
        StringBuilder fiboSecuencia = new StringBuilder();

        if (caracteres >= 1) {
            fiboSecuencia.append("0");
        }
        if (caracteres >= 2) {
            fiboSecuencia.append(",1");
        }

        while (fiboSecuencia.length() < caracteres * 2 - 1) {
            String[] numeros = fiboSecuencia.toString().split(",");
            long fibActual = Long.parseLong(numeros[numeros.length - 1]);
            long fibAnterior = Long.parseLong(numeros[numeros.length - 2]);
            long nuevoFib = fibActual + fibAnterior;
            fiboSecuencia.append(",").append(nuevoFib);
        }

        return fiboSecuencia.toString();
	}
	
	
}
