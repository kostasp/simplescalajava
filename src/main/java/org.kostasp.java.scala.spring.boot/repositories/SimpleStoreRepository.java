package org.kostasp.java.scala.spring.boot.repositories;

import org.kostasp.java.scala.spring.boot.domain.Job;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by kostasp on 8/3/2016.
 */
public interface SimpleStoreRepository extends ElasticsearchRepository<Job, Long> {

}
