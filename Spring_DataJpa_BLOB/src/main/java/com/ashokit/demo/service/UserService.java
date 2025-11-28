package com.ashokit.demo.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.demo.entity.User;
import com.ashokit.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userrepo;
	
	public void saveUser() {
		
		String imagepath="C:/Users/HP/OneDrive/Billing Statememt/farmers debt/pspk.jpg";
		 User u = new User();
		u.setUsername("pspk");
		u.setUseremail("pspk@gmail.com");
		long size=0;
		try {
			size = Files.size(Paths.get(imagepath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] arr=new byte[(int)size];
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File(imagepath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fis.read(arr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		u.setUserimage(arr);
		userrepo.save(u);
	}

}
