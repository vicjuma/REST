package net.mouseinc.employeespringbootapp.controller;

import net.mouseinc.employeespringbootapp.entity.Employee;
import net.mouseinc.employeespringbootapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/")
    public String createHome(Model model) {
        model.addAttribute("employee", employeeRepository.findAll());
        return "index";
    }

    @GetMapping(value = "/create")
    public String create1(Model model) {
        model.addAttribute("employee", new Employee());
        return "formEmployee";
    }

    @PostMapping(value = "/create")
    public String create2(Model model, Employee employee) {
        model.addAttribute("employee", employeeRepository.save(employee));
        return "redirect:/";
    }

    @GetMapping(value = "/edit/{id}")
    public String editForm(@PathVariable Integer id, Model model) {
        model.addAttribute("employee", employeeRepository.getOne(id));
        return "formEmployee";
    }

    @GetMapping(value = "/delete/{id}")
    public String seniorEmployee(@PathVariable Integer id) {
        employeeRepository.deleteById(id);
        return "redirect:/";
    }
}
