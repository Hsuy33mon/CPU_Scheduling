package FCFS;
import ProcessProperties.Process;

public class First_come_First_served {

	public static void fcfs(Process[] processes){
        int l = processes.length;
        int total_burst_time = processes[0].burstTime;
        float avg = 0;
        System.out.println("Waiting time of process "+processes[0].processNum+": 0");
        for(int i =1; i<l;i++){
            int wt = total_burst_time-processes[i].arrivalTime;
            avg += wt;
            System.out.println("Waiting time of process "+processes[i].processNum+": "+wt);
            total_burst_time+=processes[i].burstTime;
        }

        avg = avg/l;
        System.out.printf("Average waiting time : %.2f ms",avg);
    }
}