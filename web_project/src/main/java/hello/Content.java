package hello;

import java.util.Calendar;

import java.io.*;

public class Content {

    /*types of Content
    1) Post
    2) Comment
    */
    private String author;
    private String date;
    private String title;
    private String messageText;

    private String textForFile;

            public Content(String newAuthor, String newTitle, String newMessageText) throws IOException {

                this.author=newAuthor;
                Calendar dataTime = Calendar.getInstance();
                this.date=dataTime.get(Calendar.DAY_OF_MONTH) + "-" + (dataTime.get(Calendar.MONTH)+1) + "-" + dataTime.get(Calendar.YEAR);
                this.title=newTitle;
                this.messageText=newMessageText;

                textForFile="\n\n"+author+"\n"+date+"\n"+title+"\n"+messageText;
                
                FileWriter writeWebBlogMessage = new FileWriter("WebBlog",true);
                writeWebBlogMessage.write(textForFile);
                writeWebBlogMessage.close();

            }

             public Content(String newAuthor, String newMessageText) throws IOException {

                this.author=newAuthor;
                Calendar dataTime = Calendar.getInstance();
                this.date=dataTime.get(Calendar.DAY_OF_MONTH) + "-" + (dataTime.get(Calendar.MONTH)+1) + "-" + dataTime.get(Calendar.YEAR);
                this.messageText=newMessageText;

                //textForFile="\n\n"+author+"\n"+date+"\n"+messageText;
               

                //FileWriter writeWebBlogMessage = new FileWriter("WebBlog",true);
                //writeWebBlogMessage.write(textForFile);
                //writeWebBlogMessage.close();

            }

}
