package com.company;

public class DoubleDigit extends NumberToWords{
    public DoubleDigit(Number number){
        super(number);
    }
    public void return_by_words(){
        super.return_by_words();
        index++;
        if(numberbydigits.get(index) == 0)
            return;
        if(numberbydigits.get(index) == 1){
            result.add(numberbywords.get(numberbydigits.get(index)*10 + numberbydigits.get(index+1)));
            return;
        }
        result.add( numberbywords.get(numberbydigits.get(index)*10));
    }
}
