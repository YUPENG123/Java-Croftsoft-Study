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

     public class  ProgramMiniNode extends AbstractMiniNode
     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     {

     protected BlockMiniNode  blockMiniNode;

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////

     public  ProgramMiniNode ( BlockMiniNode  blockMiniNode )
       throws SemanticErrorException
     //////////////////////////////////////////////////////////////////////
     {
       this.blockMiniNode = blockMiniNode;

       checkSemantics ( new Stack ( ) );
     }

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////

     public BlockMiniNode  getBlockMiniNode ( ) { return blockMiniNode; }

     //////////////////////////////////////////////////////////////////////
     // MiniNode interface methods
     //////////////////////////////////////////////////////////////////////

     public void  generate ( MiniNodeCodeVisitor  miniNodeCodeVisitor )
     //////////////////////////////////////////////////////////////////////
     {
       miniNodeCodeVisitor.generateProgram ( this );
     }

     public void  checkSemantics ( Stack  parentMiniNodeStack )
       throws SemanticErrorException
     //////////////////////////////////////////////////////////////////////
     {
       parentMiniNodeStack.push ( this );

       blockMiniNode.checkSemantics ( parentMiniNodeStack );

       parentMiniNodeStack.pop ( );
     }

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     }
