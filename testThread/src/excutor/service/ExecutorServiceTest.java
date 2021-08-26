/**
 * 
 */
package excutor.service;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author ace2267
 *
 */
public class ExecutorServiceTest {

	/**
	 * 
	 */
	
    public static void main(String args[]) throws InterruptedException {
       
    	
    	try {
        	ExecutorService executor = Executors.newFixedThreadPool(4);

            executor.submit(() -> {
            	try {
            	     String threadName = Thread.currentThread().getName();
                     Thread.currentThread().sleep(1000);
                     System.out.println("Job1 " + threadName);
				} catch (Exception e) {
					e.printStackTrace();
				}
           
            });
            Thread.sleep(3000);
            executor.submit(() -> {
            	try {
           	     String threadName = Thread.currentThread().getName();
                    Thread.currentThread().sleep(1000);
                    System.out.println("Job2 " + threadName);
				} catch (Exception e) {
					e.printStackTrace();
				}
            });
            Thread.sleep(1000);
            executor.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("Job3 " + threadName);
            });
            Thread.sleep(1000);
            executor.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("Job4 " + threadName);
            });

            
            // ���̻� ExecutorService�� Task�� �߰��� �� �����ϴ�.
            // �۾��� ��� �Ϸ�Ǹ� ������Ǯ�� �����ŵ�ϴ�.

            // shutdown() ȣ�� ���� ��ϵ� Task �߿� ���� �Ϸ���� ���� Task�� ���� �� �ֽ��ϴ�.
            // Timeout�� 20�� �����ϰ� �Ϸ�Ǳ⸦ ��ٸ��ϴ�.
            // 20�� ���� �Ϸ�Ǹ� true�� �����ϸ�, 20�ʰ� ������ �Ϸ���� ������ false�� �����մϴ�.
            if (executor.awaitTermination(5, TimeUnit.SECONDS)) {

                executor.shutdown();
                System.out.println(LocalTime.now() + " All jobs are terminated");
            } else {
                System.out.println(LocalTime.now() + " some jobs are not terminated");

                // ��� Task�� ���� �����մϴ�.
                executor.shutdownNow();
            }

            System.out.println("end");
    	} catch (InterruptedException e1) {
			e1.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	

    }

}
