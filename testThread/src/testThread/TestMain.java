package testThread;

public class TestMain {

	public static void main(String[] args) {
	    // MyThread인스턴스를 2개 만듭니다. 
		TestThread t1 = new TestThread("*");
		TestThread t2 = new TestThread("-");

        t1.start();
        t2.start();
        System.out.print("!!!!!");  

        
        
	}

}
