package shape_hirerachy;

public class Triangle extends TwoDimensionalShape{
	private double base ;
	private double height;
	
	public Triangle(double Tbase , double Theight ){
		setBase(Tbase);
		setHeight(Theight);
	}
	public void setBase(double Tbase){
		base = Tbase;
	}
	public double getBase(){
		return base;
	}
	public void setHeight(double THeight){
		height = THeight;
	}
	public double getHeight(){
		return height;
	}
	@Override
	public void calculateArea(){
		super.setArea((base*height)/2);
	}
	
	@Override
	public String toString(){
		this.calculateArea();
		return String.format("%s\n%s\n%s: %.2f\n%s: %.2f\n%s: %.2f", super.toString(),this.getClass(),"Base is:-",getBase(),"Height is:-",getHeight(),"Area:-",super.getArea());
	}
}
