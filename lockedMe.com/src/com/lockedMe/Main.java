package com.lockedMe;

public class Main {

    /*Enter your desired Directory path */
    public static final String path = "D:\\viDirectory";

    public static void main(String[] args) {
        Menus menu = new Menus();
        menu.introScreen();
        menu.mainMenu();
    }

}