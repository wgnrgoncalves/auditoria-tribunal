package com.fiap.auditoria.Controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		
		
		List<TetoGastoMensal> lst = tetogastomensalrepository.findAll();
		
		modelAndView.addObject("tetogastomensalrepository", lst );
		return modelAndView;
	}
	
	@PostMapping
	public String salvar(TetoGastoMensal tetoGastoMensal) 
	{
		//tetoGastoMensal.setDt_inicial(new Date(12,12,12));
		this.tetogastomensalrepository.save(tetoGastoMensal);
		return "redirect:/TetoGastosMensais";
	}
	
	@GetMapping("/Deletar/{id}")
	public String delete(@PathVariable Long id) {
		Optional<TetoGastoMensal> teto = this.tetogastomensalrepository.findById(id);
		
		if(teto.isPresent())
			this.tetogastomensalrepository.deleteById(id);
		
		return "redirect:/TetoGastosMensais";
	}
	
	
	@GetMapping("/Editar/{id}")
	public ModelAndView editar(@PathVariable Long id) {
		Optional<TetoGastoMensal> teto = this.tetogastomensalrepository.findById(id);
		
		ModelAndView modelAndView = new ModelAndView("TetoGastoMensal"); 
		modelAndView.addObject(teto.get());
		
		
		List<TetoGastoMensal> lst = tetogastomensalrepository.findAll();
		
		modelAndView.addObject("tetogastomensalrepository", lst );
		return modelAndView;
		
		
	}
	
	
}



