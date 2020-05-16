package thinkinginjava.chap10innerclass.page102;
/*
 * 内部类拥有其外部类的所有元素的访问权
 * Holds a sequence of Object
 */
public interface Selector { 
     boolean end();
     Object current();
     void next();
}
