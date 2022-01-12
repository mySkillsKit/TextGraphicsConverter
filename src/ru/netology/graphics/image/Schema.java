package ru.netology.graphics.image;


public class Schema implements TextColorSchema {

    char[] arrayC = new char[]{'▇', '●', '◉', '◍', '◎', '○', '☉', '◌', '-'};

    @Override
    public char convert(int color) {

        int index = (int) (color / (256.00 / arrayC.length));  //  index = 0...(arrayC.length-1)
        char с = arrayC[index];
        return с;
    }
}
//ASCII-символы:
// '▇', '●', '◉', '◍', '◎', '○', '☉', '◌', '-'     // 9 символов
// '#', '$', '@', '%', '*', '+', '-', '"'       // 8 символов Если вы программируете на винде

/*256/9 = 28,4444
int color = 150
char c = 150/28,44444 = 5,274 = (int) 5 - индекс




В зависимости от переданного значения интенсивности белого,
  должен выбираться соответствующий символ.
  Например, если значение близко к 0, то выбрать надо '▇'; если к 255, то '-'.
  Если где-то посередине, то и выбирать надо тоже где-то посередине.
 * */