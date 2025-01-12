/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.CalculadoraModel;
import Vista.CalculadoraView;
import java.util.InputMismatchException;

/**
 *
 * @author rb940
 */
public class CalculadoraController {
    public CalculadoraModel model;
    public CalculadoraView view;
    
    //constructor
    public CalculadoraController(CalculadoraModel model, CalculadoraView view) {
        this.model = model;
        this.view = view;
    }
    public void iniciar(){
        boolean continuar = true;//para continuar con el programa  cuando se pone en el switch case para continiar con los demás casos
        
        while(continuar){//pues el while es para reperir hasta que continuar sea verdadero we
            try{
                String operacion = view.operaciones();
                if(operacion.equals("raiz")){
                   double numero = view.numerosdig("Ingrese el numero para la raiz cuadrada: ");
                   double resultado = model.raiz(numero);
                   view.Mostrar("la raiz de: "+numero+"es: "+resultado);
                
                
                }else{
                  double num1 = view.numerosdig("Ingrese el primer numero: ");
                  double num2 = view.numerosdig("Ingres el segundo numero: ");
                  double resultado = realizarOperacion(operacion, num1, num2);
                  view.Mostrar(num1+" "+operacion+" "+num2+" = "+resultado);
                }
                
           } catch(InputMismatchException e){
               view.error("ingrese un numero valido");
               view.numerosdig("reintente");
                    
           } catch(ArithmeticException e){
               view.error(e.getMessage());
           
           } finally {
               continuar = view.continuar();
          }
        }        
                        
          view.Mostrar("gracias, hasta luego");
            
        }
         private double realizarOperacion(String operacion, double num1, double num2){
        switch (operacion) {
            case "suma":
                return model.suma(num1, num2);
            case "resta":
                return model.resta(num1, num2);
            case "multiplicacion":
                return model.multiplicacion(num1, num2);
            case "division":
                return model.divicion(num1, num2);
            case "potencia":
                return model.potencia(num1, num2);
            default:
                throw new IllegalArgumentException("Operación no válida.");
        }
    }
    
}
