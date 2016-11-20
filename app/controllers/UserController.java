package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.search;
import views.html.user;

/**
 * Created by rajgopal on 20/11/16.
 */
public class UserController extends Controller {

    public Result userUI() { return ok(user.render()); }

    public Result searchUI() { return ok(search.render()); }
}
