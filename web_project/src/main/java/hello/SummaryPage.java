package hello;

public class SummaryPage {

    /*properties
    1) author
    2) data
    3) title
    */

    public SummaryPage(String [][] allMessages) {


        System.out.println("============SUMMARY PAGE============");

        int i=0;

        for (i=0; i<allMessages.length; i++){
            System.out.println("---------------------------------");
            System.out.println("Author: "+allMessages[i][0]+"   Date: "+allMessages[i][1]+"\nTitle: "+allMessages[i][2]);
            System.out.println("---------------------------------");
        }

        System.out.println("====================================");

    }
}
