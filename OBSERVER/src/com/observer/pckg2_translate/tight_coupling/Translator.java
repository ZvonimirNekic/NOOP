package com.observer.pckg2_translate.tight_coupling;

import javax.management.InvalidAttributeValueException;

public class Translator {

    private int choice;
    private final EnglishTranslator englishTranslator;
    private final FrenchTranslator frenchTranslator;
    //što znači final - finalna referenca - ne možeš setterom staviti novi - koristi se uvijek taj koji je obavezno definiran u konstruktoru

    public Translator(){
        System.out.println("CRO to ENG and CRO to FRA translator");
        englishTranslator = new EnglishTranslator();
        frenchTranslator = new FrenchTranslator();
    }

    public void setChoice(int number){
        this.choice = number;
    }

    public void translateThis(String text) throws InvalidAttributeValueException {
        switch (choice){
            case 1: {
                englishTranslator.translateText(text);
            } break;
            case 2: {
                frenchTranslator.translate(text);
            } break;
            default: throw new InvalidAttributeValueException("Expected 1 or 2");
        }
    }
}
