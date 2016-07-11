package com.neueda.jetbrains.plugin.graphdb.jetbrains.ui.util;

import com.neueda.jetbrains.plugin.graphdb.jetbrains.GraphConstants;
import com.neueda.jetbrains.plugin.graphdb.jetbrains.component.datasource.state.DataSourceApi;

public final class NameUtil {

    public static String createDataSourceFileName(DataSourceApi dataSource) {
        return GraphConstants.BOUND_DATA_SOURCE_PREFIX + dataSource.getUUID() + "." + dataSource.getDescription().getDefaultFileExtension();
    }

    public static String extractDataSourceUUID(String fileName) {
        int beginIndex = GraphConstants.BOUND_DATA_SOURCE_PREFIX.length();
        int endIndex = beginIndex + 36;
        return fileName.substring(beginIndex, endIndex);
    }
}