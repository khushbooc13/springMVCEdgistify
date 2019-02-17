package com.dao;
import java.sql.ResultSet;     
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;    
import com.bean.User;    
public class UserDao {
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;
	}
	public int save(User p){    
	    String sql="insert into adduserd(name,email,requestLoc,zone,serviceid,serviced,resourcer,file) values('"+p.getName()+"','"+p.getEmail()+"','"+p.getRequestLoc()+"','"+p.getZone()+"',"+p.getService()+",'"+p.getServiceDate()+"',"+p.getRR()+",'"+p.getFileName()+"')";    
	    return template.update(sql);    
	}  
 
}
