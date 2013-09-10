package fr.treeptik.springsample.dao.impl;

import java.util.List;

import fr.treeptik.springsample.dao.ClientDAO;
import fr.treeptik.springsample.exception.DAOException;
import fr.treeptik.springsample.model.Client;

//@Repository //A mettre si on ne fait pas le DAOFactory
public class ClientJDBCDAO implements ClientDAO{

	@Override
	public Client save(Client client) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Client client) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Client> findAll() throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

}
