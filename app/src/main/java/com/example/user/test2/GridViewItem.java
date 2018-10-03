package com.example.user.test2;

/**
 * Класс нужен для создания элемента в плитке GridView
 * Created by Proskater on 14.05.2018.
 */

import android.graphics.drawable.Drawable;

public class GridViewItem
{
    String title;
    Drawable image;

    // Пустой конструктор
    public GridViewItem()
    {

    }

    // Конструктор
    public GridViewItem(String title, Drawable image)
    {
        super();
        this.title = title;
        this.image = image;
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


}
