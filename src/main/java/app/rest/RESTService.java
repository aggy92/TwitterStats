package app.rest;

import app.controller.ResponseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Agi.
 */

public class RESTService {
    ResponseController controller = new ResponseController();
    protected ResponseController getResponseController(){
        return controller;
    }
}
