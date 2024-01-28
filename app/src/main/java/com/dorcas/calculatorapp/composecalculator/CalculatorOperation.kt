package com.dorcas.calculatorapp.composecalculator

sealed class CalculatorOperation(val symbol: String){
    object  Add:CalculatorOperation("+")
    object  Subtract:CalculatorOperation("-")
    object  Multiplication:CalculatorOperation("x")
    object  Division:CalculatorOperation("/")
    object  Bracket:CalculatorOperation("()")
    object  Percentage:CalculatorOperation("%")
    object  PlusMinus :CalculatorOperation("+/-")






}
