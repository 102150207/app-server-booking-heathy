package com.foody.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.foody.payload.Data;
import com.foody.payload.DataResponse;
import com.foody.services.ExpertCodeService;

@RestController
@RequestMapping("api/expert-token")
public class ExpertCodeController {

	@Autowired
	ExpertCodeService expertCodeService;
	
	@RequestMapping(value= "{lenValue}",method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Data> createToken (@PathVariable("lenValue") String lenValue){
		
		DataResponse tokens = expertCodeService.saveTokenCode(lenValue);
		
		if(tokens.getSuccess() == true) {
			return new ResponseEntity<Data>(new Data("true",HttpStatus.OK.value()),HttpStatus.CREATED);
		}
		return new ResponseEntity<Data>(new Data("false",HttpStatus.BAD_REQUEST.value()),HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping(value= "{tokenCode}",method = RequestMethod.GET, produces = "application/json")
	public DataResponse getAllRoles(@PathVariable("tokenCode") String tokenCode){
		DataResponse deleteRole = expertCodeService.getTokenCode(tokenCode);
		return deleteRole;
	}
}
