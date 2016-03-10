package org.kostasp.java.scala.spring.boot.web.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.kostasp.java.scala.spring.boot.App;
/**
 * Created by kostasp on 8/3/2016.
 */
@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return App.echo("My echoed scala string");
    }

//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(SampleController.class, args);
//    }
}