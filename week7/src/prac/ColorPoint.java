package prac;

class ColorPoint extends MyPoint {
	private String color;
	private int x;
	private int y;
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}
