/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.controller;

import br.edu.ifpr.model.CalculadoraModel;
import br.edu.ifpr.view.CalculadoraView;

/**
 *
 * @author Aluno
 */
public class CalculadoraController {

    private CalculadoraModel calculadoraModel = new CalculadoraModel();
    private CalculadoraView calculadoraView;

    public CalculadoraController(CalculadoraView calculadoraView) {
        this.calculadoraView = calculadoraView;
    }

    public void setViewValues(double num1, double num2) {
        calculadoraModel.setViewValues(num1, num2);
    }

    public double addition() {
        calculadoraView.getValues();
        double result = calculadoraModel.addition();
        return result;
    }

    public double subtraction() {
        calculadoraView.getValues();
        double result = calculadoraModel.subtraction();
        return result;
    }

    public double multiplication() {
        calculadoraView.getValues();
        double result = calculadoraModel.multiplication();
        return result;
    }

    public double division() {
        calculadoraView.getValues();
        double result = calculadoraModel.division();
        return result;
    }

}
