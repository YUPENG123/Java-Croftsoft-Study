     package com.croftsoft.core.animation.painter;

     import java.awt.Graphics2D;
     import javax.swing.JComponent;

     import com.croftsoft.core.animation.ComponentPainter;

     /*********************************************************************
     * Null object singleton implementation of ComponentPainter.
     *
     * @version
     *   2003-07-11
     * @since
     *   2003-07-11
     * @author
     *   <a href="http://croftsoft.com/">David Wallace Croft</a>
     *********************************************************************/

     public final class  NullComponentPainter
       implements ComponentPainter
     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     {

     public static final NullComponentPainter  INSTANCE
       = new NullComponentPainter ( );

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////

     public void  paint (
       JComponent  component,
       Graphics2D  graphics )
     //////////////////////////////////////////////////////////////////////
     {
     }

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////

     private  NullComponentPainter ( ) { }

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     }