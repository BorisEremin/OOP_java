package Seminar_07HM.util.impl;

import Seminar_07HM.util.ComplexNumber;
import Seminar_07HM.util.ComplexOperation;

public class DivideOperation implements ComplexOperation {

    public ComplexNumber operate(ComplexNumber a, ComplexNumber b) {

        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double realPart = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        double imaginaryPart = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        return new ComplexNumber(realPart, imaginaryPart);
    }

}
