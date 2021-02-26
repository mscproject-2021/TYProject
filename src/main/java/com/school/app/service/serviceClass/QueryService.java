package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.Query;

public interface QueryService 
{
	public  Query saveQuery(Query query);
	
	public List<Query> getAllQueries();
	
	public  Query getQueryById(int id);
	
 	public  Query updateQuery(int id, Query query);
 	
 	public void deleteQueryById(int id);
 	
 	public void deleteAllQueries();
}
