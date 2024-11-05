/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.treell;

/**
 *
 * @author JUNAID COMPUTER
 */
public class TreeLL {
   
   
    private TNode root;
    public TreeLL(String value,int childrensize){
    root= new TNode(value,childrensize);
        System.out.println("Node "+value+" has been created");
    }
    

    public static void main(String[] args) {
       TreeLL t = new TreeLL("A",2); 
       TNode B=new TNode("B",3);
       TNode C=new TNode("C",2);
       
       t.root.addChild(B);
       t.root.addChild(C);
       t.root.display(C, 2);
        System.out.println("B");
    }
}
