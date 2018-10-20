import static spark.Spark.*;

public class server {

    public static void main(String[] args){
        get("/", (req, res) -> "Hello world");
    }
}
