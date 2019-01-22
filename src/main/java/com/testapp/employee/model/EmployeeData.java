package com.testapp.employee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.UuidGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name = "Employee")
public class EmployeeData implements Serializable {
	
	@UuidGenerator(name = "EMP_KEY")
	@Id	
	@GeneratedValue(generator = "EMP_KEY")
	@Column(name = "\"EmployeeKey\"", length = 36, nullable = false)
	private String key;
	
	@Column(name = "\"EmpId\"", length = 20, nullable = false)
	private String empId;
	
	@Column(name = "\"EmployeeFirstName\"", length = 20, nullable = false)
	private String empFirstName;	
	
	@Column(name = "\"EmployeeLastName\"", length = 20, nullable = false)
	private String empLastName;
	
	@Column(name = "\"EmployeeDepartmentName\"", length = 50, nullable = false)
	private String empDept;	
	
	@Column(name = "\"EmployeeAge\"", length = 2, nullable = false)
	private String empAge;		
	
	@CreatedBy
	@Column(name = "\"CreatedBy\"", length = 254)
	private String createdBy;

	@CreatedDate
	@Column(name = "\"CreatedOn\"", length = 50)
	private String createdOn;

	@LastModifiedBy
	@Column(name = "\"ChangedBy\"", length = 254)
	private String changedBy;

	@LastModifiedDate
	@Column(name = "\"ChangedOn\"", length = 50)
	private String changedOn;	
}
