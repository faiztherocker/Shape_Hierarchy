package shape_hirerachy;

public abstract class ThreeDimensionalShape implements Shape{

	private double area;
	private double volume;
	
	public  ThreeDimensionalShape() {
		area = 0;
		volume = 0;
	}
	public void setArea(double ar){
		area = ar;
	}
	public double getArea(){
		return area; 
	}
	public void setVolume(double vol){
		volume = vol;
	}
	public double getVolume(){
		return volume; 
	}
	public abstract void calculateVolume();
	@Override
	public String toString(){
		return String.format("%s", "Three Dimesional Shape");
	}
}
