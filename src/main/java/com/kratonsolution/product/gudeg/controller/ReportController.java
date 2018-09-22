package com.kratonsolution.product.gudeg.controller;

import java.time.Month;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kratonsolution.product.gudeg.application.ReportService;
import com.kratonsolution.product.gudeg.model.DailyIncome;
import com.kratonsolution.product.gudeg.model.Expense;
import com.kratonsolution.product.gudeg.model.Report;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Agung Dodi Perdana
 * @emai agung.dodi.perdana@gmail.com
 */
@Slf4j
@Controller
public class ReportController {

	private static final String REPORT_SESSION_KEY = "report";

	@Autowired
	private ReportService service;
	
	@GetMapping("/report/pre-step/{page}")
	public String pre(HttpSession session, @PathVariable int page) {

		if(page == 0) {

			session.setAttribute(REPORT_SESSION_KEY, new Report());
		}

		return "report-s"+page;
	}

	@PostMapping("/report/step/0")
	public String step0(HttpSession session, @RequestParam("month") Month month, @RequestParam("year") int year , @ModelAttribute Optional<Expense> expense) {

		log.info("Expense {}", expense.orElse(new Expense()));

		try {

			Report report = get(session);
			report.setMonth(month);
			report.setYear(year);
			report.setExpense(expense.get());

		} catch (Exception e) {
			log.error(e.toString());
		}

		return "redirect:/report/pre-step/1";
	}

	@PostMapping("/report/step/1")
	public String step1(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 1 {}", income.get());
		putIncome(session, income, 1);

		return "redirect:/report/pre-step/2";
	}

	@PostMapping("/report/step/2")
	public String step2(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 2 {}", income.get());
		putIncome(session, income, 2);

		return "redirect:/report/pre-step/3";
	}

	@PostMapping("/report/step/3")
	public String step3(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 3 {}", income.get());
		putIncome(session, income, 3);
		
		return "redirect:/report/pre-step/4";
	}

	@PostMapping("/report/step/4")
	public String step4(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 4 {}", income.get());
		putIncome(session, income, 4);
		
		return "redirect:/report/pre-step/5";
	}

	@PostMapping("/report/step/5")
	public String step5(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 5 {}", income.get());
		putIncome(session, income, 5);
		
		return "redirect:/report/pre-step/6";
	}

	@PostMapping("/report/step/6")
	public String step6(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 6 {}", income.get());
		putIncome(session, income, 6);
		
		return "redirect:/report/pre-step/7";
	}

	@PostMapping("/report/step/7")
	public String step7(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 7 {}", income.get());
		putIncome(session, income, 7);
		
		return "redirect:/report/pre-step/8";
	}

	@PostMapping("/report/step/8")
	public String step8(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 8 {}", income.get());
		putIncome(session, income, 8);
		
		return "redirect:/report/pre-step/9";
	}

	@PostMapping("/report/step/9")
	public String step9(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 9 {}", income.get());
		putIncome(session, income, 9);
		
		return "redirect:/report/pre-step/10";
	}

	@PostMapping("/report/step/10")
	public String step10(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 10 {}", income.get());
		putIncome(session, income, 10);
		
		return "redirect:/report/pre-step/11";
	}

	@PostMapping("/report/step/11")
	public String step11(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 11 {}", income.get());
		putIncome(session, income, 11);
		
		return "redirect:/report/pre-step/12";
	}

	@PostMapping("/report/step/12")
	public String step12(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 12 {}", income.get());
		putIncome(session, income, 12);
		
		return "redirect:/report/pre-step/13";
	}

	@PostMapping("/report/step/13")
	public String step13(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 13 {}", income.get());
		putIncome(session, income, 13);
		
		return "redirect:/report/pre-step/14";
	}

	@PostMapping("/report/step/14")
	public String step14(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 14 {}", income.get());
		putIncome(session, income, 14);
		
		return "redirect:/report/pre-step/15";
	}

	@PostMapping("/report/step/15")
	public String step15(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 15 {}", income.get());
		putIncome(session, income, 15);
		
		return "redirect:/report/pre-step/16";
	}

	@PostMapping("/report/step/16")
	public String step16(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 16 {}", income.get());
		putIncome(session, income, 16);
		
		return "redirect:/report/pre-step/17";
	}

	@PostMapping("/report/step/17")
	public String step17(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 17 {}", income.get());
		putIncome(session, income, 17);
		
		return "redirect:/report/pre-step/18";
	}

	@PostMapping("/report/step/18")
	public String step18(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 18 {}", income.get());
		putIncome(session, income, 18);
		
		return "redirect:/report/pre-step/19";
	}

	@PostMapping("/report/step/19")
	public String step19(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 19 {}", income.get());
		putIncome(session, income, 19);
		
		return "redirect:/report/pre-step/20";
	}

	@PostMapping("/report/step/20")
	public String step20(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 20 {}", income.get());
		putIncome(session, income, 20);
		
		return "redirect:/report/pre-step/21";
	}

	@PostMapping("/report/step/21")
	public String step21(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 21 {}", income.get());
		putIncome(session, income, 21);
		
		return "redirect:/report/pre-step/22";
	}

	@PostMapping("/report/step/22")
	public String step22(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 22 {}", income.get());
		putIncome(session, income, 22);
		
		return "redirect:/report/pre-step/23";
	}

	@PostMapping("/report/step/23")
	public String step23(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 23 {}", income.get());
		putIncome(session, income, 23);
		
		return "redirect:/report/pre-step/24";
	}

	@PostMapping("/report/step/24")
	public String step24(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 24 {}", income.get());
		putIncome(session, income, 24);
		
		return "redirect:/report/pre-step/25";
	}

	@PostMapping("/report/step/25")
	public String step25(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 25 {}", income.get());
		putIncome(session, income, 25);
		
		return "redirect:/report/pre-step/26";
	}

	@PostMapping("/report/step/26")
	public String step26(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 26 {}", income.get());
		putIncome(session, income, 26);
		
		return "redirect:/report/pre-step/27";
	}

	@PostMapping("/report/step/27")
	public String step27(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 27 {}", income.get());
		putIncome(session, income, 27);
		
		return "redirect:/report/pre-step/28";
	}

	@PostMapping("/report/step/28")
	public String step28(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 28 {}", income.get());
		putIncome(session, income, 28);
		
		return "redirect:/report/pre-step/29";
	}

	@PostMapping("/report/step/29")
	public String step29(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 29 {}", income.get());
		putIncome(session, income, 29);
		
		return "redirect:/report/pre-step/30";
	}

	@PostMapping("/report/step/30")
	public String step30(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 30 {}", income.get());
		putIncome(session, income, 30);
		
		return "redirect:/report/pre-step/31";
	}

	@PostMapping("/report/step/31")
	public String step31(HttpSession session, @ModelAttribute Optional<DailyIncome> income) {

		log.info("Income day 31 {}", income.get());
		putIncome(session, income, 31);
		
		service.create(get(session));
		
		return "index";
	}

	private Report get(HttpSession session) {

		if(session.getAttribute(REPORT_SESSION_KEY) == null) {

			session.setAttribute(REPORT_SESSION_KEY, new Report());
		}

		return (Report)session.getAttribute(REPORT_SESSION_KEY);
	}
	
	public void putIncome(HttpSession session, Optional<DailyIncome> income, int day) {
		
		if(income.isPresent()) {
			
			log.info("Income day "+day+" {}", income.get());

			Report report = get(session);
			report.getIncomes().put("DAY_"+day, income.get());
		}
	}
}
