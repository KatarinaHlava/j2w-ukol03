package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
    private final List<Vizitka> vizitkaList;

    public VizitkaController() {
        vizitkaList = Arrays.asList(
                new Vizitka("Dita (Přikrylová) Formánková", "Czechitas z. s.", "Václavské náměstí 837/11", " 11000 Praha 1", "dita@czechitas.cs", "+420 800123456", "www.czechitas.cz"),
                new Vizitka("Barbora Bühnová", "Czechitas z. s.", "Václavské náměstí 837/11", "11000  Praha 1", null, "+420 800123456", "www.czechitas.cz"),
                new Vizitka("Monika Ptáčníková", "Czechitas z. s.", "Václavské náměstí 837/11", "11000  Praha 1", "monika@czechitas.cs", "+420 800123456", "www.czechitas.cz;"),
                new Vizitka("Mirka Zatloukalová", "Czechitas z. s.", "Václavské náměstí 837/11", "11000  Praha 1", "mirka@czechitas.cs", null, "www.czechitas.cz;")
        );
    }


    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("/seznam");
        modelAndView.addObject("seznamVizitek", vizitkaList);
        return modelAndView;

    }

    @GetMapping("/detail")
    public ModelAndView detail(int id) {
        ModelAndView modelAndView = new ModelAndView("/detail");
        modelAndView.addObject("seznamVizitek", vizitkaList.get(id));
        return modelAndView;
    }

}
//6.Vytvoř si v kontroleru VizitkaController privátní field, který bude obsahovat seznam vizitek (List<Vizitka>)
// a naplň seznam nějakými údaji. Nezapomeň vytvořit i takové vizitky, které nebudou mít uvedené všechny kontakty.
//7.Uprav metodu seznam() tak, aby vracela ModelAndView. Zvol správné view a do modelu vlož seznam vizitek.
//9.Uprav metodu detail() tak, aby vracela ModelAndView. Uprav metodu tak, aby z požadavku prohlížeče načítala query parametr id.
// Zvol správné view a do modelu vlož vizitku získanou ze seznamu na základě id (indexu v seznamu).

