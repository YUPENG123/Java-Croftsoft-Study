     package com.croftsoft.core.util.loop;

     /*********************************************************************
     * An object capable of implementing some task in a loop.
     *
     * @author
     *   <a href="http://www.croftsoft.com/">David Wallace Croft</a>
     * @version
     *   2003-05-22
     * @since
     *   2000-04-27
     *********************************************************************/

     public interface  Loopable
     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     {

     /*********************************************************************
     * @return
     *
     *   False if looping should stop.
     *********************************************************************/
     public boolean  loop ( );

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     }
