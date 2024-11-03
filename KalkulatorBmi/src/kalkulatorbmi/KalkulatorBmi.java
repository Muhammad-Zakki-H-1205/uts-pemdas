/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulatorbmi;

/**
 *
 * @author ASUS
 */
public class KalkulatorBmi {
    int tinggiBadan;
    int beratBadan;
    
    public KalkulatorBmi (int tinggiBadan, int beratBadan){
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }
    
    public void BMI(){
        double x = tinggiBadan / (beratBadan * 2 / 100);
        System.out.println("hasil Bmi anda " + x);
        if (x < 18){
        System.out.println("anda termasuk kategori kurus");}
        else if (x >= 18 && x <= 25){
        System.out.println("anda termasuk kategori normal");}
        else if (x >= 25 && x <= 30){
        System.out.println("anda termasuk kategori berat badan berlebihan");}
        else {
        System.out.println("anda termasuk kategori obesitas");}
        }
    }
