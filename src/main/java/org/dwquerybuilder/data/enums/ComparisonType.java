package org.dwquerybuilder.data.enums;

public enum ComparisonType {
    Less,
    LessEqual,
    Equal,
    NotEqual,
    Greater,
    GreaterEqual;

    public static ComparisonType fromSymbol(String symbol) {
        switch (symbol) {
            case "<":
                return Less;
            case "<=":
                return LessEqual;
            case "=":
                return Equal;
            case "!=":
                return NotEqual;
            case ">":
                return Greater;
            case ">=":
                return GreaterEqual;
            default:
                throw new IllegalArgumentException("Comparison symbol: " + symbol + " not supported.");
        }
    }
}
