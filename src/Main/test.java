package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import ProcessProperties.Process;
import FCFS.First_come_First_served;
import RR.Round_Robin;

public class test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("====================CPU Scheduling====================");
		// System.out.println("1. First_come First-Served(FCFS) \n2. Round-Robin \n");

		System.out.print("Enter the number of processes : ");
		int n = Integer.parseInt(bufferedReader.readLine());
		Process[] processes = new Process[n];
		System.out.println(" ");
		for (int i = 0; i < n; i++) {
			System.out.print("Enter process number : ");
			int num = Integer.parseInt(bufferedReader.readLine());

			System.out.print("Enter Arrival Time of process: ");
			int arrivalTime = Integer.parseInt(bufferedReader.readLine());

			System.out.print("Enter Burst Time of process : ");
			int burstTime = Integer.parseInt(bufferedReader.readLine());

			System.out.print("Enter Priority of Process : ");
			int priority = Integer.parseInt(bufferedReader.readLine());

			System.out.println(" ");
			Process p = new Process(num, arrivalTime, burstTime, priority);
			processes[i] = p;
		}

		System.out.println("First-Come First-Served (FCFS)");
		System.out.println("======================================");
		First_come_First_served.fcfs(processes);
		System.out.println("\n");
		System.out.println("Round Robin");
		System.out.println("======================================");
		System.out.print("Enter time quantum: ");
		int t = Integer.parseInt(bufferedReader.readLine());
		Round_Robin.rrb(processes, t);
	}
}
