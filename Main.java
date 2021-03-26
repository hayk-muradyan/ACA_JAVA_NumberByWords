package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        NumberToWords.InitHashMap();
        ReturnNumberByWords number = new ReturnNumberByWords(8100800113L);
        System.out.println(number.returnNumberByWords());
    }
}
