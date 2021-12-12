/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author dineshmurugesan
 */
public class Network {
    private String netwrkNm;
    private EnterpriseDirectory entDir;
    
    public Network(){
        entDir=new EnterpriseDirectory();
    }
    public String getNetwrkNm() {
        return netwrkNm;
    }

    public void setNetwrkNm(String netwrkNm) {
        this.netwrkNm = netwrkNm;
    }

    public EnterpriseDirectory getEntDir() {
        return entDir;
    }
    
    @Override
    public String toString(){
        return netwrkNm;
    }
    
}
