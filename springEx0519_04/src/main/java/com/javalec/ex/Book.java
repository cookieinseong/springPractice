package com.javalec.ex;

public class Book {
	
	private int bookNum;
	private String bookTitle;
	private String kind;
	private String author;
	
	public int getBookNum() {
		return bookNum;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void bookPrint() {
		System.out.println("책 번호 : " + getBookNum());
		System.out.println("책 제목 : " + getBookTitle());
		System.out.println("책 종류 : " + getKind());
		System.out.println("책 저자 : " + getAuthor());
	}
	
	
	
}
