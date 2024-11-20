package com.observer.pckg2_translate.loose_coupling;

public class EnglishTranslate implements Translate{
    @Override
    public void translate(String text) {
        System.out.println(getClass().getSimpleName() + " performing translation");
        System.out.println("To translate this: \n" + text);
        System.out.println("Translated to ENG...");
    }
}
