package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Query {

	@Id
	private int query_id;
	private int parent_id;
	private String query_message;
	private String response_message;
	public Query() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Query(int query_id, int parent_id, String query_message, String response_message) {
		super();
		this.query_id = query_id;
		this.parent_id = parent_id;
		this.query_message = query_message;
		this.response_message = response_message;
	}
	public int getQuery_id() {
		return query_id;
	}
	public void setQuery_id(int query_id) {
		this.query_id = query_id;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
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
		return "Query [query_id=" + query_id + ", parent_id=" + parent_id + ", query_message=" + query_message
				+ ", response_message=" + response_message + "]";
	}
	
	
}
