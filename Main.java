package os;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
    	ProcessControl proCon = new ProcessControl();
        proCon.add();
        proCon.setTime();
        while(!proCon.ready.isEmpty()) {		//�������в�Ϊ��
        	if(proCon.getCpu() == true) {
        		proCon.ready.get(0).setRunTime(proCon.getTime());
        		System.out.println(proCon.ready.get(0).toString());

        		//�����Ƿ񵽴���Ҫ���е�ʱ��
        		if(proCon.ready.get(0).getNeedTime() > proCon.ready.get(0).getRunTime()) {
        			proCon.ready.add(proCon.ready.get(0));
        			proCon.ready.remove(0);
        		}
        		else {
        			System.out.println("����" + proCon.ready.get(0).getName() + "����\n");
        			proCon.ready.remove(0);
        		}
        	}	
        }

    }
    
    
}
