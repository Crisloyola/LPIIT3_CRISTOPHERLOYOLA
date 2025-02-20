package com.bd.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.modelo.TblMedico;
import com.bd.repositorio.IMedicoRepositorio;

@Service
public class MedicoImp implements IMedico{
	
	@Autowired
	private IMedicoRepositorio imedicorepositorio;

	@Override
	public void RegistrarMedico(TblMedico tblmedico) {
		// TODO Auto-generated method stub
		imedicorepositorio.save(tblmedico);	
	}

	@Override
	public void EliminarMedico(TblMedico tblmedico) {
		// TODO Auto-generated method stub
		imedicorepositorio.deleteById(tblmedico.getIdmedico());
	}

	@Override
	public List<TblMedico> ListadoMedico() {
		// TODO Auto-generated method stub
		return (List<TblMedico>) imedicorepositorio.findAll();
	}

	@Override
	public TblMedico buscarporId(Integer id) {
		// TODO Auto-generated method stub
		return imedicorepositorio.findById(id).orElse(null);
	}

}
