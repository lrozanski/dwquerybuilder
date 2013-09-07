package org.dwquerybuilder.builders;

import org.dwquerybuilder.data.DwQueryCombination;
import org.dwquerybuilder.data.enums.CombineType;
import org.dwquerybuilder.data.DwQuery;

public class DwQueryCombinationBuilder {
    private CombineType combineType;
    private DwQuery dwQuery;
    private String foreignKeyFieldName;
    private String referencedFieldName;

    public DwQueryCombinationBuilder withCombineType(CombineType combineType) {
        this.combineType = combineType;
        return this;
    }

    public DwQueryCombinationBuilder withDwQuery(DwQuery dwQuery) {
        this.dwQuery = dwQuery;
        return this;
    }

    public DwQueryCombinationBuilder withDwQuery(DwQueryBuilder dwQueryBuilder) {
        this.dwQuery = dwQueryBuilder.build();
        return this;
    }

    public DwQueryCombinationBuilder withKeys(String foreignKeyFieldName, String referencedFieldName) {
        this.foreignKeyFieldName = foreignKeyFieldName;
        this.referencedFieldName = referencedFieldName;
        return this;
    }

    public DwQueryCombination build() {
        return new DwQueryCombination(combineType, dwQuery, foreignKeyFieldName, referencedFieldName);
    }
}
