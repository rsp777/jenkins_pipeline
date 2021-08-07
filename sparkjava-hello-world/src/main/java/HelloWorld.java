import spark.servlet.SparkApplication;

import static spark.Spark.get;
//implements SparkApplication
public class HelloWorld  {
	public static void main(String[] args) {
		System.out.println(new HelloWorld().helloString());
	}  
	
	
	public String helloString() {
		return "<b>Hello World<b>";
	}
//	@Override
//	public String init() {  
////		get("/hello", (req, res) -> "<b>Hello World<b>");
////		System.out.println("<b>Hello World<b>");
//		return "<b>HelloWorld<b>";
//	}
}
