package Seminar_07HM.util.impl;

import Seminar_07HM.util.ComplexOperation;
import Seminar_07HM.util.OperationFactory;

public class ConcreateOperationFactory implements OperationFactory {
    @Override
    public ComplexOperation createAddOperation() {
        return new AddOperation();
    }

    @Override
    public ComplexOperation createSubtractOperation() {
        return new SubtractOperation();
    }

    @Override
    public ComplexOperation createMultiplyOperation() {
        return new MultiOperation();
    }

    @Override
    public ComplexOperation createDivideOperation() {
        return new DivideOperation();
    }
}
