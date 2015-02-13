package hello;

import java.io.IOException;

public class Comments extends Content{

    private String author;
    private String date;
    private String messageText;

    public Comments(String userLogin, String newMessageText) throws IOException {
        super(userLogin, newMessageText);
    }

    public String getUserName()
    {
        return author;
    }

    public String getCommentDate()
    {
        return date;
    }

    public String getComment()
    {
        return messageText;
    }

}
