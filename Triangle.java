
public class Triangle extends GeometricObject {
	//declaration of sides with default values
  private double side1 = 1.0;
  private double side2 = 1.0;
  private double side3 = 1.0;
  
  	//constructor creating triangle with specified sides
  public Triangle(double side1, double side2, double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }
  
  //getter method for side 1
  public double getSide1() {
    return side1;
  }

  //setter method for side 1
  public void setSide1(double side1) {
    this.side1 = side1;
  }
  
  //getter method for side 2
  public double getSide2() {
    return side2;
  }
  
  //setter method for side 2
  public void setSide2(double side2) {
    this.side2 = side2;
  }
  
  //getter method for side 3
  public double getSide3() {
    return side3;
  }

  //setter method for side 3
  public void setSide3(double side3) {
    this.side3 = side3;
  }

  //method to calculate area
  public double getArea() {
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

//method to calculate perimeter
  public double getPerimeter() {
    return side1 + side2 + side3;
  }

  //string method that returns the sides of the triangle
  public String toString() {
    return "Triangle: side1 = " + side1 + " side2 = " + side2 +
      " side3 = " + side3 + super.toString();
  }

}
