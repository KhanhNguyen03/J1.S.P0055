/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu("CANDIDATE MANAGERMANT SYSTEM", new String[] {"Experience","Fresher","Internship","Searching","Exit"});
        menu.run();

    }
}
