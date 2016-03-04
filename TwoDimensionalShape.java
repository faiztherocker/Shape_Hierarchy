package shape_hirerachy;

public abstract class TwoDimensionalShape implements Shape {
	private double area;
	
	public TwoDimensionalShape(){
		area = 0;
	}
	public void setArea(double ar){
		area = ar;
	}
	public double getArea(){
		return area; 
	}
	@Override
	public String toString(){
		return String.format("%s", "Two Dimesional Shape");
	}
}
