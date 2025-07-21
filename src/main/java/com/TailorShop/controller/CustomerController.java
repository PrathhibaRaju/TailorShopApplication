package com.TailorShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.TailorShop.*;
import com.TailorShop.model.Customer;
import com.TailorShop.model.Measurement;
import com.TailorShop.repository.CustomerRepository;
import com.TailorShop.repository.MeasurementRepository;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepo;

    @Autowired
    private MeasurementRepository measurementRepo;

    @GetMapping("")
    public String viewCustomers(Model model) {
        model.addAttribute("customers", customerRepo.findAll());
        return "customers";
    }

    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("measurement", new Measurement());
        return "measurements";
    }

    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute Customer customer, @ModelAttribute Measurement measurement) {
        measurement.setCustomer(customer);
        customer.setMeasurement(measurement);
        customerRepo.save(customer);
        return "redirect:/customers/";
    }
}

	


