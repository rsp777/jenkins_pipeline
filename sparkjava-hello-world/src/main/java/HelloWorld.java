import spark.servlet.SparkApplication;

import static spark.Spark.get;
//implements SparkApplication
public class HelloWorld  implements SparkApplication{
	public static void main(String[] args ) {
		new HelloWorld().init();
	}  
	 
	
	
	@Override
	public void init() {  
		get("/hello", (req, res) -> "<b>Hello World<b>I am Ravindra Singh Pawar");
//		System.out.println("<b>Hello World, I am Ravindra Singh Pawar<b>");
	
	}
}
