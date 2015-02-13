package hello;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class WebBlog {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(WebBlog.class, args);


        //add new Content
        //Content newMessage = new Content("author3", "first title", "first message");

        //add new User
        //Users newUser = new Users("user", "user");

       
    }


}
