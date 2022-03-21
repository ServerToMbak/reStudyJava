
public class Main {
	public static void main(String[] args) {
		KronometreThread thread1=new KronometreThread("thread1");
	
		KronometreThread thread2=new KronometreThread("thread2");
		
		KronometreThread thread3=new KronometreThread("thread3");
		KronometreThread threads []= {thread1,thread2, thread3 };
		for(KronometreThread thread:threads) {
			thread.start();
		}
	}
}
