package org.ogin.linkPreview.jericho.strategy;

import net.htmlparser.jericho.CharacterReference;
import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.HTMLElementName;
import org.ogin.linkPreview.HtmlDocument;
import org.ogin.linkPreview.jericho.JerichoHtmlDocument;
import org.ogin.linkPreview.strategy.ImageStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ogin
 */
public class JerichoImageStrategy implements ImageStrategy {
    public List<String> retrieveImage(HtmlDocument document) {
        JerichoHtmlDocument doc = (JerichoHtmlDocument) document;
        List<String> imageUrls = new ArrayList<String>();
        List<Element> imageTags = doc.getElementsByTagName(HTMLElementName.IMG);
        for (Element element: imageTags) {
            String result = element.getAttributeValue("src");
            System.out.println(CharacterReference.decode(result));
            imageUrls.add(result);
        }

        return imageUrls;
    }
}
