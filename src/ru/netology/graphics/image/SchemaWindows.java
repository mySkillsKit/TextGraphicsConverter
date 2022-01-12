package ru.netology.graphics.image;


public class SchemaWindows implements TextColorSchema {

    char[] arrayC = new char[]{'#', '$', '@', '%', '*', '+', '-', '"' };

    @Override
    public char convert(int color) {

        int index = (int) (color / (256.00 / arrayC.length));  //  index = 0...(arrayC.length-1)
        char с = arrayC[index];
        return с;
    }
}
