package shape_hirerachy;
//Area = 4 pi r2
//Volume = 4/3 pi r3
public class Sphere extends ThreeDimensionalShape{
	
	private double radius ;
	
	
	public Sphere(double radi){
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
		super.setArea(4 * Math.PI * Math.pow(getRadius(), 2));
	}
	@Override
	public void calculateVolume(){
		super.setVolume(4/3 * Math.PI * Math.pow(getRadius(), 3));
	}
	
	@Override
	public String toString(){
		this.calculateArea();
		this.calculateVolume();
		return String.format("%s\n%s\n%s: %.2f\n%s: %.2f\n%s: %.2f", super.toString(),this.getClass(),"Radius is:-",getRadius(),"Area:-",super.getArea(),"Volume:-",super.getVolume());
	}
}
