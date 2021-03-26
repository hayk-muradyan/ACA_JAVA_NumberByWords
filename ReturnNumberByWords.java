package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class ReturnNumberByWords extends NumberByDigits{
    private Number number;

    public ReturnNumberByWords(long number){
        if(number > 0 && number <= 9999999999L) {
            numberbydigits = new ArrayList<>(Collections.nCopies(10, 0));
            long n = number / 10;
            for (int i = 9; i >= 0; i--) {
                if (number == 0)
                    break;
                else
                    numberbydigits.set(i, (int) (number - n * 10));
                number /= 10;
                n = number / 10;
            }
        }
    }
    public String returnNumberByWords(){
        if(numberbydigits.size() == 0)
            return new String("You have inserted wrong number");

        number = new SingleDigit(new DoubleDigit(new Hundred(new SingleDigit(new Thousand(new SingleDigit(new DoubleDigit(
                new Hundred(new SingleDigit(new Milion(new SingleDigit(new DoubleDigit(new Hundred(new SingleDigit(
                        new Miliard(new SingleDigit(new NumberImplement()))
                )))))))
        )))))));
        number.return_by_words();
        String string = new String();
        for(String str : result)
            string += str;
        return string;
    }
}
