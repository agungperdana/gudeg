package com.kratonsolution.product.gudeg.model;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Agung Dodi Perdana
 * @emai agung.dodi.perdana@gmail.com
 */
@Getter
@Setter
public class Expense {

	private double monthly;

	private double expense1;

	private double expense2;

	private double expense3;

	private double expense4;

	private double expense5;

	private double expense6;

	private double expense7;

	private double expense8;

	private double expense9;

	private double expense10;

	private double expense11;

	private double expense12;

	private double expense13;

	private double expense14;

	private double expense15;

	private double expense16;

	private double expense17;

	private double expense18;

	private double expense19;

	private double expense20;

	private double expense21;

	private double expense22;

	private double expense23;

	private double expense24;

	private double expense25;

	private double expense26;

	private double expense27;

	private double expense28;

	private double expense29;

	private double expense30;

	private double expense31;
	
	@Override
	public String toString() {

		Map<String, Object> map = new HashMap<>();
		map.put("monthly", monthly);
		map.put("expense1", expense1);
		
		return map.toString();
	}
}
