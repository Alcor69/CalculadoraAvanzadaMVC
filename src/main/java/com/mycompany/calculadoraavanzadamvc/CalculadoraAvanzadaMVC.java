/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraavanzadamvc;

import Controlador.CalculadoraController;
import Modelo.CalculadoraModel;
import Vista.CalculadoraView;

/**
 *
 * @author rb940
 */
public class CalculadoraAvanzadaMVC {

    public static void main(String[] args) {
        CalculadoraModel m = new CalculadoraModel();
        CalculadoraView v = new CalculadoraView();
        CalculadoraController c = new CalculadoraController(m ,v);
        
        System.out.println("****** Calculadora MVC *******");
        c.iniciar();
    }
}
