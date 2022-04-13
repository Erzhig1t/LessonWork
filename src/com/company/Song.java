package com.company;

public class Song {
    private String title;
    private String author;
    private String text;

    public Song(String title, String author, String text) {
        this.title = title;
        this.author = author;
        this.text = text;
    }
    public Song(){

    }

    public String getTitle() {
        return title;
    }

    public int setTitle(String title) {
        this.title = title;
        return 0;
    }

    public String getAuthor() {
        return author;
    }

    public int setAuthor(String author) {
        this.author = author;
        return 0;
    }

    public String getText() {
        return text;
    }

    public int setText(String text) {
        this.text = text;
        return 0;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}


