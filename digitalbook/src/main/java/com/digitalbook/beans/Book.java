package com.digitalbook.beans;

import org.springframework.stereotype.Component;

@Component
public class Book {

	private int id;
	private String title;
	private String author;
	private float price;
	private String publisher;
	private String category;
	private int author_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Book [author_id=" + author_id + ", title=" + title + ", author=" + author + ", price=" + price
				+ ", publisher=" + publisher + ", category=" + category + "]";
	}

}
