package com.romanstetsiuk.myapp;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("reverse")
public class StringEffectReverse implements StringEffect {
    @Override
    public String apply(String string) {
        StringBuilder stringReverse = new StringBuilder(string);
        return stringReverse.reverse().toString();
    }
}
