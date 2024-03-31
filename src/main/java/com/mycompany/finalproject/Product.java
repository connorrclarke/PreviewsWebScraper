/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproject;

import java.io.Serializable;

/**
 *
 * @author Clarke_876632
 */
class Product implements Serializable{
    
    private String name;
    private String contents;
    private String publisher;
    private String release;
    private Double price;
    private String solicitNum;
    private int priority;

    //constructor
    public Product(String name, String contents, String publisher, String release, Double price, String solicitNum, int priority) {
        this.name = name;
        this.contents = contents;
        this.publisher = publisher;
        this.release = release;
        this.price = price;
        this.solicitNum = solicitNum;
        this.priority = priority;
    }
    
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSolicitNum() {
        return solicitNum;
    }

    public void setSolicitNum(String solicitNum) {
        this.solicitNum = solicitNum;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", contents=" + contents + ", publisher=" + publisher + ", release=" + release + ", price=" + price + ", solicitNum=" + solicitNum + ", priority=" + priority + '}';
    }
}
