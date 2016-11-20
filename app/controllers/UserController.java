package controllers;

import com.avaje.ebean.Ebean;
import com.fasterxml.jackson.databind.JsonNode;
import model.User;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import views.html.search;
import views.html.user;

/**
 * Created by rajgopal on 20/11/16.
 */
public class UserController extends Controller {

    public Result userUI() { return ok(user.render()); }

    public Result addUser() {

        //POST Body
        Http.RequestBody body = request().body();
        JsonNode json = body.asJson();
        String firstName = json.findPath("firstName").asText();
        String lastName = json.findPath("lastName").asText();
        int age = json.findPath("age").asInt();
        String dob = json.findPath("firstName").asText();
        String gender = json.findPath("firstName").asText();
        int contact = json.findPath("firstName").asInt();
        String info = json.findPath("firstName").asText();

        User user = new User(firstName, lastName, age, dob, gender, contact, info);
        Ebean.save(user);
        return ok("okk");
    }

    //searchUser

    public Result searchUI() { return ok(search.render()); }
}
