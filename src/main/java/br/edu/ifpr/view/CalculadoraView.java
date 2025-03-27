/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import br.edu.ifpr.controller.CalculadoraController;

/**
 *
 * @author efbaro
 */
public class CalculadoraView extends JFrame {

    private CalculadoraController calculadoraController = new CalculadoraController();

    private JTextField campoNumero1;
    private JTextField campoNumero2;
    private JTextField campoResultado;
    private JButton botaoSomar;
    private JButton botaoSubtrair;
    private JButton botaoMultiplicar;
    private JButton botaoDividir;

    public CalculadoraView() {

        setTitle("Calculadora");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        campoNumero1 = new JTextField(10);
        campoNumero2 = new JTextField(10);
        campoResultado = new JTextField(10);
        campoResultado.setEditable(false); // Campo de resultado não pode ser editado

        botaoSomar = new JButton("Somar");
        botaoSubtrair = new JButton("Subtrair");
        botaoMultiplicar = new JButton("Multiplicar");
        botaoDividir = new JButton("Dividir");

        add(new JLabel("Numero 1:"));
        add(campoNumero1);
        add(new JLabel("Numero 2:"));
        add(campoNumero2);
        add(new JLabel("Resultado:"));
        add(campoResultado);
        add(botaoSomar);
        add(botaoSubtrair);
        add(botaoMultiplicar);
        add(botaoDividir);

        // Ação do botão "Somar"
        botaoSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(campoNumero1.getText());
                    double num2 = Double.parseDouble(campoNumero2.getText());
                    campoResultado.setText(String.valueOf(calculadoraController.calculate(num1, num2, "addition")));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Erro: Entrada inválida!");
                }
            }
        });

        // Ação do botão "Subtrair"
        botaoSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(campoNumero1.getText());
                    double num2 = Double.parseDouble(campoNumero2.getText());
                    campoResultado.setText(String.valueOf(calculadoraController.calculate(num1, num2, "subtraction")));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Erro: Entrada inválida!");
                }
            }
        });

        // Ação do botão "Multiplicar"
        botaoMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(campoNumero1.getText());
                    double num2 = Double.parseDouble(campoNumero2.getText());
                    campoResultado.setText(String.valueOf(calculadoraController.calculate(num1, num2, "multiplication")));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Erro: Entrada inválida!");
                }
            }
        });

        // Ação do botão "Dividir"
        botaoDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(campoNumero1.getText());
                    double num2 = Double.parseDouble(campoNumero2.getText());

                    campoResultado.setText(String.valueOf(calculadoraController.calculate(num1, num2, "division")));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Erro: Entrada inválida!");
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        });
    }

}
