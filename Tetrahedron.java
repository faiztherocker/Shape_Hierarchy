package shape_hirerachy;
//area = sqroot 3 egde 2
//Volume = edge 3 / 6 sqroot 2
public class Tetrahedron extends ThreeDimensionalShape {
private double edge ;
	
	
	public Tetrahedron(double ed){
		setEdge(ed);
	}
	public void setEdge(double ed){
		edge = ed;
	}
	public double getEdge(){
		return edge;
	}
	@Override
	public void calculateArea(){
		super.setArea(Math.sqrt(3) * Math.pow(getEdge(), 2));
	}
	@Override
	public void calculateVolume(){
		super.setVolume(Math.pow(getEdge(), 3) / 6 * Math.sqrt(2));
	}
	
	@Override
	public String toString(){
		this.calculateArea();
		this.calculateVolume();
		return String.format("%s\n%s\n%s: %.2f\n%s: %.2f\n%s: %.2f", super.toString(),this.getClass(),"Edge is:-",getEdge(),"Area:-",super.getArea(),"Volume:-",super.getVolume());
	}
}
