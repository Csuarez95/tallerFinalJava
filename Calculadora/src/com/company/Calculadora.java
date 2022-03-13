package com.company;
/**
 * @author Cristian Suárez Acosta.
 * @version v1.0
 */

import java.util.Scanner;

public class Calculadora {

    //Declaración de variable para almacenamiento de resultado
    public float numero;

    /**
     * Método que captura del dato que es ingresado por consola.
     * @return Retorna el valor de tipo float ingresado por teclado en consola.
     */
    public float capturarNumero(){
        Scanner input = new Scanner(System.in);
        return input.nextFloat();
    } // Cierre del método capturarNumero.

    /**
     * Método que captura el operador que es ingresado por consola.
     * @return Retorna el operador ingresado por teclado en consola.
     */
    public String capturarOperador(){
        Scanner input1 = new Scanner(System.in);
        return input1.nextLine();
    } // Cierre del método capturarOperador.

    /**
     * Método que captura el valor para determinar si se reinicia o apaga la calculadora.
     * @return Retorna el valor ingresado por teclado.
     */
    public int capturarReinicio(){
        Scanner input2 = new Scanner(System.in);
        return input2.nextInt();
    } // Cierre del método capturarReinicio.

    /**
     * Método que solicita el valor del número.
     */
    public void solicitarNumero(){
        System.out.println("Ingrese el valor para operar (Si es decimal, utilice coma (,))");
    } // Cierre del método solicitarNumero.

    /**
     * Método que solicita el operador.
     */
    public void solicitarOperador(){
        System.out.println("Ingrese el operador suma(+), resta(-), multiplicación(*), división(/), residuo(%)");
    } // Cierre del método solicitarOperador.

    /**
     * Metodo para el cálculo de las operaciones.
     * @param valor1 Es el primer parámetro que se ingresa por teclado.
     * @param valor2 Es el segundo parámetro que se ingresa por teclado para realizar el cálculo.
     * @param operador Recibe el símbolo del operador para realizar la operación correspondiente.
     * @return Retorna el resultado de la operación realizada.
     */
    public float operacion(float valor1, float valor2, String operador){
        switch (operador){
            case "+" -> {
                numero = valor1 + valor2;
                break;
            }
            case "-" -> {
                numero = valor1 - valor2;
                break;
            }
            case "*" -> {
                numero = valor1 * valor2;
                break;
            }
            case "/" -> {
                if (valor2 == 0){
                    numero = 0;
                } else {
                    numero = valor1 / valor2;
                }
                break;
            }
            case "%" -> {
                numero = valor1 % valor2;
                break;
            }
        } //Cierre del switch case.
        return numero;
    } //Cierre del método operación.

} //Cierre de la clase calculadora
