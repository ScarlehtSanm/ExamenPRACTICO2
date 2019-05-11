/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exapract2;


import javax.swing.JOptionPane;

/**
 *
 * 
 * 
 */
public class exapract2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Problema: Crear un programa que permita registrar datos de una planilla de trabajadores (“n”
trabajadores), por cada empleado se ingresará: Nombre del empleado, Salario x hora y la cantidad de
horas trabajadas.
 El programa debe mostrar al final por medio de un JOPtionPane el detalle de la planilla y el total de la
planilla. En otro Cuadro de dialogo se mostrará el nombre del empleado que más gano en esa planilla.
        
        Integrantes 
        Vanessa Scarleth Sanchez Mejia 
        Nestor Alexis Fajardo Protillo
    */
     int cant=0;
     int j=0;
     double mayor=0;
     double totalPlanilla=0;
     String detallePlanilla="Detalle de planilla: \n";
     cant=Integer.parseInt(JOptionPane.showInputDialog
        ("Cuantos empleados desea ingresar?"));
    
     String nombre[]=new String[cant];
     double salarioHora[]=new double [cant];
     int horasTra[]=new int[cant];
     double sueldo[]=new double[cant];
     for(int i=0;i<cant;i++){
         nombre[i]=JOptionPane.showInputDialog
        ("Nombre del empleado: ",+ (i+1));
         salarioHora[i]=Double.parseDouble(JOptionPane.showInputDialog
        ("Salario x Hora $: "));
         horasTra[i]=Integer.parseInt(JOptionPane.showInputDialog
        ("Horas Trabajadas: "));
         
         sueldo[i]=salarioHora[i]*horasTra[i];
         totalPlanilla+= sueldo[i];
         detallePlanilla+= "nombre: " + nombre[i] + "\n" + "Salario por Hora $:" + salarioHora[i]
                 + "\n" + "Horas Trabajadas: " + horasTra[i] + "\n" + "Salario devengado: " + sueldo[i] + "\n\n";
         
         if (sueldo[i]>mayor){
             j=i;
             mayor=sueldo[i];
         }
        
        }
     
     JOptionPane.showMessageDialog(null,detallePlanilla + "Total Planilla: " + totalPlanilla + "\n\n");
      JOptionPane.showMessageDialog(null,"El empleado que mas gano fue: " + nombre[j]);
    }
    
}
