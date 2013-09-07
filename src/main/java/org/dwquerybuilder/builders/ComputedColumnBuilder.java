package org.dwquerybuilder.builders;

import org.dwquerybuilder.builders.steps.ComputedColumnBuilderOperationStep;
import org.dwquerybuilder.data.ComputedColumn;
import org.dwquerybuilder.data.ComputedColumnOperation;

import java.util.LinkedHashSet;
import java.util.Set;

public class ComputedColumnBuilder {

    public ComputedColumnBuilder() {
    }

    public ComputedColumnBuilderOperationStep withComputedColumn(String tableName,
                                                                 String fieldName) {
        return new ComputedColumnBuilderOperationStep(
                tableName,
                fieldName,
                new LinkedHashSet<ComputedColumnOperation>());
    }

    public ComputedColumnBuilderOperationStep withComputedColumn(String tableName,
                                                                 String fieldName,
                                                                 Set<ComputedColumnOperation> operations) {
        return new ComputedColumnBuilderOperationStep(
                tableName,
                fieldName,
                operations);
    }

    public ComputedColumnBuilderOperationStep withComputedColumn(ComputedColumn computedColumn) {
        return new ComputedColumnBuilderOperationStep(
                computedColumn.getTableName(),
                computedColumn.getFieldName(),
                computedColumn.getOperations());
    }

    public ComputedColumnBuilderOperationStep withComputedColumn(ComputedColumnBuilderOperationStep computedColumnBuilder) {
        ComputedColumn computedColumn = computedColumnBuilder.build();

        return new ComputedColumnBuilderOperationStep(
                computedColumn.getTableName(),
                computedColumn.getFieldName(),
                computedColumn.getOperations());
    }
}
