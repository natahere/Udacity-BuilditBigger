package com.example;

import java.util.Random;

public class JokeSource {
        //jokes in tamil - presented here in Tanglish
    public static String[] jokes = {"Wht she is telling ?…… Y blood………um same blood",
            "Hello Dubai yaaaaa……  ",
            "Sing in Rain … iam shoiiiing in the rain   ",
            "You mean waste land? ",
            "My family, total damage!",
            "Ey ey ey mister, adhigari nu sonnadhu enna",
            "Naa appidiye Shock ayiten",
            "Enagaluuku Risk edukkarthu ellam rusk saapidra maathiri",
            "Yey…… Enna vechu comedy geemedy oonum pannaliye!",
            "Oh Ethu Thaan azhagula mayakaratha …?",
            "Ethukku melaiyuma azhagu venum…… ",
            "Ennada pozhuthu poidche , onnum aagalaye nu nenachen",
            "Building strongu… basementu    weak"};

    public String getJoke()
    {
        return jokes[(new Random()).nextInt(jokes.length)];
    }
}
