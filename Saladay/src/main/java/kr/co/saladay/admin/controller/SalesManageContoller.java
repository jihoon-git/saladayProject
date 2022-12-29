package kr.co.saladay.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import kr.co.saladay.admin.model.service.salesManageService;

@RequestMapping("/admin")
@Controller
public class SalesManageContoller {
	
	@Autowired
	salesManageService service;

	@GetMapping("/salesManage")
	public String sales(Model model) {
		
		// 월별 주문 개수
		List<Integer> monthOrderCount=service.monthOrderCount();
		
		// 월별 매출액
		List<Integer> monthOrderPrice=service.monthOrerPrice();
		
		// 패키지 별 판매 개수
		List<Integer> packageOrderCount=service.packageOrderCount();
		
		// 메뉴 별 판매 개수
		List<Integer> menuOrderCount=service.menuOrderCount();
		
		// 월
		List<String> month=service.month();
		
		// 패키지 목록
		List<String> packageNameList=service.packageNameList();
		
		// 메뉴 목록
		List<String> menuNameList=service.menuNameList();
		
		model.addAttribute("monthOrderCount", new Gson().toJson(monthOrderCount));
		model.addAttribute("monthOrderPrice", new Gson().toJson(monthOrderPrice));
		model.addAttribute("packageOrderCount", new Gson().toJson(packageOrderCount));
		model.addAttribute("menuOrderCount", new Gson().toJson(menuOrderCount));
		
		model.addAttribute("month", new Gson().toJson(month));
		model.addAttribute("packageNameList", new Gson().toJson(packageNameList));
		model.addAttribute("menuNameList", new Gson().toJson(menuNameList));
		
		return "/admin/salesManage/salesManage";
	}
	
}