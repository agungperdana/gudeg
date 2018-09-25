package com.kratonsolution.product.gudeg.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kratonsolution.product.gudeg.application.ReportService;
import com.kratonsolution.product.gudeg.model.Report;

/**
 * @author Agung Dodi Perdana
 * @emai agung.dodi.perdana@gmail.com
 */
@Controller
public class HistoryController {

	@Autowired
	private ReportService service;
	
	@GetMapping("/report/history/list")
	public String list(Model model) {
		
		model.addAttribute("datas", service.list());
		
		return "history-list";
	}
	
	@GetMapping("/report/history/print-preview/{id}")
	public String print(Model model, @PathVariable String id) {
		
		Optional<Report> report = service.getById(id);
		if(report.isPresent()) {
			
			model.addAttribute("billings", report.get().incomesAsList());
		}
		
		return "history-preview";
	}
}
