package pt.ulisboa.tecnico.softeng.tax.presentation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pt.ulisboa.tecnico.softeng.tax.exception.TaxException;
import pt.ulisboa.tecnico.softeng.tax.services.local.TaxInterface;
import pt.ulisboa.tecnico.softeng.tax.services.local.dataobjects.TaxPayerData;

@Controller
@RequestMapping(value = "/tax")
public class IRSController {
    private static final Logger logger = LoggerFactory.getLogger(IRSController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String listIRS(Model model) {
        logger.info("irsList");
        model.addAttribute("irs", TaxInterface.getIRSList());
        return "irsView";
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public String deleteRentACars(Model model) {
        TaxInterface.deleteIRS();

        return "redirect:/";
    }
    
}
