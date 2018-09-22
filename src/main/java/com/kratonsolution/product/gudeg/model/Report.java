package com.kratonsolution.product.gudeg.model;

import java.time.Month;
import java.util.TreeMap;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Agung Dodi Perdana
 * @emai agung.dodi.perdana@gmail.com
 */
@Getter
@Setter
@Document
public class Report {
	
	@Id
	private String id = UUID.randomUUID().toString();
	
	private Month month = Month.JANUARY;
	
	private int year = 2018;
	
	private Expense expense = new Expense();
	
	private TreeMap<String, DailyIncome> incomes = new TreeMap<>();
}
