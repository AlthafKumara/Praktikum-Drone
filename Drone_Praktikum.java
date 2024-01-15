
package drone_praktikum;

public class Drone_Praktikum {

   
    public static void main(String[] args) {
   
        Drone system = new Drone();
        
        system.merek = "DJI Mini";
        system.energi = 15;
        system.kecepatan = 10;
        system.ketinggian = 0;
        
        system.terbang();
        system.maju();
        system.mundur();
        system.belok();
        system.turun();
        system.matikanMesin();
    }
    
}
