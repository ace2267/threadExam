package testThread;

public class TestMain {

	public static void main(String[] args) {
	    // MyThread�ν��Ͻ��� 2�� ����ϴ�. 
		TestThread t1 = new TestThread("*");
		TestThread t2 = new TestThread("-");

        t1.start();
        t2.start();
        System.out.print("!!!!!");  

        
        
	}

}
