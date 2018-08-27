package com.kratonsolution.product.gudeg.ui;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 * @author Agung Dodi Perdana
 * @emai agung.dodi.perdana@gmail.com
 */
public class LoginForm extends VerticalLayout {

	protected Image logo = new Image();
	
	protected TextField username = new TextField();
	
	protected PasswordField password = new PasswordField();
	
	protected Button login = new Button(VaadinIcons.SIGN_IN);
	
	protected Label label = new Label();
	
	public LoginForm() {

		setWidth("400px");
		setHeight("240px");
		setSpacing(false);
		setMargin(false);
		
		username.setWidth("100%");
		username.setHeight("48px");
		username.setPlaceholder("Username");

		password.setWidth("100%");
		password.setHeight("48px");
		password.setPlaceholder("passowrd");
		
		login.setWidth("100%");
		login.setCaption("Login");
		login.setHeight("48px");
		login.addStyleName(ValoTheme.BUTTON_FRIENDLY);
		
		label.setWidth("100%");
		
		addComponent(username);
		addComponent(password);
		addComponent(login);
		addComponent(label);
	}
}
