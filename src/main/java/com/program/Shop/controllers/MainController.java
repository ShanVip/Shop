package com.program.Shop.controllers;


import com.program.Shop.modeles.Item;
import com.program.Shop.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/")
    public String index(Model model){
        Iterable<Item> items = itemRepository.findAll();
        model.addAttribute("items", items);
        return "index";
    }

    @GetMapping("/about")
    public String about(@RequestParam(name = "userName", required = false, defaultValue = "World") String userName, Model model){
        model.addAttribute("name", userName);
        return "about";
    }

}
