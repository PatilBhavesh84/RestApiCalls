package com.bridgelabz.springappdevlopnemt.controller;

import com.bridgelabz.springappdevlopnemt.Model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    //localhost:8080/hello/home
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From BridgeLabz";
    }

    //localhost:8080/hello/query?name=Bhavesh
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }

    //localhost:8080/hello/param/bhavesh
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {

        return "Hello " + name;
    }
    //localhost:8080/hello/post
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " !";
    }
}
