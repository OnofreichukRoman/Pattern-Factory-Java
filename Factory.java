package com.company;

public class Factory {
    public Stack getStack(String type) throws Exception {
        switch (type) {
            case "Double":
                return new MyStackDouble();
            case "Integer":
                return new MyStackInteger();
            case "Char":
                return new MyStackChar();
            default:
                throw new Exception("Ошибка! Не выбран тип стека");
        }
    }

    public Stack getStack(String type, int size) throws Exception {
        switch (type) {
           case "Double":
                return new MyStackDouble(size);
            case "Integer":
                return new MyStackInteger(size);
            case "Char":
                return new MyStackChar(size);
            default:
                throw new Exception("Ошибка! не выбран тип стека");
        }
    }
}
