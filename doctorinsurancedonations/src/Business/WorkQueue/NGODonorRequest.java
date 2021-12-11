/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author dineshmurugesan
 */
public class NGODonorRequest extends WorkRequest{
    private String name;
    private String address;
    private int contribution;
    
    public NGODonorRequest(String name, String address, int contribution){
        this.name = name;
        this.address = address;
        this.contribution = contribution;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContribution() {
        return contribution;
    }

    public void setContribution(int contribution) {
        this.contribution = contribution;
    }

}

