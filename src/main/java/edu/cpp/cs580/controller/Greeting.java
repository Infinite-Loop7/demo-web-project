package edu.cpp.cs580.controller;

import org.apache.commons.math3.primes.Primes;

public class Greeting {

    private int id;
    private boolean prime;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        this.prime = Primes.isPrime(id);
    }

    public String getContent() {
        return String.valueOf(prime);
    }

    public void setContent(String content) {
        this.content = content;
    }

}
