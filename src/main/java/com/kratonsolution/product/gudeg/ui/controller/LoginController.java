package com.kratonsolution.product.gudeg.ui.controller;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

import com.kratonsolution.product.gudeg.ui.LoginForm;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

/**
 * @author Agung Dodi Perdana
 * @emai agung.dodi.perdana@gmail.com
 */
@SpringComponent
@Scope(scopeName=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class LoginController extends LoginForm implements ClickListener{

	public LoginController() {
		
		super();
		login.addClickListener(this);
	}

	@Override
	public void buttonClick(ClickEvent event) {

		
	}
}
