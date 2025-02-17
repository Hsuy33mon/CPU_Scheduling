package ProcessProperties;

public class Process {
	
	public int processNum ;
    public int arrivalTime;
    public int burstTime;
    public int priority;

    public Process(int num,int at,int bt,int p){
        this.processNum = num;
        this.arrivalTime = at;
        this.burstTime = bt;
        this.priority = p;
    }

	
}
