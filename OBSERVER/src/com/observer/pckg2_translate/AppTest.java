package com.observer.pckg2_translate;

import com.observer.pckg2_translate.tight_coupling.Translator;

import javax.management.InvalidAttributeValueException;

public class AppTest {
    public static void main(String[] args) {

        Translator translator = new Translator();
        translator.setChoice(2);
        try {
            translator.translateThis("Ovo je za prijevod");
        } catch (InvalidAttributeValueException e) {
            System.out.println(e.getMessage());
        }
    }
}
