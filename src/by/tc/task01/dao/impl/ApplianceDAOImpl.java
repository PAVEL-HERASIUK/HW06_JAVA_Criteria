package by.tc.task01.dao.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.Appliance;

public class ApplianceDAOImpl implements ApplianceDAO {
	@Override
	public List<Appliance> find(Criteria criteria) throws DAOException   {
		String fileName = "resources / devices_db" ;

		Reader  ApplianceReader ;
		try{
			reader =  new  ApplianceReader(fileName);
		} catch(FileNotFoundException e) {
			throws new DAOException("AAAAA", "AAAAA");
			
		}
		ApplianceMatcher matcher = new ApplianceMatcher ();

		Factory AppliancesFactory = new Factory AppliancesFactory ();

		List <String> strAppliancesData = null ;
		List <Appliance> appliances = null ;

		try {
			strAppliancesData = reader.read(Criteria.getGroupSearchName ());
		} catch (IOException e) {
			throws new  DAOException("AAAAA", "AAAAA");			
		}
		strAppliancesData = matcher.match(strAppliancesData, criteria);

		appliances = factory.create(strAppliancesData);
		return appliances;
	}
}