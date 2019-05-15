package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

    @Controller
    public class HelloToAllTheWorldController {

        String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

        Random counter = new Random();

        @RequestMapping("/web/greeting")
        public String greeting(@RequestParam String name, Model model) {
            Greeting greets = new Greeting(counter.incrementAndGet(), name);
            ProduceHello hello = new ProduceHello();

            model.addAttribute("color", hello.getColor());
            model.addAttribute("size", hello.getSize());
            model.addAttribute("hello", hello.getHellos(counter.intValue()));
            model.addAttribute("name", name);

            return "greeting";
        }
    }