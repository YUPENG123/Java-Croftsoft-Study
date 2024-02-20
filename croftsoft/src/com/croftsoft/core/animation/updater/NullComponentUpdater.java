     package com.croftsoft.core.animation.updater;

     import javax.swing.JComponent;

     import com.croftsoft.core.animation.ComponentUpdater;

     /*********************************************************************
     * Null object singleton implementation of ComponentUpdater.
     *
     * @version
     *   2003-07-11
     * @since
     *   2003-07-11
     * @author
     *   <a href="http://www.croftsoft.com/">David Wallace Croft</a>
     *********************************************************************/

     public final class  NullComponentUpdater
       implements ComponentUpdater
     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     {

     public static final NullComponentUpdater  INSTANCE
       = new NullComponentUpdater ( );

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////

     public void  update ( JComponent  component )
     //////////////////////////////////////////////////////////////////////
     {
     }

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////

     private  NullComponentUpdater ( ) { }

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     }