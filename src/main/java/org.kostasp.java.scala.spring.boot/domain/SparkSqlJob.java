package org.kostasp.java.scala.spring.boot.domain;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by kostasp on 8/3/2016.
 */
public class SparkSqlJob {

    @NotNull
    private String sparkSql;
    @NotNull
    private List<String> tempTables;


    public String getSparkSql() {
        return sparkSql;
    }

    public void setSparkSql(String sparkSql) {
        this.sparkSql = sparkSql;
    }

    public List<String> getTempTables() {
        return tempTables;
    }

    public void setTempTables(List<String> tempTables) {
        this.tempTables = tempTables;
    }
}
