package com.company;

abstract class Stack {

    int index = -1;
    int size;

    boolean full() {
        return (index == size - 1);
    }

    boolean pust() {
        return (index == -1);
    }

    int getElemNum() {
        return index + 1;
    }

    int getSize() {
        return size;
    }

    abstract public void getElem();

    public void add(double el) {
    }

    public void add(int el) {
    }

    public void add(char el) {
    }

    double izvDouble() {
        return 0;
    }

    int izvInteger() {
        return 0;
    }

    char izvChar() {
        return 0;
    }

    double izvDouble(int a) {
        return 0;
    }

    int izvInteger(int a) {
        return 0;
    }

    char izvChar(int a) {
        return 0;
    }
}