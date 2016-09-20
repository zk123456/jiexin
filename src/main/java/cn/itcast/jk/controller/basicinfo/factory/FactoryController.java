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
	
	//鏌ヨ
	@RequestMapping("/basicinfo/factory/list.action")
	public String list(Model model){
//		Map paraMap = new HashMap();
//		paraMap.put("state", 1);
//		
		List<Factory> dataList = factoryService.find(null);
		model.addAttribute("dataList", dataList);
		
		return "/basicinfo/factory/jFactoryList.jsp";
	}
	
	@RequestMapping("/basicinfo/factory/tocreate.action")
	public String tocreate(){
		return "/basicinfo/factory/jFactoryCreate.jsp";
	}
	
	@RequestMapping("/basicinfo/factory/insert.action")
	public String insert(Factory factory){
		factory.setId(UUID.randomUUID().toString());		
		factory.setCreateTime(new java.util.Date());
		factory.setState("1");														
		
		factoryService.insert(factory);
		
		return "redirect:/basicinfo/factory/list.action";
	}
	
	@RequestMapping("/basicinfo/factory/toupdate.action")
	public String toupdate(String id, Model model){
		Factory factory = factoryService.get(id);
		model.addAttribute("obj", factory);
		
		return "/basicinfo/factory/jFactoryUpdate.jsp";
	}
	
	@RequestMapping("/basicinfo/factory/update.action")
	public String update(Factory factory){
		factoryService.update(factory);
		
		return "redirect:/basicinfo/factory/list.action";
	}

	@RequestMapping("/basicinfo/factory/deleteById.action")
	public String deleteById(String id){
		factoryService.deleteById(id);
		
		return "redirect:/basicinfo/factory/list.action";
	}
	
	@RequestMapping("/basicinfo/factory/delete.action")
	public String delete(String[] id){
		factoryService.delete(id);
		
		return "redirect:/basicinfo/factory/list.action";
	}
	
	@RequestMapping("/basicinfo/factory/toview.action")
	public String toview(String id, Model model){
		Factory factory = factoryService.get(id);
		model.addAttribute("obj", factory);
		
		return "/basicinfo/factory/jFactoryView.jsp";
	}
	
	@RequestMapping("/basicinfo/factory/start.action")
	public String start(String[] id){
		this.updateState(id, "1");
		return "redirect:/basicinfo/factory/list.action";
	}
	
	@RequestMapping("/basicinfo/factory/stop.action")
	public String stop(String[] id){
		this.updateState(id, "0");
		return "redirect:/basicinfo/factory/list.action";
	}
	
	private void updateState(String[] id, String value){
		Map map = new HashMap();		
		map.put("ids", id);
		map.put("state", value);
		
		factoryService.updateState(map);
	}
}
