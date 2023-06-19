/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete;

import java.util.Scanner;
import static paquete.RoundRobin.RoundRobin;

/**
 *
 * @author sofia
 */
public class Main {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        System.out.print("Ingresa el número de procesos: ");
        int n = sc.nextInt();

        int[] arrivalTime = new int[n];
        int[] burstTime = new int[n];

        System.out.println("Ingresa los tiempos de llegada y ráfagas de cada proceso: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Tiempo de llegada del proceso " + (i + 1) + ": ");
            arrivalTime[i] = sc.nextInt();
            System.out.print("Ráfaga del proceso " + (i + 1) + ": ");
            burstTime[i] = sc.nextInt();
        }

        System.out.print("Ingresa el valor del quantum: ");
        int quantum = sc.nextInt();

        RoundRobin(arrivalTime, burstTime, quantum);

    }
}
