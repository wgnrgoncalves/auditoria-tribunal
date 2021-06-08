package com.fiap.auditoria.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fiap.auditoria.model.GastoMensal;
import com.fiap.auditoria.repository.GastoMensalRepository;

@Controller
@RequestMapping("/GastosMensais")
public class GastoMensalController {
	@Autowired
	private GastoMensalRepository gastomensalrepository;
	
	@GetMapping
	public ModelAndView listar() 
	{ 
		ModelAndView modelAndView = new ModelAndView("GastoMensal"); 
		modelAndView.addObject(new GastoMensal());
		modelAndView.addObject("gastomensalrepository", gastomensalrepository.findAll());
		return modelAndView;
	}
	
	@GetMapping("/editar/{id}")
	public ModelAndView editar(@PathVariable Long id) 
	{ 
		ModelAndView modelAndView = new ModelAndView("GastoMensal"); 
		modelAndView.addObject(this.gastomensalrepository.findById(id).get());
		modelAndView.addObject("gastomensalrepository", gastomensalrepository.findAll());
		return modelAndView;
	}
	
	@PostMapping
	public String salvar(GastoMensal gastoMensal) 
	{
		this.gastomensalrepository.save(gastoMensal);
		return "redirect:/GastosMensais";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluirProduto(@PathVariable Long id) {		
		this.gastomensalrepository.deleteById(id);
		return "redirect:/GastosMensais";	
	}
}
