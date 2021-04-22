package org.basma.store.test;

import org.basma.store.responses.UserResponse;
import org.basma.store.services.UserService;
import org.basma.store.services.Impl.UserServiceImpl;
import org.basma.store.shared.dto.UserDto; 
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;

public class UserTest {

	
	@Autowired
	UserService userService;
	
	@Test
	public void testaddUser() {
		
		UserDto userDto = new UserDto("NomTest", "PrenomTest", "EmailTest@email.com","aaa");
		userService.createUser(userDto);
		
		
//		UserDto userDto = new UserDto("NomTest", "PrenomTest", "EmailTest@email.com","aaa"); 
//		UserDto createUser = userService.createUser(userDto);
//		UserResponse userResponse = new UserResponse();
//		BeanUtils.copyProperties(createUser, userResponse);

		
		System.out.print(userDto.toString());
	}
}
