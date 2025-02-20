package com.bd.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bd.modelo.TblMedico;
import com.bd.servicio.IMedico;

@Controller
@RequestMapping("/Vista")
public class MedicoController {

    @Autowired
    private IMedico imedicorepositorio;

    @GetMapping("ListadoMedico")
    public String listarMedico(Model modelo) {
        List<TblMedico> listado = imedicorepositorio.ListadoMedico();
        modelo.addAttribute("listado", listado);
        return "Vista/ListadoMedico";
    }
    
    @GetMapping("/RegistrarMedico")
    public String RegistrarMedico(Model modelo) {
        TblMedico tblmed = new TblMedico();
        modelo.addAttribute("regmedico", tblmed);
        return "Vista/FrmRegMedico";
    }

    @PostMapping("/GuardarMedico")
    public String GuardarMedico(@ModelAttribute TblMedico tblmed, Model modelo) {
    	imedicorepositorio.RegistrarMedico(tblmed);
        return "redirect:/Vista/ListadoMedico";
    }

    @GetMapping("/editarmedico/{id}")
    public String Editar(@PathVariable("id") Integer idmedico, Model modelo) {
        TblMedico clmedico = imedicorepositorio.buscarporId(idmedico);
        modelo.addAttribute("regmedico", clmedico);
        return "/Vista/FrmRegMedico";
    }

    @GetMapping("/eliminarmedico/{id}")
    public String eliminar(@PathVariable("id") Integer idmedico, Model modelo) {
        TblMedico tblmed = new TblMedico();
        tblmed.setIdmedico(idmedico);
        imedicorepositorio.EliminarMedico(tblmed);	
        List<TblMedico> listado = imedicorepositorio.ListadoMedico();
        modelo.addAttribute("listado", listado);
        return "redirect:/Vista/ListadoMedico";
    }
}