package com.company;

import java.util.Date;

public class Transaction {
    public Human seller;
    public Human buyer;
    public Double price;
    public Date transactionDate;

    public Transaction(Human seller, Human buyer, Double price, Date transactionDate) {
        this.seller = seller;
        this.buyer = buyer;
        this.price = price;
        this.transactionDate = transactionDate;
    }

    public Transaction(Human buyer, Double price, Date transactionDate) {
        this.buyer = buyer;
        this.price = price;
        this.transactionDate = transactionDate;
    }

    public static Human getOwner(Transaction lastTransaction) {
        return lastTransaction.buyer;
    }

    public boolean wasOwner(Human human) {
        return buyer == human;
    }

    public boolean sellerAndBuyer(Human seller, Human buyer) {
        return this.seller == seller && this.buyer == buyer;
    }

}
