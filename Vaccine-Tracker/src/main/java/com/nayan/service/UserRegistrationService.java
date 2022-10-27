package com.nayan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nayan.mailservice.MailService;
import com.nayan.model.Mail;
import com.nayan.model.User;
import com.nayan.repository.UserRepository;

@Service
public class UserRegistrationService {

	@Autowired
	private UserRepository repo;
	@Autowired
	private MailService mailService;

	public String saveUserData(User user) {

		if (user.getName().isBlank() || user.getEmail().isBlank() || user.getDistrict().isBlank()
				|| user.getVaccineCenter().isBlank()) {
			return "Please fill all fields correctly";
		} else {
			for (User u : repo.findAll()) {
				if (u.getEmail().equalsIgnoreCase(user.getEmail())) {
					return user.getEmail() + " is already registered";
				}

			}
			repo.save(user);
			Mail mail = new Mail();
			mail.setMailFrom("vaccine819@gmail.com");
			mail.setMailTo(user.getEmail());
			mail.setMailSubject("Vaccine Alert Saved " + user.getName());
			mail.setMailContent(
					"Your Vaccination Alert is saved. Please wait for your selected slot of you selected center. "
							+ "You have chosen District: " + user.getDistrict()
							+ " and your selected vaccine center is: " + user.getVaccineCenter()
							+ ". You will be notified as soon as slots will be available in your selected area. Dont forget to register at https://www.cowin.gov.in/home\n\nThanks\n Nayan");
			mailService.sendEmail(mail);
			return "User Data Saved Successfully";
		}
	}

	public String deleteDataById(long id) {

		repo.deleteById(id);

		return "User with userId " + id + " deleted successfully";

	}

	public List<User> getAll() {
		return repo.findAll();
	}

	public User findByName(String name) {
		return repo.findByName(name);
	}

}
