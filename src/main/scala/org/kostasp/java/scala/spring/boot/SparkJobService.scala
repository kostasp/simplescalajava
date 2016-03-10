package org.kostasp.java.scala.spring.boot

import org.apache.spark.SparkContext
import org.kostasp.java.scala.spring.boot.domain.SparkSqlJob
import org.springframework.stereotype.Component

/**
  * Created by kostasp on 8/3/2016.
  */
@Component
class SparkJobService {

  var sparkContext:SparkContext=null;

  def runSparkJob(job:SparkSqlJob) :Unit={
      if(sparkContext==null){
        sparkContext=new SparkContext();

      }
  }

}
