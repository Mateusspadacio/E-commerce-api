package com.mateus.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import com.mateus.cursomc.domain.Pedido;

public interface EmailService {

	public void sendOrderConfirmationEmail(Pedido obj);
	
	public void sendEmail(SimpleMailMessage msg);
	
	public void sendOrderConfirmationHtmlEmail(Pedido obj);
	
	public void sendHtmlEmail(MimeMessage msg);
	
}