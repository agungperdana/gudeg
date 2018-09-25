package com.kratonsolution.product.gudeg.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Agung Dodi Perdana
 * @emai agung.dodi.perdana@gmail.com
 */
@Getter
@Setter
public class PPNInfo {

	private boolean valid = false;
	
	private String income;
	
	private String tax;
	
	private List<Map<String, String>> details = new ArrayList<>();
}
