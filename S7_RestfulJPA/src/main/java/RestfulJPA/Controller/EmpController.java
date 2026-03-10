package RestfulJPA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import RestfulJPA.Model.Employee;
import RestfulJPA.Repository.EmpRepository;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    EmpRepository empRepository;

    @PostMapping("/save")
    public ResponseEntity<String> addEmployee(@RequestBody Employee e) {
        empRepository.save(e);
        return ResponseEntity.ok("Record inserted successfully");
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return empRepository.findAll();
    }
}