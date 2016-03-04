package shape_hirerachy;

public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[6];
		
		Circle circle = new Circle(24.00);
		Square square = new Square(20.00);
		Triangle triangle = new Triangle(12.00, 13.00);
		
		Cube cube = new Cube(6.00);
		Tetrahedron tetrahedron = new Tetrahedron(9.00);
		Sphere sphere = new Sphere(31.00);
		
		
		
		shapes[0] = circle;
		shapes[1] = square;
		shapes[2] = triangle;
		
		shapes[3] = cube;
		shapes[4] = tetrahedron;
		shapes[5] = sphere;
		
		for( Shape shap : shapes ){
			System.out.println(shap.toString());
			System.out.printf("\n\n");
		}
	}
	
	
	
}
