package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ContactDAOInt;
import com.rays.dto.ContactDTO;

@Service
@Transactional
public class ContactServiceImpl extends BaseServiceImpl<ContactDTO, ContactDAOInt> implements ContactSreviceInt{

}