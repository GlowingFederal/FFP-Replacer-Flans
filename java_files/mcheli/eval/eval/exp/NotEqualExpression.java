/*    */ package mcheli.eval.eval.exp;
/*    */ 
/*    */ public class NotEqualExpression
/*    */   extends Col2Expression {
/*    */   public NotEqualExpression() {
/*  6 */     setOperator("!=");
/*    */   }
/*    */   
/*    */   protected NotEqualExpression(NotEqualExpression from, ShareExpValue s) {
/* 10 */     super(from, s);
/*    */   }
/*    */   
/*    */   public AbstractExpression dup(ShareExpValue s) {
/* 14 */     return new NotEqualExpression(this, s);
/*    */   }
/*    */   
/*    */   protected long operateLong(long vl, long vr) {
/* 18 */     return (vl != vr) ? 1L : 0L;
/*    */   }
/*    */   
/*    */   protected double operateDouble(double vl, double vr) {
/* 22 */     return (vl != vr) ? 1.0D : 0.0D;
/*    */   }
/*    */   
/*    */   protected Object operateObject(Object vl, Object vr) {
/* 26 */     return this.share.oper.notEqual(vl, vr);
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Documents\Downloads\BC Remake 3.0.0 SW Community\mods\mcheli\!\mcheli\eval\eval\exp\NotEqualExpression.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */