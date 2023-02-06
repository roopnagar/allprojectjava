package springhellojavaconfig.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springhellojavaconfig.model.Employee;
import springhellojavaconfig.service.EmployeeService;


@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
    @RequestMapping(value="/addEmployee", method=RequestMethod.GET)
	public ModelAndView addEmployee(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("role") String role) {
    	ModelAndView mv = new ModelAndView();
    	Employee emp = new Employee();
    	emp.setId(id);
    	emp.setName(name);
    	emp.setRole(role);
    	employeeService.save(emp);
    	mv.setViewName("empstatus");
    	mv.addObject("msg", "Employee added successfully");
    	return mv;
    }
    
    @RequestMapping(value="/updateEmployee", method=RequestMethod.GET)
   	public ModelAndView updateEmployee(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("role") String role) {
       	ModelAndView mv = new ModelAndView();
       	Employee emp = new Employee();
       	emp.setId(id);
       	emp.setName(name);
       	emp.setRole(role);
       	employeeService.update(emp);
       	mv.setViewName("empstatus");
       	mv.addObject("msg", "Employee updated successfully");
       	return mv;
       }
    
    @RequestMapping(value="/deleteEmployee", method=RequestMethod.GET)
   	public ModelAndView deleteEmployee(@RequestParam("id") Integer id) {
       	ModelAndView mv = new ModelAndView();
       	Employee emp = new Employee();
       	emp.setId(id);
       	employeeService.deleteById(id);
       	mv.setViewName("empstatus");
       	mv.addObject("msg", "Employee deleted successfully");
       	return mv;
       }
    
    @RequestMapping(value="/getEmployee", method=RequestMethod.GET)
   	public ModelAndView getByIdEmployee(@RequestParam("id") Integer id) {
       	ModelAndView mv = new ModelAndView();
       	Employee emp = new Employee();
       	emp.setId(id);
       	employeeService.getById(id);
       	mv.setViewName("empstatus");
       	mv.addObject("msg", "Employee get by successfully");
       	return mv;
       }
    
    @RequestMapping(value="/getAllEmployee", method=RequestMethod.GET)
   	public ModelAndView getallEmployee() {
       	ModelAndView mv = new ModelAndView();
       	List<Employee> empList = new ArrayList<Employee>();
       	empList = employeeService.getAll();
       	mv.setViewName("empstatus");
       	mv.addObject("msg", empList);
       	return mv;
       }

}
