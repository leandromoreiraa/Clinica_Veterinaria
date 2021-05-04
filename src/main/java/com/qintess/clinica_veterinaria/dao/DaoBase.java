package com.qintess.clinica_veterinaria.dao;

import java.util.List;

public interface DaoBase<T> {

	public T insere(T entidade);

	public T atualiza(T entidade);

	public T deleta(Integer id);

	public T buscaPorId(Integer id);

	public List<T> listaTodos();


}
