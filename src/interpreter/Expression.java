package interpreter;

/**
 * 解析器解析的表达式接口
 */
public interface Expression {
    public boolean interpret(String context);
}
