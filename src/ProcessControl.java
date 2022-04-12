import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ProcessControl {

    static Scanner in = new Scanner(System.in);
    static ArrayList<Pcb> ready = new ArrayList();		//就绪队列
    private int time;		//时间片
    private boolean cpu = true;		//处理机，true为空闲

    public void setTime() {
        System.out.print("设置时间片大小：");
        time = in.nextInt();
    }
    public int getTime() {
        return time;
    }
    public boolean getCpu() {
        return cpu;
    }

    public static void add(){		//创建进程
        System.out.print("输入需要创建的进程个数：");
        int pcbNum = in.nextInt();
        Random rand = new Random();        //随机生成需要的运行时间和优先级
        Pcb pcb = new Pcb();
        for(char num = 'A'; pcbNum > 0; pcbNum--,num++){
            pcb = new Pcb();
            pcb.setName(num);
            pcb.setNeedTime(rand.nextInt(15) + 1);
            pcb.setPriority(rand.nextInt(3) + 1);
            ready.add(pcb);
        }
        System.out.println("\n创建成功！\n");
        for(Pcb i : ready)
            System.out.println(i.toString());
    }



}
