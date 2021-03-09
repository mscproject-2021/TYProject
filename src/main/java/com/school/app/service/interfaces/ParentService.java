package com.school.app.service.interfaces;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.school.app.model.Parent;

public interface ParentService 
{
	public ResponseEntity<Object> saveParent(Parent parent);
	
	public ResponseEntity<List<Parent>> getAllParents();
	
	public ResponseEntity<Object> getParentById(int id);
	
	public ResponseEntity<Object> updateParent(Parent parent,int id);
	
	public ResponseEntity<Object> deleteParentById(int id);
}
