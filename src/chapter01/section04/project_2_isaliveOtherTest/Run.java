package chapter01.section04.project_2_isaliveOtherTest;

public class Run {
	
	public static void main(String[] args) {
		CountOperate c = new CountOperate();
		c.setName("opeThread222");
		Thread t1 = new Thread(c);
		System.out.println("main begin t1 isAlive=" + t1.isAlive());
		t1.setName("Thread-A");
		t1.start();
		System.out.println("main end t1 isAlive=" + t1.isAlive());
	}
}

// main
// true
// thread-01
//false

//A
//true
//thread-01
//true