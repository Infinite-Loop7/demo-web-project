package edu.cpp.cs580;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import edu.cpp.cs580.controller.WebController;
import edu.cpp.cs580.data.User;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.View;

public class WebControllerTest{

	WebController myWebController = new WebController();

	
	@Test
	public void testSortAllUsers(){		
		List<User> users = myWebController.sortAllUsers(); 
		for(Iterator i = users.iterator(); i.hasNext();){
			assertTrue(Integer.parseInt( ((User)i).getId() ) < Integer.parseInt( ((User)i.next()).getId() )); 
		}
	}
	
	
	@Test

	public void testCheckHello(){
		String test ="Hello";
		String test2 = myWebController.healthCheck();
		assertEquals(test, test2);
	}
}
