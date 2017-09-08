package org.ogin.linkPreview;

import java.io.InputStream;

/**
 * @author ogin
 */
public interface HtmlDocument {
    public InputStream getInputStream();
    public String getUrl();
}
