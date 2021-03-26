package com.company;

public class Thousand extends  NumberToWords{
    public Thousand(Number number){
        super(number);
    }
    public void return_by_words(){
        super.return_by_words();
        if(numberbydigits.get(index) == 0 && (numberbydigits.get(index-1) == 0 && numberbydigits.get(index-2) == 0))
            return;
        result.add("hazar ");
    }
}
