     package com.croftsoft.apps.chat.event;

     import com.croftsoft.core.lang.NullArgumentException;

     /*********************************************************************
     * An avatar is talking.
     *
     * @version
     *   2003-06-11
     * @since
     *   2003-06-11
     * @author
     *   <a href="http://www.croftsoft.com/">David Wallace Croft</a>
     *********************************************************************/

     public final class  TalkEvent
       extends AbstractEvent
     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     {

     private static final long  serialVersionUID = 0L;

     //

     private final String  text;

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////

     public  TalkEvent ( String  text )
     //////////////////////////////////////////////////////////////////////
     {
       NullArgumentException.check ( this.text = text );
     }

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////

     public String  getText ( ) { return text; }

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     }