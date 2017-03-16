package com.myway.poss.service.impl.contact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myway.poss.mapper.ContactMapper;
import com.myway.poss.pojo.Contact;
import com.myway.poss.service.contact.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactMapper contactMapper;

	@Override
	public List<Contact> getAllContact() {
		return contactMapper.selectByExample(null);
	}

}
