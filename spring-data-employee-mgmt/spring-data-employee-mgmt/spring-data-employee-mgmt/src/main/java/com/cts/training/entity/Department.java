package com.cts.training.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


@Entity
@Table(name="departments")
public class Department {

	@Id
	@Column(name="department_id")
	private String deptId;
	
	@Column(name="department_name")
	private String deptName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="manager_id")
	private Employee manager;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="location_id")
	private Location locations;
}
