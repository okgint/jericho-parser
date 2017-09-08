package org.ogin.linkPreview.strategy;

import org.ogin.linkPreview.HtmlDocument;

import java.util.List;

/**
 * @author ogin
 */
public interface ImageStrategy {
    List<String> retrieveImage(HtmlDocument document);
}
