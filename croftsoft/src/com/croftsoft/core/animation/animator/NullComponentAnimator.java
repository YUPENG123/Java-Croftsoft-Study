     package com.croftsoft.core.animation.animator;

     import java.awt.Graphics2D;
     import javax.swing.JComponent;

     import com.croftsoft.core.animation.ComponentAnimator;

     /*********************************************************************
     * Null object singleton implementation of ComponentAnimator.
     *
     * @version
     *   2003-07-24
     * @since
     *   2003-07-24
     * @author
     *   <a href="http://www.croftsoft.com/">David Wallace Croft</a>
     *********************************************************************/

     public final class  NullComponentAnimator
       implements ComponentAnimator
     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     {

     public static final NullComponentAnimator  INSTANCE
       = new NullComponentAnimator ( );

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////

     public void  update ( JComponent  component )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  paint (
       JComponent  component,
       Graphics2D  graphics )
     //////////////////////////////////////////////////////////////////////
     {
     }

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////

     private  NullComponentAnimator ( ) { }

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     }