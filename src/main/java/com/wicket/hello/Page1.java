package com.wicket.hello;

import org.apache.wicket.markup.html.WebPage;

public class Page1 extends WebPage
{
    /**
     * Constructor
     */
    public Page1()
    {
        add(new NavomaticBorder("navomaticBorder"));
    }
}
