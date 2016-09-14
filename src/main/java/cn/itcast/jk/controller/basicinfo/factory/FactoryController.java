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

/**
 * @Description:
 * @Author:	nutony
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014-7-1
 */
@Controller
public class FactoryController {
	@Autowired
	FactoryService factoryService;
	
	//查询
	@RequestMapping("/basicinfo/factory/list.action")
	public String list(Model model){
		Map paraMap = new HashMap();
		paraMap.put("state", 1);
		
		List<Factory> dataList = factoryService.find(paraMap);
		model.addAttribute("dataList", dataList);
		
		return "/basicinfo/factory/jFactoryList.jsp";
	}
}
