package os;

public class Pcb {
    private char name;
    private int priority;
    private int needTime;
    private int runTime = 0;
    private String state;
    public char getName(){
        return name;
    }
    public void setName(char name){
        this.name = name;
    }
    public int getLevel(){
        return priority;
    }
    public void setPriority(int level){
        this.priority = level;
    }
    public int getNeedTime(){
        return needTime;
    }
    public void setNeedTime(int needTime){
        this.needTime = needTime;
    }
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setRunTime(int runTime) {
    	this.runTime += runTime;
    }
    public int getRunTime() {
    	return runTime;
    }
    
    public String toString(){
        return "进程名：" + name + "\n优先级：" + priority 
        			+ "\n需要运行的时间：" + needTime + "\n已运行时间：" + runTime + '\n';
    }
}
