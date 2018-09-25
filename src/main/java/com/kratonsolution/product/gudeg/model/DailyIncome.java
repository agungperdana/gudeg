package com.kratonsolution.product.gudeg.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Transient;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * @author Agung Dodi Perdana
 * @emai agung.dodi.perdana@gmail.com
 */
@Getter
@Setter
public class DailyIncome {

	@Transient
	private String number;

	private double day1;

	private double day2;

	private double day3;

	private double day4;

	private double day5;

	private double day6;

	private double day7;

	private double day8;

	private double day9;

	private double day10;

	private double day11;

	private double day12;

	private double day13;

	private double day14;

	private double day15;

	private double day16;

	private double day17;

	private double day18;

	private double day19;

	private double day20;

	private double day21;

	private double day22;

	private double day23;

	private double day24;

	private double day25;

	private double day26;

	private double day27;

	private double day28;

	private double day29;

	private double day30;

	private double day31;

	private double day32;

	private double day33;

	private double day34;

	private double day35;

	private double day36;

	private double day37;

	private double day38;

	private double day39;

	private double day40;

	public int countActiveDay() {

		int active = 0;

		if(day1 > 0d) {
			active++;
		}

		if(day2 > 0d) {
			active++;
		}

		if(day3 > 0d) {
			active++;
		}

		if(day4 > 0d) {
			active++;
		}

		if(day5 > 0d) {
			active++;
		}

		if(day6 > 0d) {
			active++;
		}

		if(day7 > 0d) {
			active++;
		}

		if(day8 > 0d) {
			active++;
		}

		if(day9 > 0d) {
			active++;
		}

		if(day10 > 0d) {
			active++;
		}

		if(day11 > 0d) {
			active++;
		}

		if(day12 > 0d) {
			active++;
		}

		if(day13 > 0d) {
			active++;
		}

		if(day14 > 0d) {
			active++;
		}

		if(day15 > 0d) {
			active++;
		}

		if(day16 > 0d) {
			active++;
		}

		if(day17 > 0d) {
			active++;
		}

		if(day18 > 0d) {
			active++;
		}

		if(day19 > 0d) {
			active++;
		}

		if(day20 > 0d) {
			active++;
		}

		if(day21 > 0d) {
			active++;
		}

		if(day22 > 0d) {
			active++;
		}

		if(day23 > 0d) {
			active++;
		}

		if(day24 > 0d) {
			active++;
		}

		if(day25 > 0d) {
			active++;
		}

		if(day26 > 0d) {
			active++;
		}

		if(day27 > 0d) {
			active++;
		}

		if(day28 > 0d) {
			active++;
		}

		if(day29 > 0d) {
			active++;
		}

		if(day30 > 0d) {
			active++;
		}

		if(day31 > 0d) {
			active++;
		}

		return active;
	}

	public PPNInfo toPPNInfo(@NonNull String number, double deduction) {

		PPNInfo info = new PPNInfo();

		double t_price = 0d;
		double t_ppn = 0d;

		if(day1-deduction > 5000d) {

			double price = day1-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".01");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}

		if(day2-deduction > 5000d) {

			double price = day2-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".02");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}

		if(day3-deduction > 5000d) {

			double price = day3-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".03");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day4-deduction > 5000d) {

			double price = day4-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".04");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day5-deduction > 5000d) {

			double price = day5-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".05");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day6-deduction > 5000d) {

			double price = day6-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".06");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day7-deduction > 5000d) {

			double price = day7-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".07");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day8-deduction > 5000d) {

			double price = day8-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".08");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day9-deduction > 5000d) {

			double price = day9-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".09");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day10-deduction > 5000d) {

			double price = day10-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".10");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day11-deduction > 5000d) {

			double price = day11-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".11");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day12-deduction > 5000d) {

			double price = day12-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".12");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day13-deduction > 5000d) {

			double price = day13-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".13");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day14-deduction > 5000d) {

			double price = day14-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".14");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day15-deduction > 5000d) {

			double price = day15-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".15");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day16-deduction > 5000d) {

			double price = day16-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".16");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day17-deduction > 5000d) {

			double price = day17-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".17");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day18-deduction > 5000d) {

			double price = day18-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".18");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day19-deduction > 5000d) {

			double price = day19-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".19");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day20-deduction > 5000d) {

			double price = day20-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".20");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day21-deduction > 5000d) {

			double price = day21-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".21");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day22-deduction > 5000d) {

			double price = day22-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".22");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day23-deduction > 5000d) {

			double price = day23-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".23");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day24-deduction > 5000d) {

			double price = day24-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".24");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day25-deduction > 5000d) {

			double price = day25-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".25");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day26-deduction > 5000d) {

			double price = day26-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".26");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day27-deduction > 5000d) {

			double price = day27-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".27");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day28-deduction > 5000d) {

			double price = day28-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".28");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day29-deduction > 5000d) {

			double price = day29-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".29");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day30-deduction > 5000d) {

			double price = day30-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".30");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}
		
		if(day31-deduction > 5000d) {

			double price = day31-deduction;
			double ppn = price * 0.1;

			Map<String, String> map = new HashMap<>();
			map.put("number", number+".31");
			map.put("price", ""+price);
			map.put("tax", ""+ppn);

			info.getDetails().add(map);

			t_price += price;
			t_ppn += ppn;
		}

		info.setValid(t_price > 0);
		info.setIncome(t_price+"");
		info.setTax(""+t_ppn);

		return info;
	}
}
