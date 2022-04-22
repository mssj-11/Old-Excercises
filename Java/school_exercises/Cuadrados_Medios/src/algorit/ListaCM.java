/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorit;

import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class ListaCM {

    public static ArrayList<String> lista;

    public static void init() {
        lista = new ArrayList<String>();
    }

    public static void add(String item) {
        lista.add(item);
    }

    public static boolean ifExist(String item) {
        boolean f = false;
        if (!isEmpty()) {
            Object[] all = lista.toArray();
            int l = all.length;
            for (int i = 0; i < l; i++) {
                if (all[i].toString().equals(item)) {
                    f = true;
                    break;
                }
            }

        }
        return f;
    }

    public static boolean isEmpty() {
        Object[] all = lista.toArray();
        if (all.length == 0) {
            return true;
        }
        return false;
    }

}
