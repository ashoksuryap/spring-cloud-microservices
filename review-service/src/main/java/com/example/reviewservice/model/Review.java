package com.example.reviewservice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "review")
public class Review implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3885840258330994202L;

	@Id
	private Long id;

	private String isbn;

	private String review;

	private String createdBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
