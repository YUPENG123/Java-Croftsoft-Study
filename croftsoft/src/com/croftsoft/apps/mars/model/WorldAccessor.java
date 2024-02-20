     package com.croftsoft.apps.mars.model;

     /*********************************************************************
     * Read-only access to the World.
     *
     * @version
     *   2003-04-17
     * @since
     *   2003-04-14
     * @author
     *   <a href="http://www.croftsoft.com/">David Wallace Croft</a>
     *********************************************************************/

     public interface  WorldAccessor
     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     {

     /*********************************************************************
     * Gets all ModelAccessors, active and inactive.
     *********************************************************************/
     public ModelAccessor [ ]  getModelAccessors (
       ModelAccessor [ ]  modelAccessors );

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     }