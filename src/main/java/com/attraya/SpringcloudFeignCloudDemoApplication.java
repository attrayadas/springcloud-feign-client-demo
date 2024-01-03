package com.attraya;

import com.attraya.client.UserClient;
import com.attraya.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@EnableFeignClients
public class SpringcloudFeignCloudDemoApplication {

	@Autowired
	private UserClient userClient;

	@GetMapping("/findAllUsers")
	public List<User> getAllUsers(){
		return userClient.getUsers();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudFeignCloudDemoApplication.class, args);
	}

}
