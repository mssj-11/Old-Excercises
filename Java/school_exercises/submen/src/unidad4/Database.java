/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Database {
    
private ArrayList<CD> cds;
private ArrayList<DVD> dvds;


public void list()
{ 
    cds.stream().map((cd) -> {
        cd.print();
        return cd;
    }).forEachOrdered((_item) -> {
        System.out.println();
    });
    dvds.stream().map((dvd) -> {
        dvd.print();
        return dvd;
    }).forEachOrdered((_item) -> {
        System.out.println();
    });
}
    
    
}
