package org.dwquerybuilder.data;

import org.dwquerybuilder.data.enums.CombineType;

public class DwQueryCombination {
    private CombineType combineType;
    private DwQuery dwQuery;
    private String foreignKeyFieldName;
    private String referencedFieldName;

    public DwQueryCombination() {
    }

    public DwQueryCombination(CombineType combineType, DwQuery dwQuery,
                              String foreignKeyFieldName, String referencedFieldName) {
        this.combineType = combineType;
        this.dwQuery = dwQuery;
        this.foreignKeyFieldName = foreignKeyFieldName;
        this.referencedFieldName = referencedFieldName;
    }

    public CombineType getCombineType() {
        return combineType;
    }

    public void setCombineType(CombineType combineType) {
        this.combineType = combineType;
    }

    public DwQuery getDwQuery() {
        return dwQuery;
    }

    public void setDwQuery(DwQuery dwQuery) {
        this.dwQuery = dwQuery;
    }

    public String getForeignKeyFieldName() {
        return foreignKeyFieldName;
    }

    public void setForeignKeyFieldName(String foreignKeyFieldName) {
        this.foreignKeyFieldName = foreignKeyFieldName;
    }

    public String getReferencedFieldName() {
        return referencedFieldName;
    }

    public void setReferencedFieldName(String referencedFieldName) {
        this.referencedFieldName = referencedFieldName;
    }
}
