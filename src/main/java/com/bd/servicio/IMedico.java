package com.bd.servicio;

import java.util.List;

import com.bd.modelo.TblMedico;

public interface IMedico {
		void RegistrarMedico(TblMedico tblmedico);
		void EliminarMedico(TblMedico tblmedico);
		List<TblMedico> ListadoMedico();
		TblMedico buscarporId(Integer id);
}
