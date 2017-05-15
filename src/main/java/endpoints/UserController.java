package endpoints;

import service.UserService;
import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.*;
import static util.JsonUtil.json;

/**
 * Created by Mick on 15-5-2017.
 */
public class UserController {

    public UserController(final UserService userService){
        get("/users", (req, res) -> userService.getAllUsers(), json());

        after((req, res) -> {
            res.type("application/json");
        });
    }
}
