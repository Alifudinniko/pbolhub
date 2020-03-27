package thread;
class mainThread {
	public void jalan(String name) {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Thread: " + name + " posisi: " + i);
		}
	}
}
