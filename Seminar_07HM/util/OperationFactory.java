package Seminar_07HM.util;

public interface OperationFactory {
    ComplexOperation createAddOperation();
    ComplexOperation createSubtractOperation();
    ComplexOperation createMultiplyOperation();
    ComplexOperation createDivideOperation();
}
