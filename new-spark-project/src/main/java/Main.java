import static spark.Spark.*;


public class Main {


    public static void main(String[] args) {
        port(8000);
        boolean admin = false;
        get("/", (request, response) -> {
        if(admin == true) {
            return "Hello admin";
        }else{
            return "Hello user";
        }
        });

        get("/admin", (request, response) -> "Hello admin");
    }

}
