/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author rb940
 */
public class CalculadoraModel {
    
    public double suma(double a, double b){
        return a+b;
    
    }
    
    public double resta(double a,double b){
        return a-b;
    
    }
    
    public double multiplicacion(double a,double b){
        return a*b;
    
    }
    public double divicion(double a, double b){
        if(b==0){
            System.out.println("Ingrese un numero diferente a 0");
        }
        return a/b;
        
    }
    //se agrega Math.pow para poder hacer la potencia del numero
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    
    //se agrega Math.sqrt para hacer la raiz de ese numero jsjsjs
    public double raiz(double a){
        if(a<0){
            System.out.println("Ingrese un numero diferente a 0");
        }
        return Math.sqrt(a);
        
    } 
}
    
  


