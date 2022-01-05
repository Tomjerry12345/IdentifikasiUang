package com.identifikasiuang.customview;

import com.identifikasiuang.tflite.Classifier;
import java.util.List;

public interface ResultsView {
    public void setResults(final List<Classifier.Recognition> results);
}
