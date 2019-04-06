package com.romanstetsiuk.myapp;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("toUpper")
public class StringEffectToUpper implements StringEffect {
    @Override
    public String apply(String string) {
        return string.toUpperCase();
    }
}
