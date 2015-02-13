package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;



@Controller
public class ForumController {

    private String all_posts;

    @RequestMapping("/")
    public String forum(
            @RequestParam(value="name", required=false, defaultValue="my friend") String name,
            Model model) throws IOException {

        //read all Blog entities
        BufferedReader reader = new BufferedReader(new FileReader("WebBlog"));
        String line;
        List<String> lines = new ArrayList<String>();
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        //make array from list
        String [] linesAsArray = lines.toArray(new String[lines.size()]);

        //make table (a two-dimensional array) from array
        int amountOfMessages = (linesAsArray.length+1)/5;
        String [][] dbWebBLog = new String [amountOfMessages][4];

        int n=0;
        int i=0;
        int j=0;
        for (i=0; i<amountOfMessages; i++) {
            for (j=0; j<4; j++) {
                dbWebBLog[i][j] = linesAsArray[n];
                n++;
            }
            n++;
        }


        i=0;
        all_posts="";

        for (i=0; i<dbWebBLog.length; i++){
            all_posts=all_posts+"<p>---------------------------------</p>";
            all_posts=all_posts+"<p>Author: "+dbWebBLog[i][0]+"   Date: "+dbWebBLog[i][1]+"</p><p>Title: "+dbWebBLog[i][2];
            all_posts=all_posts+"</p><p>---------------------------------</p>";
        }


        model.addAttribute("name", name);
        model.addAttribute("all_posts", all_posts);
        return "forum";
    }

   /* @RequestMapping("/forum")
    public String forum_main_page(@RequestParam(value="name", required=false, defaultValue="my friend") String name, Model model) {
        model.addAttribute("name", name);
        return "forum";
    }
    */

    @RequestMapping("/new_post")
    public String new_post(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "new_post";
    }

    @RequestMapping("/login")
    public String login(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "login";
    }

    @RequestMapping("/registration")
    public String registration(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "registration";
    }

    @RequestMapping("/post_page")
    public String post_page(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "post_page";
    }

}