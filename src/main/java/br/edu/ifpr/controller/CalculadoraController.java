/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.controller;

import br.edu.ifpr.model.CalculadoraModel;

/**
 *
 * @author Aluno
 */
public class CalculadoraController {

    private CalculadoraModel calculadoraModel = new CalculadoraModel();

    public double calculate(Double num1, Double num2, String operation) {
        return (calculadoraModel.chooseOperation(num1, num2, operation));
    }
}
