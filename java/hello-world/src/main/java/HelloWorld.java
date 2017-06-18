public class HelloWorld {
    public static String hello(String name) {
    	if (name == null) {
    		return "Hello, World!";
    	}
    	switch (name) {
    		case "":
    			return "Hello, World!";
    		default:
    			return "Hello, " + name + "!";
    	}
    }
}
