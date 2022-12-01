package controllers;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import model.RegTest;

@Controller
public class GoToAddTest {

	@Autowired
	public SessionFactory sf;
	
	
	@RequestMapping(value = "/goToAddTest",method = RequestMethod.POST)
	public ModelAndView goToAddTest(@ModelAttribute("regTest")RegTest regTest) {
		
	
		
		return new ModelAndView("addTest","regTest",new RegTest());
	}
}
