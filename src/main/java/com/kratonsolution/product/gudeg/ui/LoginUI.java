package com.kratonsolution.product.gudeg.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.kratonsolution.product.gudeg.ui.controller.LoginController;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * @author Agung Dodi Perdana
 * @emai agung.dodi.perdana@gmail.com
 */
@SpringUI(path="/login")
public class LoginUI extends UI {
	
	@Autowired
	private LoginController controller;
	
	@Override
	protected void init(VaadinRequest request) {

		VerticalLayout layout = new VerticalLayout();
		layout.setSizeFull();
		layout.addComponent(controller);
		layout.setComponentAlignment(controller, Alignment.MIDDLE_CENTER);
		
		setContent(layout);
	}
}