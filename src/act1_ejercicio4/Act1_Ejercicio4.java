/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act1_ejercicio4;
import java.util.Scanner;
/**
 *
 * @author GLORIA PAULINA MORENO SALDIVAR
 */
public class Act1_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner asignar = new Scanner(System.in);
        double Precio, PrecioDesc;
        
        System.out.println("Ingrese el precio: ");
        Precio = asignar.nextDouble();
        if(Precio <= 100)
        {
            System.out.println("No se aplica descuento por lo que el precio es: " + Precio);
        }
        else if(Precio >= 100 && Precio <= 200)
        {
            PrecioDesc = Precio * 0.90;
            System.out.println("Se aplica el 10% de descuento por lo que el precio queda en: " + PrecioDesc);
        }
        else if(Precio >= 201 && Precio <= 500)
        {
            PrecioDesc = Precio * 0.80;
            System.out.println("Se aplica el 20% de descuento por lo que el precio queda en: " + PrecioDesc);
        }
        else if(Precio >= 501)
        {
            PrecioDesc = Precio * 0.75;
            System.out.println("Se aplica el 25% de descuento por lo que el precio queda en: " + PrecioDesc);
        }
    }
    
}
