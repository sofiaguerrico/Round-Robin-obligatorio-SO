/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;


/**
 *
 * @author sofia
 */
public class RoundRobin {

    private static float averageWaitingTime;

    public static float getAverageWaitingTime() {
        return averageWaitingTime;
    }

    public static float getAverageResponseTime() {
        return averageResponseTime;
    }
    private static float averageResponseTime;
    public static void RoundRobin(int[] arrivalTime, int[] burstTime, int quantum) {
        int n = arrivalTime.length;
        int wt = 0, tat = 0;
        int remainingTime[] = new int[n];

        for (int i = 0; i < n; i++) {
            remainingTime[i] = burstTime[i];
        }

        int time = 0;
        int done = 0;

        while (done < n) {
            for (int i = 0; i < n; i++) {
                if (remainingTime[i] > 0) {
                    if (remainingTime[i] > quantum) {
                        time += quantum;
                        remainingTime[i] -= quantum;
                    } else {
                        time += remainingTime[i];
                        wt += time - arrivalTime[i] - burstTime[i];
                        remainingTime[i] = 0;
                        tat += time - arrivalTime[i];
                        done++;
                    }
                }
            }
        }
        
        averageWaitingTime = (float) wt / n;
        averageResponseTime = (float) tat / n;

        System.out.println("Tiempo promedio de espera = " + averageWaitingTime);
        System.out.println("Tiempo promedio de respuesta = " + averageResponseTime);
    }
    
    

}
