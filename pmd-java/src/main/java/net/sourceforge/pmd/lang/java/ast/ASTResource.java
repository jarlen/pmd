/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
/* Generated By:JJTree: Do not edit this line. ASTResource.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package net.sourceforge.pmd.lang.java.ast;

import net.sourceforge.pmd.lang.ast.Node;

public class ASTResource extends ASTFormalParameter {
  public ASTResource(int id) {
    super(id);
  }

  public ASTResource(JavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

    @Override
    protected ASTVariableDeclaratorId getDecl() {
        for (int i = 0; i < jjtGetNumChildren(); i++) {
            Node n = jjtGetChild(i);
            if (n instanceof ASTVariableDeclaratorId) {
                return (ASTVariableDeclaratorId)n;
            }
        }
        return null;
    }
}
/* JavaCC - OriginalChecksum=92734fc70bba91fd9422150dbf87d5c4 (do not edit this line) */