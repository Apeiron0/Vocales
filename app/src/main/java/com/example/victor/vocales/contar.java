package com.example.victor.vocales;

/**
 * Created by victor on 13/02/15.
 */
public class contar {

    public int vocales(String palabra){

        int v=0;

        char letra;


        for (int x=0;x<palabra.length()-1;x++){

            letra=palabra.charAt(x);

            if (letra=='a'||letra=='A'||letra=='e'||letra=='E'||letra=='i'||letra=='I'||letra=='o'||letra=='O'||letra=='u'||letra=='U'){
                v++;
            }
        }

        return v;
    }
}




