package exercises.technology;

import java.util.Scanner;

public class Computer extends AbstractEntity{

    private int ram;
    private int storage;
    private String manufacturer = "SONY";

    public Computer(int ram, int storage) {
        super();
        this.ram = ram;
        this.storage = storage;
        this.manufacturer = manufacturer;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ramToAdd) {
        this.ram=ram + ramToAdd;
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storageToAdd) {
        this.storage= storage + storageToAdd;
        this.storage = storage;
    }

    public String getManufacturer() {
        return manufacturer;
    }



}
