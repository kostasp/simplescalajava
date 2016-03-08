package org.kostasp.java.scala.spring.boot;

/**
 * Created by kostasp on 8/3/2016.
 */


public interface Model<T extends ConfigurableModel> {

    void update(T model);

    void train();

    void batch_train();
}
