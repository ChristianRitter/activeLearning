package com.github.TKnudsen.activeLearning.models.learning.regression;

import com.github.TKnudsen.ComplexDataObject.data.features.AbstractFeatureVector;
import com.github.TKnudsen.ComplexDataObject.data.features.Feature;
import com.github.TKnudsen.activeLearning.models.learning.ILearningModel;

/**
 * <p>
 * Title: IRegression
 * </p>
 * 
 * <p>
 * Description: basic algorithmic model that learns numerical label information.
 * </p>
 * 
 * <p>
 * Copyright: (c) 2016 J�rgen Bernard,
 * https://github.com/TKnudsen/activeLearning
 * </p>
 * 
 * @author Juergen Bernard
 * @version 1.01
 */
public interface IRegression<O, X extends AbstractFeatureVector<O, ? extends Feature<O>>> extends ILearningModel<O, X, Double> {
	public Double getAccuracy(X featureVector);
}
