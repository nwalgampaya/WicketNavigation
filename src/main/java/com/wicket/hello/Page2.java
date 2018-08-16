package com.wicket.hello;

import org.apache.wicket.markup.html.WebPage;

public class Page2 extends WebPage
{
    /**
     * Constructor
     */
    public Page2()
    {
        add(new NavomaticBorder("navomaticBorder"));
    }
}
