package com.wicket.hello;

import org.apache.wicket.markup.html.WebPage;

public class Page3 extends WebPage
{
    /**
     * Constructor
     */
    public Page3()
    {
        add(new NavomaticBorder("navomaticBorder"));
    }
}
