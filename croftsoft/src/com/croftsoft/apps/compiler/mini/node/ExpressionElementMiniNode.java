     package com.croftsoft.apps.compiler.mini.node;

     import java.util.*;

     /*********************************************************************
     * Parse tree node for the Mini programming language.
     *
     * @see
     *   MiniNode
     *
     * @author
     *   <A HREF="http://www.alumni.caltech.edu/~croft/">David W. Croft</A>
     * @version
     *   1999-04-25
     *********************************************************************/

     public class  ExpressionElementMiniNode
        extends AbstractMiniNode implements ElementMiniNode
     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     {

     protected ExpressionMiniNode  expressionMiniNode;

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////

     public  ExpressionElementMiniNode (
       ExpressionMiniNode  expressionMiniNode )
     //////////////////////////////////////////////////////////////////////
     {
       this.expressionMiniNode = expressionMiniNode;
     }

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////

     public ExpressionMiniNode  getExpressionMiniNode ( )
     //////////////////////////////////////////////////////////////////////
     {
       return expressionMiniNode;
     }

     //////////////////////////////////////////////////////////////////////
     // MiniNode interface methods
     //////////////////////////////////////////////////////////////////////

     public void  generate ( MiniNodeCodeVisitor  miniNodeCodeVisitor )
     //////////////////////////////////////////////////////////////////////
     {
       miniNodeCodeVisitor.generateExpressionElement ( this );
     }

     public void  checkSemantics ( Stack  parentMiniNodeStack )
       throws SemanticErrorException
     //////////////////////////////////////////////////////////////////////
     {
       parentMiniNodeStack.push ( this );

       expressionMiniNode.checkSemantics ( parentMiniNodeStack );

       parentMiniNodeStack.pop ( );
     }

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     }
