package com.observer.pckg2_translate.loose_coupling;

public class TestNew {
    public static void main(String[] args) {

        String text = "Ovo je neki tekst koji želimo prevesti na izabrani jezik...";
        TranslatorNew translatorNew = new TranslatorNew();
        translatorNew.setTranslate(new EnglishTranslate());
        translatorNew.translateThisText(text);
        translatorNew.setTranslate(new FRATranslate());
        translatorNew.translateThisText(text);
    }
}
