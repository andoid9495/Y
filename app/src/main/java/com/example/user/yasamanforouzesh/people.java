package com.example.user.yasamanforouzesh;

/**
 * Created by User on 7/14/2015.
 */
public class people {
    public  String name;
    public  String Biography;
    public String I;
    public int imageResource;
    public int i1;
    public int i2;

    public people(int ImgR,String Name,String Bg,String In){
        imageResource=ImgR;
        name=Name;
        Biography=Bg;
        I=In;

    }


    @Override
    public String toString() {
        return name;
    }
}
