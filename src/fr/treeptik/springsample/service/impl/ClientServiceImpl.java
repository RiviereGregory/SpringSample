package fr.treeptik.springsample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.treeptik.springsample.dao.ClientDAO;
import fr.treeptik.springsample.exception.DAOException;
import fr.treeptik.springsample.exception.ServiceException;
import fr.treeptik.springsample.model.Client;
import fr.treeptik.springsample.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	// @Qualifier("clientJDBCDAO") //A mettre si on ne fait pas le DAOFactory
	private ClientDAO clientDAO;
	@Autowired
	// @Qualifier("clientMemoryDAO") //A mettre si on ne fait pas le DAOFactory
	private ClientDAO clientMemory;

	@Override
	public Client save(Client client) throws ServiceException {
		try {
			client = clientDAO.save(client);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}

		return client;
	}

	@Override
	public void remove(Client client) throws ServiceException {
		try {
			clientDAO.remove(client);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}

	}

	@Override
	public List<Client> findAll() throws ServiceException {
		List<Client> clients = null;
		try {
			clients = clientDAO.findAll();
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}
		return clients;
	}

}
