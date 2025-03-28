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

    private double num1, num2;

    private double getNum1() {
        return num1;
    }

    private void setNum1(double num1) {
        this.num1 = num1;
    }

    private double getNum2() {
        return num2;
    }

    private void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setViewValues(double num1, double num2) {
        setNum1(num1);
        setNum2(num2);
    }

    public double addition() {
        return getNum1() + getNum2();
    }

    public double subtraction() {
        return getNum1() - getNum2();
    }

    public double division() {
        validateDivision(getNum2());
        return getNum1() / getNum2();
    }

    private void validateDivision(double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Erro: Divisão por 0 inválida!");
        }
    }

    public double multiplication() {
        return getNum1() * getNum2();
    }

}
