package com.kratonsolution.product.gudeg.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.kratonsolution.product.gudeg.model.Report;
import com.kratonsolution.product.gudeg.repository.ReportRepository;

import lombok.NonNull;

/**
 * @author Agung Dodi Perdana
 * @emai agung.dodi.perdana@gmail.com
 */
@Service
public class ReportService {

	@Autowired
	private ReportRepository repo;
	
	public Optional<Report> getById(@NonNull String id) {
		
		return repo.findById(id);
	}
	
	public void create(@NonNull Report report) {
		
		Optional<Report> in = repo.findOneByMonthAndYear(report.getMonth(), report.getYear());
		if(!in.isPresent()) {
			
			repo.save(report);
		}
	}
	
	public List<Report> list() {
		
		return repo.findAll(Sort.by(Direction.DESC, "month", "year"));
	}
}
