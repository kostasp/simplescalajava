package org.kostasp.java.scala.spring.boot.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by kostasp on 8/3/2016.
 */
@Document(indexName = "result")
public class Job {

    @Id
    @NotNull
    private Long id;

    private String result;

    private String sparkSqlQuery;

    private Long sizeOfResults;

    private Long sparkJobStatus;



    public Job(){

    }

    public Job(Long id) {
        this.id = id;
    }

    public Job(Long id, String result) {
        this.id = id;
        this.result = result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSparkSqlQuery() {
        return sparkSqlQuery;
    }

    public void setSparkSqlQuery(String sparkSqlQuery) {
        this.sparkSqlQuery = sparkSqlQuery;
    }

    public Long getSizeOfResults() {
        return sizeOfResults;
    }

    public void setSizeOfResults(Long sizeOfResults) {
        this.sizeOfResults = sizeOfResults;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
