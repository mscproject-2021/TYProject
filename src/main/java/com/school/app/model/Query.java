package com.school.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Query {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false,length = 4)
	private int queryId;
	
	@ManyToOne
	private Parent parent;
	
	@NotNull
	@Column(length = 100,nullable = false)
	@Size(max = 100)
	private String queryMessage;
	
	@Column(length = 100)
	@Size(max = 100)
	private String responseMessage;

	//default Constructor
	public Query() 
	{
		super();
	}

	//Parameterized Constructor
	public Query(int queryId, Parent parent, @NotNull @Size(max = 100) String queryMessage,
			@Size(max = 100) String responseMessage) {
		super();
		this.queryId = queryId;
		this.parent = parent;
		this.queryMessage = queryMessage;
		this.responseMessage = responseMessage;
	}

	//getters and setters
	public int getQueryId() {
		return queryId;
	}

	public void setQueryId(int queryId) {
		this.queryId = queryId;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public String getQueryMessage() {
		return queryMessage;
	}

	public void setQueryMessage(String queryMessage) {
		this.queryMessage = queryMessage;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	@Override
	public String toString() {
		return "Query [queryId=" + queryId + ", parent=" + parent + ", queryMessage=" + queryMessage
				+ ", responseMessage=" + responseMessage + "]";
	}
	
	
}