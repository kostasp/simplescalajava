package org.kostasp.java.scala.spring.boot.web.controllers;

import org.apache.log4j.Logger;
import org.kostasp.java.scala.spring.boot.SparkJobService;
import org.kostasp.java.scala.spring.boot.domain.Job;
import org.kostasp.java.scala.spring.boot.domain.SparkSqlJob;
import org.kostasp.java.scala.spring.boot.repositories.SimpleStoreRepository;
import org.kostasp.java.scala.spring.boot.repositories.SparkSqlResultsRepository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.validation.Valid;
import java.net.URISyntaxException;


/**
 * Created by kostasp on 8/3/2016.
 */

@RestController
@EnableAutoConfiguration
@RequestMapping("/spark/sql")
public class SparkSqlController {
    private static final Logger LOGGER = Logger.getLogger(SparkSqlController.class);

    @Inject
    private SparkJobService sparkJobService;

    @Inject
    private SparkSqlResultsRepository sparkSqlResultsRepository;

    @Inject
    private SimpleStoreRepository simpleStoreRepository;
    /**
     * POST  /sparkJob = Create a new reportDataSet.
     */
    @RequestMapping(value = "/run/job", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> create(@Valid @RequestBody SparkSqlJob sparkSqlJob) throws URISyntaxException {
        LOGGER.info(String.format("REST request to start sparkSQLjOB : %s", sparkSqlJob));

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    /**
     * POST  /result = Stores result.
     */
    @RequestMapping(value = "/store/result/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Job get(@Valid @PathVariable Long id) throws URISyntaxException {
        LOGGER.info(String.format("REST request to GET result : %s", id));
        return simpleStoreRepository.findOne(id);

    }

    /**
     * POST  /result = Stores result.
     */
    @RequestMapping(value = "/store/result/{id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@Valid @RequestBody String result,@PathVariable Long id) throws URISyntaxException {
        LOGGER.info(String.format("REST request to save result : %s", id));
        simpleStoreRepository.save(new Job(id,result));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
