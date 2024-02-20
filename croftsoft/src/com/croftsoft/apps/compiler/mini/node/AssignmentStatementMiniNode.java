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

     public class  AssignmentStatementMiniNode extends AbstractMiniNode
       implements StatementMiniNode
     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     {

     protected NameMiniNode        nameMiniNode;
     protected ExpressionMiniNode  expressionMiniNode;

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////

     public  AssignmentStatementMiniNode (
       NameMiniNode        nameMiniNode,
       ExpressionMiniNode  expressionMiniNode )
     //////////////////////////////////////////////////////////////////////
     {
       this.nameMiniNode       = nameMiniNode;
       this.expressionMiniNode = expressionMiniNode;
     }

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////

     public NameMiniNode  getNameMiniNode ( )
     //////////////////////////////////////////////////////////////////////
     {
       return nameMiniNode;
     }

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
       miniNodeCodeVisitor.generateAssignmentStatement ( this );
     }
     
     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////

     public void  checkSemantics ( Stack  parentMiniNodeStack )
       throws SemanticErrorException
     //////////////////////////////////////////////////////////////////////
     {
       parentMiniNodeStack.push ( this );

       nameMiniNode.checkSemantics ( parentMiniNodeStack );
       expressionMiniNode.checkSemantics ( parentMiniNodeStack );

       parentMiniNodeStack.pop ( );
     }

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     }
