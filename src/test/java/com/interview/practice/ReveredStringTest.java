package com.interview.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReveredStringTest {

    @Test
    void reveredStringManually() {
        //Given
        final String string= "Hello World!";
        //When
        String reveredStr = ReveredString.reveredStringManually(string);
        //Then
        Assertions.assertEquals("!dlroW olleH",reveredStr);
    }
}