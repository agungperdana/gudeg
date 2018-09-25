package com.kratonsolution.product.gudeg.model;

import java.time.Month;
import java.util.Collection;
import java.util.TreeMap;
import java.util.UUID;
import java.util.Vector;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Agung Dodi Perdana
 * @emai agung.dodi.perdana@gmail.com
 */
@Slf4j
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

	public double getDeduction() {

		double activeDay = 0;
		for(DailyIncome in:incomes.values()) {
			activeDay += in.countActiveDay();
		}

		return expense.getTotal()/activeDay;
	}

	public Collection<PPNInfo> incomesAsList() {

		log.info("Deduction {}", getDeduction());
		
		Vector<PPNInfo> infos = new Vector<>();

		String number = "TRX"+month.getValue()+"."+year;

		if(incomes.get("DAY_1").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_1").toPPNInfo(number, getDeduction()));
		}

		if(incomes.get("DAY_2").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_2").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_3").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_3").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_4").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_4").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_5").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_5").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_6").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_6").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_7").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_7").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_8").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_8").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_9").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_9").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_10").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_10").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_11").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_11").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_12").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_12").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_13").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_13").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_14").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_14").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_15").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_15").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_16").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_16").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_17").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_17").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_18").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_18").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_19").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_19").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_20").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_20").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_21").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_21").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_22").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_22").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_23").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_23").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_24").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_24").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_25").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_25").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_26").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_26").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_27").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_27").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_28").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_28").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_29").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_29").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_30").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_30").toPPNInfo(number, getDeduction()));
		}
		
		if(incomes.get("DAY_31").toPPNInfo(number, getDeduction()).isValid()) {

			infos.add(incomes.get("DAY_31").toPPNInfo(number, getDeduction()));
		}

		return infos;
	}
}
