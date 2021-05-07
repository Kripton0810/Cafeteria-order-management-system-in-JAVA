/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ItemModelClass {
    public String pname;
    public String pid;
    public double mrp;
    public int qty;
//
//    public ItemModelClass(String pname, String pid, double mrp, int qty) {
//        this.pname = pname;
//        this.pid = pid;
//        this.mrp = mrp;
//        this.qty = qty;
//    }

    public ItemModelClass(String pname, double mrp, int qty) {
        this.pname = pname;
        this.mrp = mrp;
        this.qty = qty;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public double getMrp() {
        return mrp;
    }

    public void setMrp(double mrp) {
        this.mrp = mrp;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
}
