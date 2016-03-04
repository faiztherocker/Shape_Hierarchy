package shape_hirerachy;
// Volume = side 3
// Area = 6 side 2
public class Cube extends ThreeDimensionalShape{
private double side ;
	
	
	public Cube(double si){
		setSide(si);
	}
	public void setSide(double si){
		side = si;
	}
	public double getSide(){
		return side;
	}
	@Override
	public void calculateArea(){
		super.setArea(6 * Math.pow(getSide(), 2));
	}
	@Override
	public void calculateVolume(){
		super.setVolume(Math.pow(getSide(), 3));
	}
	
	@Override
	public String toString(){
		this.calculateArea();
		this.calculateVolume();
		return String.format("%s\n%s\n%s: %.2f\n%s: %.2f\n%s: %.2f", super.toString(),this.getClass(),"Side is:-",getSide(),"Area:-",super.getArea(),"Volume:-",super.getVolume());
	}
}
