package pt.ulisboa.tecnico.softeng.broker.presentation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pt.ulisboa.tecnico.softeng.broker.exception.BrokerException;
import pt.ulisboa.tecnico.softeng.broker.services.local.BrokerInterface;
import pt.ulisboa.tecnico.softeng.broker.services.local.dataobjects.BrokerData;
import pt.ulisboa.tecnico.softeng.broker.services.local.dataobjects.BrokerData.CopyDepth;
import pt.ulisboa.tecnico.softeng.broker.services.local.dataobjects.BulkData;
import pt.ulisboa.tecnico.softeng.broker.services.remote.dataobjects.RestRoomBookingData;
import java.util.List;



@Controller
@RequestMapping(value = "/brokers/{brokerCode}/bulks/{bulkNumber}/references/")
public class ReferenceController {
    private static final Logger logger = LoggerFactory.getLogger(ReferenceController.class);

    private static final BrokerInterface brokerInterface = new BrokerInterface();

    @RequestMapping(method = RequestMethod.GET)
	public String showReferences(Model model, @PathVariable String brokerCode, @PathVariable String bulkNumber) {
		logger.info("showReferences brokerCode:{}, bulkNumber:{}", brokerCode,bulkNumber);

		BrokerData brokerData = brokerInterface.getBrokerDataByCode(brokerCode, CopyDepth.BULKS);
        List<BulkData> bulks = brokerData.getBulks();

       /* for(BulkData a : bulks){
            if(a.getId() == bulkNumber){
                BulkData bulkData = a;
            }
            else{
                BulkData bulkData = new BulkData();
            }
        }*/

		if (brokerData == null) {
			model.addAttribute("error", "Error: it does not exist a broker with the code " + brokerCode);
			model.addAttribute("broker", new BrokerData());
			model.addAttribute("brokers", brokerInterface.getBrokers());
			return "brokers";
		} else {
            model.addAttribute("reference");
            model.addAttribute("references", brokerInterface.getReferences(brokerCode,bulkNumber));     
           // model.addAttribute("bulk", bulkData);
			model.addAttribute("broker", brokerData);
		}
			return "references";
	}

      

}