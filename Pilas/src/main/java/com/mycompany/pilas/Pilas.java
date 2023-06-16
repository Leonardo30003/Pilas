/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pilas;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Pilas {
    
    public static void main(String[] args) {
        GestorHistorial gestor = new GestorHistorial();
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingresa el nombre de la pagina web");
            String nombre = entrada.nextLine();
            System.out.println("Ingresa la direccion de la web");
            String direccion = entrada.nextLine();
            System.out.println("Desde que dispositivos ingresas");
            String dispositivo = entrada.nextLine();
            gestor.VisitarWeb(new PaginaWeb(nombre, direccion, new Date(), null, null, dispositivo));
        }
        gestor.historial();
        System.out.println("--------------------------------------");
        System.out.println(gestor.obtenerUltimaWebVisitada().toString());
        gestor.cerrarWeb();
        System.out.println(gestor.obtenerUltimaWebVisitada().toString());
        gestor.eliminarWeb();
        System.out.println(gestor.obtenerUltimaWebVisitada().toString());

        System.out.println("-----------------------------------------");
        System.out.println("Ingrese el dispositivo delque quieres obtener el historial");
        String dispositivo = entrada.nextLine();
        System.out.println(gestor.obtenerVisitaDispositivos(dispositivo).toString());
        
        
    }
}
