package com.kratonsolution.product.gudeg.repository;

import java.time.Month;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kratonsolution.product.gudeg.model.Report;

import lombok.NonNull;

/**
 * @author Agung Dodi Perdana
 * @emai agung.dodi.perdana@gmail.com
 */
public interface ReportRepository extends MongoRepository<Report, String> {

	public Optional<Report> findOneByMonthAndYear(@NonNull Month month, int year);
}
