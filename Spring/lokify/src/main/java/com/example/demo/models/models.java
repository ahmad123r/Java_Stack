package com.example.demo.models;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="lookify1")
public class models {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@NotNull
@Size(min=5,max=200)
private String title;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
@NotNull
@Size(min=5,max=200)
private String name;
@NotNull

private int rating;
//This will not allow the createdAt column to be updated after creation
@Column(updatable=false)
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date createdAt;
public models(  String name,  int rating,String title) {
	
	this.name = name;
	this.rating = rating;
	this.title = title;
}
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date updatedAt;
public models() {
	
}
@PrePersist
protected void onCreate(){
    this.createdAt = new Date();
}
@PreUpdate
protected void onUpdate(){
    this.updatedAt = new Date();
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public Date getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}
public Date getUpdatedAt() {
	return updatedAt;
}
public void setUpdatedAt(Date updatedAt) {
	this.updatedAt = updatedAt;
}
}

