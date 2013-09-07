package org.dwquerybuilder.data.conditions.where;

import org.dwquerybuilder.data.SelectColumn;
import org.dwquerybuilder.data.enums.ComparisonType;

public class ValueComparison extends WhereCondition {
    private ComparisonType operator;
    private String value;

    public ValueComparison() {
        super();
    }

    public ValueComparison(String tableName, String fieldName,
                           ComparisonType operator, String value) {
        super(tableName, fieldName);

        this.operator = operator;
        this.value = value;
    }

    public ValueComparison(SelectColumn selectColumn1,
                           ComparisonType operator, String value) {
        super(selectColumn1);

        this.operator = operator;
        this.value = value;
    }

    public ComparisonType getOperator() {
        return operator;
    }

    public void setOperator(ComparisonType operator) {
        this.operator = operator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
