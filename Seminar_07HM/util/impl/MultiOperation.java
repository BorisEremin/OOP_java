package Seminar_07HM.util.impl;

import Seminar_07HM.util.ComplexNumber;
import Seminar_07HM.util.ComplexOperation;

public class MultiOperation implements ComplexOperation {

    public ComplexNumber operate(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginaryPart = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
