package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ContactDTO;
import com.rays.form.ContactForm;
import com.rays.service.ContactSreviceInt;

@RestController
@RequestMapping(value = "Contact")
public class ContactCtl extends BaseCtl<ContactForm, ContactDTO, ContactSreviceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		return res;
	}
}