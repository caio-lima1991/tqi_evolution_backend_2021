package com.github.caiolima.tqi_evolution_avaliacao.controller;

import com.github.caiolima.tqi_evolution_avaliacao.entities.SolicitacaoEmprestimo;
import com.github.caiolima.tqi_evolution_avaliacao.entities.User;
import com.github.caiolima.tqi_evolution_avaliacao.repositories.EmprestimoRepository;
import com.github.caiolima.tqi_evolution_avaliacao.repositories.UserRepository;
import com.github.caiolima.tqi_evolution_avaliacao.repositories.ViewRepository;
import com.github.caiolima.tqi_evolution_avaliacao.services.ViewService;
import com.github.caiolima.tqi_evolution_avaliacao.services.ViewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private EmprestimoRepository emprestimoRepo;

    @Autowired
    private ViewRepository viewRepository;

    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());

        return "signup_form";
    }

    @PostMapping("/process_register")
    public String processRegister(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        userRepo.save(user);

        return "register_success";
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        List<User> listUsers = userRepo.findAll();
        model.addAttribute("listUsers", listUsers);

        return "area_cliente";
    }

    @GetMapping("/solicitar_emprestimo")
    public String SolicitarEmprestimo(Model model) {
        model.addAttribute("emprestimo", new SolicitacaoEmprestimo());

        return "create_emprestimo";
    }

    @GetMapping("/vizualizar_emprestimo")
    public String viewService(Model model) {
        model.addAttribute( "viewModel", viewRepository.join());

        return "view_emprestimo";
    }

    @PostMapping("/process_emprestimo")
    public String processEmprestimo(SolicitacaoEmprestimo solicitacaoEmprestimo){
       emprestimoRepo.save(solicitacaoEmprestimo);

        return "area_cliente";
    }
}