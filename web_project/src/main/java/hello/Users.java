package hello;

public class Users {
    
    private String login;
    private String password;

    public Users(String login, String password)
    {
        this.login = login;
        this.password = password;
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
