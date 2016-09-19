package cn.itcast.jk.controller.basicinfo.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
	public String list(Model model) {
		Map<String, Object> paraMap = new HashMap<String, Object>();
		paraMap.put("state", "1");

		List<Factory> dataList = factoryService.find(paraMap);
		model.addAttribute("dataList", dataList);

		return "/basicinfo/factory/jFactoryList.jsp";
	}

	@RequestMapping("/basicinfo/factory/tocreate.action")
	public String toCreateFactory() {
		return "/basicinfo/factory/jFactoryCreate.jsp";
	}

	@RequestMapping("/basicinfo/factory/insert.action")
	public String insert(Factory factory) {
		factory.setId(UUID.randomUUID().toString()); 
		factory.setCreateTime(new java.util.Date());
		factory.setState("1");

		factoryService.insert(factory);

		return "redirect:/basicinfo/factory/list.action";
	}
	
	@RequestMapping("/basicinfo/factory/toupdate.action")
	public String toupdate(String id, Model model){
		Factory fac = factoryService.get(id);
		if(null != fac) {
			fac.setId(id);
		}
		model.addAttribute("obj", fac);
		
		return "/basicinfo/factory/jFactoryUpdate.jsp";
	}
	
	@RequestMapping("/basicinfo/factory/update.action")
	public String update(Factory factory) {
		factoryService.update(factory);
		return "redirect:/basicinfo/factory/list.action";
	}
	
	@RequestMapping("/basicinfo/factory/deleteById.action")
	public String deleteById(String id) {
		factoryService.deleteById(id);
		return "redirect:/basicinfo/factory/list.action";
	}
	
}
