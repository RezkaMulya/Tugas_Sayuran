/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class serviceProject {
    public ArrayList<String> Tabel(){
        ArrayList<String> sayur = new ArrayList<>();
        sayur.add("kangkung");
        sayur.add("Kubis");
        return sayur;
        
    }
    public ArrayList<String> Harga(){
        ArrayList<String> harga = new ArrayList<>();
        harga.add("3000");
        harga.add("2500");
        return harga;
    }
}
