/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen2;

/**
 *
 * @author theo
 */
public class AguaMineral extends Bebida{
    
    private String manatial;

    public AguaMineral(double cantidad, double precio, String marca,String manatial) {
        super(cantidad, precio, marca);
        this.manatial = manatial;
    }

    public String getManatial() {
        return manatial;
    }

    public void setManatial(String manatial) {
        this.manatial = manatial;
    }

    @Override
    public String toString() {
       return super.toString() + "\nManatial : " + manatial;
    }
   
}
