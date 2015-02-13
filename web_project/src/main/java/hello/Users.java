package hello;

import java.io.*;

public class Users {
    
    private String login;
    private String password;

    private String textForFile;

    public Users(String login, String password)
    {
        this.login = login;
        this.password = password;
                
        textForFile=login+"\t"+password+"\n";
              
        FileWriter writeWebBlogMessage = new FileWriter("Users",true);
        writeWebBlogMessage.write(textForFile);
        writeWebBlogMessage.close();
    }

    public String getLogin()
    {
        return login;
    }

    public String getPassword()
    {
        return password;
    }

}
