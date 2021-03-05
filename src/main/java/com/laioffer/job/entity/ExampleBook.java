package com.laioffer.job.entity;

public class ExampleBook {
    public String title;
    public String author;
    public String date;
    public double price;
    public String currency;
    public int pages;
    public String series;
    public String language;
    public String isbn;

    // why empty constructor?
    // because JackSON needs it.
    // But doesn't java provide an empty constructor for us?
    // yes, but when we write our own constructor, the empty constructor created by Java will be covered.
    public ExampleBook() {}

    public ExampleBook(String title, String author, String date, double price, String currency, int pages, String series, String language, String isbn) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.price = price;
        this.currency = currency;
        this.pages = pages;
        this.series = series;
        this.language = language;
        this.isbn = isbn;
    }
}
