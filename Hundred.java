package com.company;

public class Hundred extends NumberToWords{
    public Hundred(Number number){
        super(number);
    }
    public void return_by_words(){
        super.return_by_words();
        if(numberbydigits.get(index) == 0)
            return;
        result.add( "haryur ");
    }
}
