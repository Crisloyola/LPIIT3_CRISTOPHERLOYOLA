package com.bd.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.bd.modelo.TblMedico;

public interface IMedicoRepositorio  extends CrudRepository<TblMedico, Integer>{

}
