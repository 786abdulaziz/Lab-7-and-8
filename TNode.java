/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.treell;

/**
 *
 * @author JUNAID COMPUTER
 */
public class TNode {
     String data;
    TNode[]children;
    int child_count;
    TNode(String value,int childrensize){
    this.data=value;
    children=new TNode[childrensize];
    child_count=0;
    }
    public void addChild(TNode child1){
    if(child_count<children.length){
    children[child_count++]=child1;
        System.out.println(child1.data+"have been added");
    }else{
        System.out.println("Node is already filled");
    }}
    
    
    public void display(TNode child1,int level){
       if(child1==null){
       return;
       } 
        System.out.println("".repeat(level*2)+child1.data);
        for(int i=0;i<child1.child_count;i++){
          display(child1.children[i],level+1);
        }
    }
}
