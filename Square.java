package shape_hirerachy;

public class Square extends TwoDimensionalShape{
	
	private double side ;
	public Square(double side){
		setSide(side);
	}
	public void setSide(double si){
		side = si;
	}
	public double getSide(){
		return side;
	}
	@Override
	public void calculateArea(){
		super.setArea(Math.pow(getSide(), 2));
	}
	
	@Override
	public String toString(){
		this.calculateArea();
		return String.format("%s\n%s\n%s: %.2f\n%s: %.2f", super.toString(),this.getClass(),"Side is:-",getSide(),"Area:-",super.getArea());
	}
}
