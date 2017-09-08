package org.ogin;

import org.ogin.linkPreview.jericho.JerichoHtmlDocument;
import org.ogin.linkPreview.jericho.strategy.JerichoImageStrategy;
import org.ogin.linkPreview.jericho.strategy.JerichoTitleStrategy;
import org.ogin.linkPreview.strategy.ImageStrategy;
import org.ogin.linkPreview.strategy.TitleStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        URL flickr = new URL("https://www.detik.com");
        InputStream inputStream = flickr.openStream();
        InputStreamReader reader = new InputStreamReader(inputStream);
        BufferedReader reader1 = new BufferedReader(reader);
        String line;
        StringBuilder builder = new StringBuilder();
        while ((line = reader1.readLine()) != null) {
            builder.append(line);
            builder.append(System.lineSeparator());
        }
        JerichoHtmlDocument document = new JerichoHtmlDocument(builder.toString());
        TitleStrategy titleStrategy = new JerichoTitleStrategy();
        System.out.println("TITLE : " + titleStrategy.retrieveTitle(document));

        ImageStrategy strategy = new JerichoImageStrategy();
        strategy.retrieveImage(document);
    }
}
