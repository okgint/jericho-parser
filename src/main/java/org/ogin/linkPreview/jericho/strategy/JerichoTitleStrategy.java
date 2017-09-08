package org.ogin.linkPreview.jericho.strategy;

import net.htmlparser.jericho.CharacterReference;
import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.HTMLElementName;
import org.ogin.linkPreview.HtmlDocument;
import org.ogin.linkPreview.jericho.JerichoHtmlDocument;
import org.ogin.linkPreview.strategy.TitleStrategy;

/**
 * @author ogin
 */
public class JerichoTitleStrategy implements TitleStrategy {
    public String retrieveTitle(HtmlDocument htmlDocument) {
        JerichoHtmlDocument document = (JerichoHtmlDocument) htmlDocument;
        Element element = document.getFirstElementByTagName(HTMLElementName.TITLE);
        if (element == null) {
            return null;
        }
        return CharacterReference.decodeCollapseWhiteSpace(element.getContent());
    }
}
