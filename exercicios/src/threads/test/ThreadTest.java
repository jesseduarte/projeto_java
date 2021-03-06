package threads.test;

class ThreadExemplo extends Thread{
	private char c;
	
	public ThreadExemplo(char c) {
		this.c = c;
	}
	@Override
	public void run() { //onde executamos a thread. Se quiser que um codigo seja executado em paralelo, coloque ai dentro!
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 1000; i++) {
			System.out.print(c);
			if(i % 100 == 0) {
				System.out.println();
			}
		}
	}
}

class ThreadExemploRunnable implements Runnable { //Boa pr�tica!
	
	private char c;
	
	public ThreadExemploRunnable(char c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 1000; i++) {
			System.out.print(c);
			if(i % 100 == 0) {
				System.out.println();
			}
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); //exibir o nome da thread
		//ThreadExemplo t1 = new ThreadExemplo('A');
		//ThreadExemplo t2 = new ThreadExemplo('B');
		//ThreadExemplo t3 = new ThreadExemplo('C');
		//ThreadExemplo t4 = new ThreadExemplo('D');
		
		//Usando a classe ThreadExemploRunnable(inicio)
		
			Thread t1 = new Thread(new ThreadExemploRunnable('A')); //Estado: new (nova)
			Thread t2 = new Thread(new ThreadExemploRunnable('B'));
			Thread t3 = new Thread(new ThreadExemploRunnable('C'));
			Thread t4 = new Thread(new ThreadExemploRunnable('D'));
		
		//(fim)
		
		t1.start(); //iniciando a thread. Estado: Runnable(executando)
		t2.start();
		t3.start();
		t4.start();
	}
}