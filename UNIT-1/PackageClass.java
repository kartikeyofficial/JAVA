package com.example.myproject;
public class PackageClass {
    int attr;
    void setAttr(int attr){
        this.attr= attr;
    }
    int getAttr(){
        return attr;
    }
}
class PackageMain{
    public static void main(String[] args) {
        PackageClass c1 = new PackageClass();
        c1.setAttr(34);
        System.out.println(c1.getAttr());
    }
}
