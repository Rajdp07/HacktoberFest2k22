package com.nayan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nayan.controller.UserController;
import com.nayan.mailservice.MailService;
import com.nayan.model.Mail;

@SpringBootApplication
public class RegistrationMsApplication {

	@Autowired
	UserController response;
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(RegistrationMsApplication.class, args);
//		Mail mail = new Mail();
//        mail.setMailFrom("nayansengupta99@gmail.com");
//        mail.setMailTo("sajal@gmail.com");
//        mail.setMailSubject("Spring Boot - Email Example");
//        mail.setMailContent("Learn How to send Email using Spring Boot!!!\n\nThanks\nwww.technicalkeeda.com");
// 
//       // ApplicationContext ctx = SpringApplication.run(Application.class, args);
//        MailService mailService = (MailService) ctx.getBean("mailService");
//        mailService.sendEmail(mail);
	}

}
