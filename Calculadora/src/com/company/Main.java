package com.company;

/**
 * Representación de una calculadora tradicional para sumar el valor almacenado anteriormente
 * @author Cristian Suárez Acosta
 * @version v1.0
 */

public class Main {

    public static void main(String[] args) {

        //Declaración de variables globales.
        boolean bandera = true, banderaPrincipal = true, bandera1 = true;
        float num1 = 0, num2 = 0, total = 0;

        //Impresión de mensaje inicial.
        System.out.println("Bienvenido a la calculadora");
        System.out.println("Proceda a realizar las operaciones que desee");

        //Renderización de la clase.
        Calculadora Calculo = new Calculadora();

        //Ciclo principal para utilizar siempre la calculadora.
        while (banderaPrincipal == true){
            //Condicional para almacenar la primera vez el número ingresado por teclado.
            if (bandera == true){
                Calculo.solicitarNumero();
                num1 = Calculo.capturarNumero();
                bandera = false;
            } //Cierre de condicional para almacenamiento del valor ingresado por primera vez.

            Calculo.solicitarOperador();
            String operador = Calculo.capturarOperador();

            //Condicional para validación de ingreso del operando correspondiente.
            if ("+".equals(operador) || "-".equals(operador) || "*".equals(operador) || "/".equals(operador) ||
            "%".equals(operador)){
                Calculo.solicitarNumero();
                num2 = Calculo.capturarNumero();
                //Comprobación para la división por 0.
                if (num2 == 0){
                    System.out.println("Error, no es posible realizar la división por 0");
                    //Comprobación para reciniciar o apagar calculadora.
                    System.out.println("¿Desea reiniciar? \n 1. Si \n 2. No (Se apaga calculadora)");
                    int reinicio = Calculo.capturarReinicio();
                    if (reinicio == 1 ? (bandera = true) : (banderaPrincipal = false)); //Cierre de comprobación.
                } else {
                    //Impresión de resultado de la operación,
                    System.out.println("El resultado es:");
                    total = Calculo.operacion(num1, num2, operador);
                    System.out.println(total);
                    //Almacenamiento del valor total en la variable num1 para conservar resultado.
                    num1 = total;
                } // Cierre de comprobación división por 0.
            } else {
                System.out.println("Operador inválido, Ingrese nuevamente");
            } //Cierre de validación del operador ingresado.
        } //Cierre del ciclo principal.
        //Cierre del sistema.
        System.exit(0);
        } //Cierre del método para ejecución del programa.
    } //Cierre clase principal.

