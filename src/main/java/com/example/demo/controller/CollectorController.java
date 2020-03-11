package com.example.demo.controller;

import com.example.demo.model.Collector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping(value = "/Collectors")
public class CollectorController {

    @Autowired
    private CollectorRepository collectorRepository;

    @Autowired
    private ContentRepository contentRepository;

    @GetMapping(value = "/all")
    public List<Collector> collectorList() {
        return collectorRepository.findAll();
    }

    // A chaque fois que tu cree un MaV tu dois avoir un fichier html correspondant au viewName dans le dossier static
    // Donc il prend le viewName pour connecter, et puis le value due mapping pour le resultat dans le browser?
    // C'est ca, le viewName indique le HTML qui va etre charger dans le mapping du browser
    // Et on met le mapping vers /result (avec le requestmapping du haut, ca combine pour etre la page /Collectors/result)
    // et avec le parametre tag, ca donne un lien du genre "localhost:8080/collectors/result?tag=thor"
    @GetMapping(value="/result")
    public ModelAndView Search(@RequestParam(value = "tag", required = false) String tag, HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("Search");

        mav.addObject("tag", tag);
        mav.addObject("Search", collectorRepository.findCollectorsByTitleContaining(tag));

        return mav;
    }

}
