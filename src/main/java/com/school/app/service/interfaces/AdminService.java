package com.school.app.service.interfaces;

//import java.util.List;
import org.springframework.http.ResponseEntity;
import com.school.app.model.Admin;
import com.school.app.model.SchoolDetail;

public interface AdminService 
{
	//Admin
	public ResponseEntity<Object> saveAdmin(Admin admin);
	
	//public ResponseEntity<List<Activity>> getAllAdmins();
	
	public ResponseEntity<Object> getAdminById(int id);
	
 	public ResponseEntity<Object> updateAdmin(Admin admin,int id);
 	
 	//public ResponseEntity<Object> deleteAdminById(int id);
 	
 	//schooldetails
 	public  ResponseEntity<Object> updateSchoolDetail(SchoolDetail schooldetail,int id);

 	public ResponseEntity<Object> getSchoolDetailById(int id);
}
