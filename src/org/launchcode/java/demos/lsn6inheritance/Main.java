package org.launchcode.java.demos.lsn6inheritance;

public class Main  {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

        HouseCat nana = new HouseCat("Nana");
        System.out.println(nana.getWeight());

        //Cat plainCat = new Cat(8.2);

        HouseCat speakerCat = new HouseCat("spearkerCat",12);
        //System.out.println(plainCat.noise()+" " + plainCat.getWeight());
        System.out.println(speakerCat.noise());





    }




}
