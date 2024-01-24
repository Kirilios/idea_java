package OOPLections.Lesson_09.Ex004;

import OOPLections.Lesson_09.Ex004.ExBeverage.*;

import java.beans.Beans;

// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Milk("milk"));
        latte.addComponent(new Water("вода"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}
