package com.company;

public class MyStackChar extends Stack {
    private char stack[];

    public MyStackChar() {
        stack = new char[1];
        size = 1;
    }

    public MyStackChar(int s) {
        stack = new char[s];
        size = s;
    }

    @Override
    public void getElem() {
        System.out.print("[");
        for (int i = 0; i <= index; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.print("]\n");
    }

    @Override
    public void add(char el) {
        if ((index + 1) == size)
            System.out.println("Ошибка! Стек переполнен");
        else {
            index += 1;
            stack[index] = el;
        }
    }

    @Override
    public char izvChar() {
        if (pust()) {
            System.out.println("Ошибка! Стек пуст");
            return 0;
        } else
            return stack[index--];
    }

    @Override
    public char izvChar(int a) {
        char tmp;
        if (pust()) {
            System.out.println("Стек пуст");
            return 0;
        } else if (a > index + 1) {
            System.out.println("Ошибка! Номер индекса выходит за пределы стека");
            return 0;
        } else
            tmp = stack[a - 1];

        for (int i = a - 1; i < size - 1; i++) {
            stack[i] = stack[i + 1];
        }
        index--;
        return tmp;
    }
}
