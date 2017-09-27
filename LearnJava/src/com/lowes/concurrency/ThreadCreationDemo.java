package com.lowes.concurrency;

public class ThreadCreationDemo {
	public static void main(String[] args) {
		ProcessThread pThread = new ProcessThread();
		pThread.start();

		ExecThread exec = new ExecThread();
		exec.run();

		// When we create Thread using Runnable Interface then we have to
		// implement through Thread constructor to execute the thread
		Thread execThread = new Thread(new ExecThread());
		execThread.start();

		new Thread(() -> System.out.println("Lambda Thread.")).start();
	}
}

class ProcessThread extends Thread {
	@Override
	public void run() {
		System.out.println("Process Thread Started..");
	}
}

class ExecThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Exec Thread Started..");
	}

}