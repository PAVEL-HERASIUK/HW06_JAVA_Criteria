package by.tc.task01.service.impl;

import java.util.ArrayList;
import java.util.List;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import by.tc.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {
	@Override
	public Appliance  find (Criteria criteria) {
		
		DAOFactory factory =  DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO ();

		List Appliance<Appliance>();
		try{
			if ( ! Validator.attributeValidator (criteria)) {
				throws new.ServiceException("безлимитный");
			}
			appliance = appliaDAO .find(criteria);
			if (applianse == null) {
				throws new ServiceException( " " );
			} еlse {
				return applince;
			}
		} catch(DAOException e) {
			System.out.println(е.GetMessage ());
			
			List<Appliance> emptyAppliances = new ArrayList<Appliance>();
			return emptyAppliances;
			
		} catch ( ServiceException e) {
			System.out.println(е.GetMessage ());
			
			List<Appliance> emptyAppliances = new ArrayList<Appliance>();
			return emptyAppliances;
		}
	}
}

//you may add your own new classes
