package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        Factory factory = new Factory();

        Stack stack = factory.getStack("Double", 6);

        System.out.println("Создадим стек Double на 6 элементов");
        System.out.println("Добавим 11,12,13,14,15,16 в стек");

        stack.add(11);
        stack.add(12);
        stack.add(13);
        stack.add(14);
        stack.add(15);
        stack.add(16);

        System.out.println("Добавим 17 в стек");
        stack.add(17);

        System.out.println("Содержание стека:");
        stack.getElem();
        System.out.println("Стек полон " + stack.full());
        System.out.println("Извлекаем 4 элемент " + stack.izvDouble(4));
        System.out.println("Извлекаем 2 элемент " + stack.izvDouble(2));
        System.out.println("Извлекаем 5 элемент " );
        stack.izvDouble(5);

        System.out.println("Размер стека: " + stack.getSize());
        System.out.println("Количество элементов стека: " + stack.getElemNum());

        stack.getElem();
        System.out.println("Извлекаем верхний элемент");
        stack.izvDouble();
        stack.getElem();
        System.out.println("Извлекаем верхний элемент");
        stack.izvDouble();
        stack.getElem();
        System.out.println("Извлекаем верхний элемент");
        stack.izvDouble();
        stack.getElem();
        System.out.println("Извлекаем верхний элемент");
        stack.izvDouble();
        stack.getElem();
        System.out.println("Извлекаем верхний элемент");
        stack.izvDouble();
        stack.getElem();

        System.out.println("Стек пустой " + stack.pust());

        Stack stackChar = factory.getStack("Char",4);


        System.out.println("\nСоздадим стек Char на 4 элементa");
        System.out.println("Добавим a,b,c,d");

        stackChar.add('a');
        stackChar.add('b');
        stackChar.add('c');
        stackChar.add('d');

        System.out.println("Добавим f в стек");
        stackChar.add('f');

        System.out.println("Содержание стека:");
        stackChar.getElem();
        System.out.println("Стек полон " + stackChar.full());
        System.out.println("Извлекаем 3 элемент " + stackChar.izvChar(3));
        System.out.println("Извлекаем 1 элемент " + stackChar.izvChar(1));
        System.out.println("Извлекаем 4 элемент " );
        stackChar.izvChar(4);

        System.out.println("Размер стека: " + stackChar.getSize());
        System.out.println("Количество элементов стека: " + stackChar.getElemNum());

        stackChar.getElem();
        System.out.println("Извлекаем верхний элемент");
        stackChar.izvChar();
        stackChar.getElem();
        System.out.println("Извлекаем верхний элемент");
        stackChar.izvChar();
        stackChar.getElem();
        System.out.println("Извлекаем верхний элемент");
        stackChar.izvChar();
        stackChar.getElem();

        System.out.println("Стек пустой " + stackChar.pust());
    }
}
