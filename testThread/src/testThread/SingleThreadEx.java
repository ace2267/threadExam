package testThread;

public class SingleThreadEx extends Thread {
	
    private int[] temp;
    
    public SingleThreadEx(String threadname){
		super(threadname);
		temp = new int[10];
			
		for(int start=0;start<temp.length;start++){
			temp[start]=start;
		}
    }
	
    public void run(){
	    
    	for(int start:temp){
			try {
				Thread.sleep(1000);
					
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("�������̸�:"+currentThread().getName());
			System.out.println("temp value :"+start);
	    }
    }
	
    public static void main(String[] args) {
    	
    	System.out.println("abcdeddd");
    	SingleThreadEx st = new SingleThreadEx("ù��°");
    	st.start();
    	System.out.println("efffffff");
    }
    
}
