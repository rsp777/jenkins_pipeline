import spark.servlet.SparkApplication;

import static spark.Spark.get;
//implements SparkApplication
public class HelloWorld  {
	public static void main(String[] args) {
		System.out.printf(new HelloWorld().helloString());
	}  
	 
	
	public String helloString() {
		return "<b>Hello World"
				+ "My name is ravindra<b>";
	}
//	@Override
//	public String init() {  
////		get("/hello", (req, res) -> "<b>Hello World<b>");
////		System.out.println("<b>Hello World<b>");
//		return "<b>HelloWorld<b>";
//	}
}
