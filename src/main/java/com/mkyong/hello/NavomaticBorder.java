package com.mkyong.hello;

import org.apache.wicket.markup.html.border.Border;
import org.apache.wicket.markup.html.border.BoxBorder;

public class NavomaticBorder extends Border {
    public NavomaticBorder(final String id)
    {
        super(id);
        addToBorder(new BoxBorder("navigationBorder"));
        addToBorder(new BoxBorder("bodyBorder"));
    }}
