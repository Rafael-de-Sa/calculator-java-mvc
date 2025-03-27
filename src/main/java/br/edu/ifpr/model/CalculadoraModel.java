/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.model;

/**
 *
 * @author Aluno
 */
public class CalculadoraModel {

    public double chooseOperation(Double num1, Double num2, String operation) {
        double result = 0;
        if (operation.equals("division")) {
            result = division(num1, num2);
        }
        if (operation.equals("multiplication")) {
            result = multiplication(num1, num2);
        }
        if (operation.equals("addition")) {
            result = addition(num1, num2);
        }
        if (operation.equals("subtraction")) {
            result = subtraction(num1, num2);
        }
        return result;
    }

    private double division(double num1, double num2) {
        validadeDivision(num2);
        return num1 / num2;
    }

    private void validadeDivision(double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Erro: Divisão por 0 inválida!");
        }
    }

    private double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    private double addition(double num1, double num2) {
        return num1 + num2;
    }

    private double subtraction(double num1, double num2) {
        return num1 - num2;
    }
}
