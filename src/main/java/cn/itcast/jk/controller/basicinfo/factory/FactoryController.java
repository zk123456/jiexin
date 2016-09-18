package cn.itcast.jk.controller.basicinfo.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.jk.domain.Factory;
import cn.itcast.jk.service.FactoryService;

@Controller
public class FactoryController {
	@Autowired
	FactoryService factoryService;
	
	@RequestMapping("/basicinfo/factory/list.action")
	public String list(Model model){
		Map<String, Object> paraMap = new HashMap<String, Object>();
		paraMap.put("state", "1");
		
		List<Factory> dataList = factoryService.find(paraMap);
		model.addAttribute("dataList", dataList);
		
		return "/basicinfo/factory/jFactoryList.jsp";
	}
}
