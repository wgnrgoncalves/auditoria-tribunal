package com.fiap.auditoria.Controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fiap.auditoria.model.TetoGastoMensal;
import com.fiap.auditoria.repository.TetoGastoMensalRepository;
@Controller
@RequestMapping("/TetoGastosMensais")
public class TetoGastoMensalController {
	@Autowired
	private TetoGastoMensalRepository tetogastomensalrepository;
	
	@GetMapping
	public ModelAndView listar() 
	{ 
		ModelAndView modelAndView = new ModelAndView("TetoGastoMensal"); 
		modelAndView.addObject(new TetoGastoMensal());
		modelAndView.addObject("tetogastomensalrepository", tetogastomensalrepository.findAll());
		return modelAndView;
	}
	
	@PostMapping
	public String salvar(TetoGastoMensal tetoGastoMensal) 
	{
		//tetoGastoMensal.setDt_inicial(new Date(12,12,12));
		this.tetogastomensalrepository.save(tetoGastoMensal);
		return "redirect:/TetoGastosMensais";
	}
}



