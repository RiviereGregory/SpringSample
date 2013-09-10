package fr.treeptik.springsample.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.treeptik.springsample.dao.impl.ClientMemoryDAO;

@Configuration
public class DAOFactory {

	@Bean
	public ClientDAO getClientDAO() {
		//
		// Lire dans un fichier propeties
		// Lecture en base de données ....
		//

		return new ClientMemoryDAO();
	}

}
