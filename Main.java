package os;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
    	ProcessControl proCon = new ProcessControl();
        proCon.add();
        proCon.setTime();
        while(!proCon.ready.isEmpty()) {		//就绪队列不为空
        	if(proCon.getCpu() == true) {
        		proCon.ready.get(0).setRunTime(proCon.getTime());
        		System.out.println(proCon.ready.get(0).toString());

        		//进程是否到达需要运行的时间
        		if(proCon.ready.get(0).getNeedTime() > proCon.ready.get(0).getRunTime()) {
        			proCon.ready.add(proCon.ready.get(0));
        			proCon.ready.remove(0);
        		}
        		else {
        			System.out.println("进程" + proCon.ready.get(0).getName() + "结束\n");
        			proCon.ready.remove(0);
        		}
        	}	
        }

    }
    
    
}
