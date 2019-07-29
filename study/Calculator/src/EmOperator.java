public enum EmOperator {
    ADD("+", 2, 1,"加法"),
    SUB("-", 2, 1, "减法"),
    MULTIPLY("*", 2, 2, "乘法"),
    DIVIDE("/", 2, 2, "除法"),
    MOD("%", 2, 2, "取模"),

    POW("pow", 2, 3, "幂函数"),
    SQRT("sqrt", 1, 3, "平方根"),
    ABS("abs", 1, 3, "绝对值"),
    LOG("log", 1, 3, "自然对数"),
    LOG10("log10", 1, 3, "常用对数"),
    CEIL("ceil", 1, 3, "常用对数"),
    EXP("exp", 1, 3, "指数函数"),
    MAX("max", 2, 3, "最大值"),
    MIN("min", 2, 3, "最小值"),


    LEFT_BRACKET("(", 0, Integer.MAX_VALUE, "左括号"),
    RIGHT_BRACKET(")", 0, Integer.MAX_VALUE, "右括号"),


    ;

    //表达式，目前还没用，可使用反射调用某个对象的expression方法，需要加参数类型数组字段。
    private String expression;
    //运算符参数个数
    private int paramNumber;
    //运算符优先级
    private int priority;
    //描述
    private String desc;
    EmOperator(String expression, int paramNumber,int priority,  String desc) {
        this.expression = expression;
        this.paramNumber = paramNumber;
        this.priority = priority;
        this.desc = desc;
    }
    public static boolean isSimpleOperator(String expression) {
        return ADD.expression.equals(expression) || SUB.expression.equals(expression)
                || LEFT_BRACKET.expression.equals(expression) || RIGHT_BRACKET.expression.equals(expression)
                || MULTIPLY.expression.equals(expression) || DIVIDE.expression.equals(expression)
                || MOD.expression.equals(expression);
    }
    public static EmOperator getByExpression(String expression) {
        for (EmOperator operator : EmOperator.values()) {
            if (operator.expression.equals(expression)) {
                return operator;
            }
        }
        return null;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public int getParamNumber() {
        return paramNumber;
    }

    public void setParamNumber(int paramNumber) {
        this.paramNumber = paramNumber;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
