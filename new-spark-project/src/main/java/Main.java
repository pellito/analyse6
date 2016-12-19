import static spark.Spark.*;


public class Main {

    public static String url(boolean admin){
        if(admin == true) {
            return "Hello admin";
        }else{
            return "Hello user";
        }
    }

    public static void main(String[] args) {
        port(80);


        boolean admin = false;

        get("/", (request, response) -> url(admin));

        get("/admin", (request, response) -> "Hello admin");

    }

}
