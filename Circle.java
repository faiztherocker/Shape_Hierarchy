package shape_hirerachy;

public class Circle extends TwoDimensionalShape{
	
	private double radius ;
	public Circle(double radi){
		setRadius(radi);
	}
	public void setRadius(double radi){
		radius = radi;
	}
	public double getRadius(){
		return radius;
	}
	@Override
	public void calculateArea(){
		super.setArea(Math.PI * Math.pow(getRadius(), 2));
	}
	
	@Override
	public String toString(){
		this.calculateArea();
		return String.format("%s\n%s\n%s: %.2f\n%s: %.2f", super.toString(),this.getClass(),"Radius is:-",getRadius(),"Area:-",super.getArea());
	}
}
