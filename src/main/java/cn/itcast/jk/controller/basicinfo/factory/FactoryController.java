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
		// 加工数据
		factory.setId(UUID.randomUUID().toString()); // 产生一个UUID
		factory.setCreateTime(new java.util.Date());
		factory.setState("1"); // 1启用0停用

		factoryService.insert(factory);

		return "redirect:/basicinfo/factory/list.action";
	}
}
