package com.lsy.oop.extendsdemo;

/**
 * TODO
 *
 * @author yuanYuan
 * @version 1.0
 * @date 2020/9/7
 */
public class Wolf extends Animal {
    public Wolf() {
        super("的女儿", 8);
        System.out.println("我是儿子");
    }
}

/**
 * 互相独立的普通的类
 */
class Creature {
    public Creature() {
        System.out.println("我是爷爷");
    }
}

/**
 * 互相独立的普通的类
 */
class Animal extends Creature {
    public Animal(String name) {
        System.out.println("我是爸爸" + name);
    }

    public Animal(String name, int age) {
        this(name);
        System.out.println("我是妈妈" + name + "," + age + "岁");
    }
}