package ru.netology.graphics;

import ru.netology.graphics.image.*;
import ru.netology.graphics.server.GServer;


public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new Converter();// null; // Создайте тут объект вашего класса конвертера
        TextColorSchema schema = new Schema();
        TextColorSchema schemaWindows = new SchemaWindows();


        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

         //Или то же, но с выводом на экран:

       //converter.setTextColorSchema(schema);
        //converter.setTextColorSchema(schemaWindows);
/*
        String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
        String imgTxt = converter.convert(url);
        System.out.println(imgTxt);*/
    }
}
