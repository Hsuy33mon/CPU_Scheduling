package RR;
import ProcessProperties.Process;

public class Round_Robin {
	 public static void rrb(Process[] processes,int time){
	        int l = processes.length;
	        int[] remained_time = new int[l];
	        int[] processed_times = new int[l];
	        int[] waiting_time = new int[l];
	        int wt = 0;
	        float avg = 0;
	        for(int j = 0;j<l;j++){
	            remained_time[j]=processes[j].burstTime;
	        }

	        while(!checkAllProcessDone(remained_time)){
	            for(int i =0 ; i<l;i++){
	                if(remained_time[i]> time){
	                    remained_time[i] -= time;
	                    processed_times[i] +=1 ;
	                    wt += time;
	                }
	                else if(remained_time[i]<=time && waiting_time[i]==0){
	                    waiting_time[i] = wt;
	                    wt += remained_time[i];
	                    remained_time[i] = 0;
	                    
	                }
	            }
	        }

	        for(int j = 0;j<l;j++){
	            
	            waiting_time[j] = waiting_time[j]-processed_times[j]*time-processes[j].arrivalTime;
	            avg += waiting_time[j];
	            System.out.println("Waiting time of process "
	            +processes[j].processNum+": "+waiting_time[j]);
	        }

	        System.out.printf("Average waiting time : %.2f ms",avg/l);
	        
	    }

	    public static boolean checkAllProcessDone(int[] remained_time){
	        for(int i : remained_time){
	            if(i!=0){ return false; }
	        }
	        return true;
	    }

}
