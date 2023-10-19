package prac;

class MyPoint {
	private int x, y;
	
	public MyPoint() {
			this.x = 0;
			this.y = 0;
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}
