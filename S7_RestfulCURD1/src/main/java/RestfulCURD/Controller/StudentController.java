package RestfulCURD.Controller;

import org.springframework.web.bind.annotation.RestController;
import RestfulCURD.Model.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/students")
public class StudentController {
	@GetMapping("/{id}")
	public Student getData(@PathVariable int id)
	
	{
       Student s = new Student();
       s.setId(id);
       s.setName("Panda");
       s.setCgpa(8.5);
       s.setDropout(false);
       return s;
}
}
