package testThread;

public class TestThread  extends Thread {

	String str;
    public TestThread(String str){
        this.str = str;
    }

    public void run(){
        for(int i = 0; i < 10; i ++){
            System.out.print(str);
            try {
                //��ǻ�Ͱ� �ʹ� ������ ������ �������� �� Ȯ�� �� �� ��� Thread.sleep() �޼��带 �̿��ؼ� ���ݾ� 
                //�����ٰ� ����� �� �ְ��Ѵ�. 
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } 
    } 

}
