package os;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ProcessControl {
	
    static Scanner in = new Scanner(System.in);
    static ArrayList<Pcb> ready = new ArrayList();		//��������	
    private int time;		//ʱ��Ƭ
    private boolean cpu = true;		//�������trueΪ����
    
    public void setTime() {
    	System.out.print("����ʱ��Ƭ��С��");
    	time = in.nextInt();
    }
    public int getTime() {
    	return time;
    }
    public boolean getCpu() {
    	return cpu;
    }
    
	public static void add(){		//��������
        System.out.print("������Ҫ�����Ľ��̸�����");
        int pcbNum = in.nextInt();
        Random rand = new Random();        //���������Ҫ������ʱ������ȼ�
        Pcb pcb = new Pcb();
        for(char num = 'A'; pcbNum > 0; pcbNum--,num++){
            pcb = new Pcb();
            pcb.setName(num);
            pcb.setNeedTime(rand.nextInt(15) + 1);
            pcb.setPriority(rand.nextInt(3) + 1);
            ready.add(pcb);
        }
        System.out.println("\n�����ɹ���\n");
        for(Pcb i : ready)
            System.out.println(i.toString());
    }
	
//	public boolean  isEmpty() {
//		if
//	}

}
