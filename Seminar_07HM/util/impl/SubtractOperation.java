package Seminar_07HM.util.impl;

import Seminar_07HM.util.ComplexNumber;
import Seminar_07HM.util.ComplexOperation;

public class SubtractOperation implements ComplexOperation {

    public ComplexNumber operate(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() - b.getReal(), a.getImaginary() - b.getImaginary());
    }
    
}
