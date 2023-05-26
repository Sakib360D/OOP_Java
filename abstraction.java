import java.util.Scanner;

public class abstraction{
	public static void main (String[] args ){

      Scanner s = new Scanner(System.in);
      Shape shape;
      Rectangle R= new Rectangle();
      Triangle T= new Triangle();

      System.out.println("Please select the shape that you want to calculate the area of?");
      System.out.println("1.Rectangle ");
      System.out.println("2.Triangle ");
      int choice= s.nextInt();

      if(choice==1){

      R.getArea();
      R.toString();



      }

      else{
             T.getArea();
             T.toString();
      }




	}
}


abstract class Shape{

	     double dim1,dim2;

	     Shape(double dim1, double dim2){

	     	this.dim1=dim1;
	     	this.dim2=dim2;
	     }

           abstract  void getArea();
           abstract  void toString();
}







class Rectangle extends Shape{
	int length,width;

	Rectangle(double length, double width){
		super(length,width);
	}

	void getArea(){
          
      System.out.println("Please wirte the length and width of the Rectangle.");
      double length= s.nextDouble();
      double width= s.nextDouble();

	   }
       void toString(){

        double area = l * w;
        System.out.println("Area of Rectangle is:"+area);

       }

}





class Triangle extends Shape{
	int base,height;

	Triangle(double base, double height){
		super(base,height);
	}

	void getArea(){
          
      System.out.println("Please wirte the Base and Height of the Triangle.");
      double b= s.nextDouble();
      double h= s.nextDouble();

	   }
      void toString(){

        double area = b* h;
        System.out.println("Area of Triangle is:"+area);


       }


}


