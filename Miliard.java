package com.company;

public class Miliard extends NumberToWords{
    public Miliard(Number number){
        super(number);
    }
    public void return_by_words(){
        super.return_by_words();
        if(numberbydigits.get(index) == 0)
            return;
        result.add( "miliard ");
    }
}
