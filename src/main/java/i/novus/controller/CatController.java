package i.novus.controller;

import i.novus.service.CatService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/")
public class CatController {

    private final CatService service;

    @GetMapping()
    public String getTwoCat(Model model) {
        model.addAttribute("cats", service.getTwoCat());
        return "index";
    }

    @GetMapping("/cat/{id}")
    public String increaseRating(@PathVariable Integer id, Model model) {
        model.addAttribute("cat", service.addPoint(id));
        return "redirect:/";
    }

}
