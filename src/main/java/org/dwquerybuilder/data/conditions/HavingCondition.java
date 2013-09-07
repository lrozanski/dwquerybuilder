package org.dwquerybuilder.data.conditions;

import org.dwquerybuilder.data.SelectColumn;
import org.dwquerybuilder.data.enums.ComparisonType;

public class HavingCondition extends BaseCondition {
    private SelectColumn selectColumn;
    private ComparisonType operator;
    private String value;

    public HavingCondition() {
        super();
    }

    public HavingCondition(SelectColumn selectColumn, ComparisonType operator,
                           String value) {
        super();

        this.selectColumn = selectColumn;
        this.operator = operator;
        this.value = value;
    }

    public SelectColumn getSelectColumn() {
        return selectColumn;
    }

    public void setSelectColumn(SelectColumn selectColumn) {
        this.selectColumn = selectColumn;
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
