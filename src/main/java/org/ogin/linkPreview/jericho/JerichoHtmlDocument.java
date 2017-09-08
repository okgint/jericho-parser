package org.ogin.linkPreview.jericho;

import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.MasonTagTypes;
import net.htmlparser.jericho.MicrosoftConditionalCommentTagTypes;
import net.htmlparser.jericho.Source;
import org.ogin.linkPreview.HtmlDocument;

import java.io.InputStream;
import java.util.List;

/**
 * @author ogin
 */
public class JerichoHtmlDocument implements HtmlDocument {
    private Source source;
    private InputStream inputStream;
    private String url;

    public JerichoHtmlDocument(String string) {
        MicrosoftConditionalCommentTagTypes.register();
        MasonTagTypes.register();
        this.source = new Source(string);
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public String getUrl() {
        return this.url;
    }

    public Source getSource() {
        return source;
    }

    public List<Element> getElementsByTagName(String tagName) {
        return source.getAllElements(tagName);
    }

    public Element getFirstElementByTagName(String tagName) {
        List<Element> elements = getElementsByTagName(tagName);
        if (elements != null && elements.size() > 0) {
            return elements.get(0);
        }
        return null;
    }
}
