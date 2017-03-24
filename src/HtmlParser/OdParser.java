package HtmlParser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by a.shipulin on 24.03.17.
 */
public class OdParser {

    public static void main(String[] args) {

        Document document;
        String link_text;
        try {
            document = Jsoup.connect("http://otdam-darom.livejournal.com").get();
            System.out.println("title=" + document.title());
            Elements links = document.select("a[href]");

            //System.out.println("links type: " + links.);

            for(Element src: links) {
                //System.out.println(src.toString());
                System.out.println("src.tagName=" + src.tagName() + " src.owntext=" + src.ownText() + " text=" +src.text() + " src.attr(\"abs:href\")=" + src.attr("abs:href"));
                //if(src.attr("abs:href").matches("http://otdam-darom.livejournal.com")) {
                if(src.attr("abs:href").toString().contentEquals(new StringBuffer("http://otdam-darom.livejournal.com"))) {
                    System.out.println("!!!!!" + src.text());
                }
//                System.out.println(src.attr("abs:href").toString().matches(""));

            }



        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
