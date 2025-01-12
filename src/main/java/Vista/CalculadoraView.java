/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rb940
 */
public class CalculadoraView {
    Scanner scanner = new Scanner(System.in);
    
    //metodo para los numero ingresados
    public double numerosdig(String mensaje){
        double numero = 0;
        boolean valido = false;//para validar que sean numeros no lestras(xD)
         while(!valido){
             System.out.println(mensaje);
             try{ //para gestionar los errores como las letras que no son permitidos en el code
                 numero =scanner.nextDouble();
                 valido = true; //al fin un booleano jsjsjsjs
             }
             catch (InputMismatchException e){//a esta madre todo importar una package es pa validar we
                 System.out.println("Por favor ingrese un digito valido");
                 scanner.next();
             }
             
         }
         return numero;
    
    }
    //para preguntar la operacion
    public String operaciones(){
        System.out.println("Seleccione una operacion puede ser suma, resta, multiplicacion, divicion, potencia y raiz: ");
        return scanner.next();
    }
    //para mostrar el resultado de las operaciones
    public void Mostrar(String mensaje){
        System.out.println(mensaje);
    }
    //para mostrar error de elecion  
    public void error(String mensaje){
        System.out.println("Error "+ mensaje);
    }
    //por si quiere hacer otra operacion
    public boolean continuar(){
        System.out.println("Quieres realizar otra operacion? (si/no)");
        String respuesta = scanner.next();
        return respuesta.equalsIgnoreCase("si");//el .equalsIgnoreCase es para continuar con la respuesta asignada, por si es no para el programa
}
}
