     package com.croftsoft.core.security;

     import com.croftsoft.core.lang.NullArgumentException;

     /*********************************************************************
     * Identifier in which the Authentication has been pre-fetched.
     *
     * <p />
     *
     * @version
     *   2001-07-30
     * @since
     *   2001-07-30
     * @author
     *   <a href="http://croftsoft.com/">David Wallace Croft</a>
     *********************************************************************/

     public final class  PreIdentifier
       implements Identifier
     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     {

     private final Authentication  authentication;

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////

     public  PreIdentifier ( Authentication  authentication )
     //////////////////////////////////////////////////////////////////////
     {
       NullArgumentException.check (
         this.authentication = authentication );
     }

     public  PreIdentifier (
       String  username,
       String  password )
     //////////////////////////////////////////////////////////////////////
     {
       this ( new Authentication ( username, password ) );
     }

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////

     public Authentication  getAuthentication ( )
     //////////////////////////////////////////////////////////////////////
     {
       return authentication;
     }

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     }
