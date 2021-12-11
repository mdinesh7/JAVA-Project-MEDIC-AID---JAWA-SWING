/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author dineshmurugesan
 */
public class NGOFundRequest extends WorkRequest{
    
    private String hospname;
    private String hospaddress;
    private int neededamtreq;
    
    public NGOFundRequest(String hospname, String hospaddress, int neededamtreq){
        this.hospname = hospname;
        this.hospaddress = hospaddress;
        this.neededamtreq = neededamtreq;
    }
    
    
    @Override
    public String toString() {
        return hospname;
    }

    public String getHospname() {
        return hospname;
    }

    public void setHospname(String hospname) {
        this.hospname = hospname;
    }

    public String getHospaddress() {
        return hospaddress;
    }

    public void setHospaddress(String hospaddress) {
        this.hospaddress = hospaddress;
    }

    public int getNeededamtreq() {
        return neededamtreq;
    }

    public void setNeededamtreq(int neededamtreq) {
        this.neededamtreq = neededamtreq;
    }

    
    
    
}
