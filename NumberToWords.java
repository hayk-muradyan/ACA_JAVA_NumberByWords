package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class NumberToWords extends NumberByDigits implements Number{
    public Number number;


    protected static HashMap<Integer,String> numberbywords;

    public NumberToWords(Number number){
        this.number = number;

    }

    public static void InitHashMap(){
        numberbywords = new HashMap<>();
        numberbywords.put(1,"mek ");
        numberbywords.put(2,"erku ");
        numberbywords.put(3,"ereq ");
        numberbywords.put(4,"chors ");
        numberbywords.put(5,"hing ");
        numberbywords.put(6,"vec ");
        numberbywords.put(7,"yot ");
        numberbywords.put(8,"ut ");
        numberbywords.put(9,"iny ");
        numberbywords.put(10,"tas ");
        numberbywords.put(11,"tasnmek ");
        numberbywords.put(12,"tasnerku ");
        numberbywords.put(13,"tasnereq ");
        numberbywords.put(14,"tasnchors ");
        numberbywords.put(15,"tasnhing ");
        numberbywords.put(16,"tasnvec ");
        numberbywords.put(17,"tasnyot ");
        numberbywords.put(18,"tasnut ");
        numberbywords.put(19,"tasniny ");
        numberbywords.put(20,"qsan ");
        numberbywords.put(30,"eresun ");
        numberbywords.put(40,"qarasun ");
        numberbywords.put(50,"hisun ");
        numberbywords.put(60,"vatsun ");
        numberbywords.put(70,"yotanasun ");
        numberbywords.put(80,"utsun ");
        numberbywords.put(90,"inysun ");
    }
    public void return_by_words(){
        number.return_by_words();
    }
}
