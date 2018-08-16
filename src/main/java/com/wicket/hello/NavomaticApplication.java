package com.wicket.hello;

import org.apache.wicket.Page;
//import org.apache.wicket.examples.WicketExampleApplication;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Application class.
 * 
 * @author Jonathan Locke
 */
public class NavomaticApplication extends WebApplication 	
{
    /**
     * Constructor.
     */
    public NavomaticApplication()
    {
    }

    /**
     * @see org.apache.wicket.Application#getHomePage()
     */
    @Override
    public Class< ? extends Page> getHomePage()
    {
        return Page1.class;
    }


}