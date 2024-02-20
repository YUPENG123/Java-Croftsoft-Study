     package com.croftsoft.apps.mars.model;

     /*********************************************************************
     * Null object implementation of WorldAccessor.
     *
     * @version
     *   2003-05-12
     * @since
     *   2003-05-12
     * @author
     *   <a href="http://www.croftsoft.com/">David Wallace Croft</a>
     *********************************************************************/

     public final class  NullWorldAccessor
       implements WorldAccessor
     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     {

     public static final NullWorldAccessor  INSTANCE
       = new NullWorldAccessor ( );

     //

     private static final ModelAccessor [ ]  EMPTY_MODEL_ACCESSOR_ARRAY
       = new ModelAccessor [ 0 ];

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////

     public ModelAccessor [ ]  getModelAccessors (
       ModelAccessor [ ]  modelAccessors )
     //////////////////////////////////////////////////////////////////////
     {
       return EMPTY_MODEL_ACCESSOR_ARRAY;
     }

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////

     private  NullWorldAccessor ( ) { }

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     }