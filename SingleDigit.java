package com.company;

public class SingleDigit extends NumberToWords{
    public SingleDigit(Number number){
        super(number);
    }
    public void return_by_words(){
        super.return_by_words();
        index++;
        if(numberbydigits.get(index) == 0)
            return;
        if(index != 0 && numberbydigits.get(index-1) == 1 && (index == 3 || index == 6 || index == 9))
            return;
        if(index == 1 && numberbydigits.get(index) == 1)
            return;
        if((index == 4 || index == 7) && numberbydigits.get(index) == 1 )
            return;
        if(index == 6 && numberbydigits.get(index) == 1 && (numberbydigits.get(index-1) == 0 && numberbydigits.get(index-2) == 0))
            return;
        result.add(numberbywords.get(numberbydigits.get(index)));
    }
}
