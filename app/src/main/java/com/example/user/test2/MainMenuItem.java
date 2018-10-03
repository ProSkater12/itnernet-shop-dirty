package com.example.user.test2;

/**
 * Элемент главного меню в горизонтальной ленте "Новинки" и "Самые продаваемые товары"
 * Created by User on 30.05.2018.
 */
import android.graphics.drawable.Drawable;

public class MainMenuItem {
    String title; //название
    String price; //цена
    String number; //кол-во предметов
    Drawable image; //картинка
    Drawable buyIcon; //картинка "Купить"
    Drawable minusBtn; //кнопка(картинка) "-1"
    Drawable plusBtn; //кнопка(картинка) "+1"
    Drawable moreBtn; //кнопка(картинка) "подробнее"



    //пустой конструктор
    public MainMenuItem(){

    }

    // Конструктор
    public MainMenuItem(String title, Drawable image, String price)
    {
        super();
        this.title = title;
        this.image = image;
        this.price = price;
        this.number = number;
        this.buyIcon = buyIcon;
        this.minusBtn = minusBtn;
        this.plusBtn = plusBtn;
        this.moreBtn = moreBtn;

    }

    // Getter and Setter Method
    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Drawable getImage()
    {
        return image;
    }

    public void setImage(Drawable image)
    {
        this.image = image;
    }

    public String getPrice() { return  price; }

    public void setPrice(String price) { this.price = price; }

    public String getNumber() { return number; }

    public  void setNumber(String number) { this.number = number; }


}
