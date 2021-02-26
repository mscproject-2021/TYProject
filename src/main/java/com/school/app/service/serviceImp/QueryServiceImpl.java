package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.Query;
import com.school.app.repository.QueryRepository;
import com.school.app.service.serviceClass.QueryService;

@Service
public class QueryServiceImpl implements QueryService
{
	@Autowired
	QueryRepository queryrepository;
	
	@Override
	public Query saveQuery(Query query)
	{
		return queryrepository.save(query);
	}

	@Override
	public List<Query> getAllQueries()
	{
		return (List<Query>)queryrepository.findAll();
	}

	@Override
	public Query getQueryById(int id)
	{
		return queryrepository.findById(id).get();
	}

	@Override
	public Query updateQuery(int id, Query query) 
	{
		return queryrepository.save(query);
	}

	@Override
	public void deleteQueryById(int id)
	{
		queryrepository.deleteById(id);
	}

	@Override
	public void deleteAllQueries() 
	{
		queryrepository.deleteAll();
	}
	
}
