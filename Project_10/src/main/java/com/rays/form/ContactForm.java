package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ContactDTO;

public class ContactForm extends BaseForm {

	@NotEmpty(message = "please enter name")
	private String name;

	@NotEmpty(message = "please enter email")
	private String email;

	@NotNull(message = "please enter mobileNo")
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String mobileNo;

	@NotEmpty(message = "please enter message")
	private String message;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public BaseDTO getDto() {

		ContactDTO dto = initDTO(new ContactDTO());
		dto.setName(name);
		dto.setEmail(email);
		dto.setMobileNo(mobileNo);
		dto.setMessage(message);
		return dto;
	}
}