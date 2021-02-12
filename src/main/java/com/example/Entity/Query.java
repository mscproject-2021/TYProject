package com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

@Entity
public class Query {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="query_id",updatable = false,length = 4)
	private int query_id;
	//one parent has many queries
	@ManyToOne
	@JoinColumn(name="parentId")
	private Parent parent;
	@NonNull
	private String query_message;
	@Nullable
	private String response_message;
	public Query() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Query(int query_id, Parent parent, String query_message, String response_message) {
		super();
		this.query_id = query_id;
		this.parent = parent;
		this.query_message = query_message;
		this.response_message = response_message;
	}
	public int getQuery_id() {
		return query_id;
	}
	public void setQuery_id(int query_id) {
		this.query_id = query_id;
	}
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	public String getQuery_message() {
		return query_message;
	}
	public void setQuery_message(String query_message) {
		this.query_message = query_message;
	}
	public String getResponse_message() {
		return response_message;
	}
	public void setResponse_message(String response_message) {
		this.response_message = response_message;
	}
	@Override
	public String toString() {
		return "Query [query_id=" + query_id + ", parent=" + parent + ", query_message=" + query_message
				+ ", response_message=" + response_message + "]";
	}
}