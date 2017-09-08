package org.ogin.linkPreview.strategy;

import org.ogin.linkPreview.HtmlDocument;

/**
 * @author ogin
 */
public interface TitleStrategy {
    String retrieveTitle(HtmlDocument htmlDocument);
}
