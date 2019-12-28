package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.dao.impl.ApplianceType;

public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {

		String groupSearchName = Criteria.getGroupSearchName();
		String tabletPC = ApplianceType.tabletPC.toString();
		String oven = ApplianceType.oven.toString();
		String laptop = ApplianceType.laptop.toString();
		String refrigerator = ApplianceType.refrigerator.toString();
		String speakers = ApplianceType.speakers.toString();
		String vaccumCleaner = ApplianceType.vaccumCleaner.toString();

		if (groupSearchName != tabletPC && groupSearchName != oven && groupSearchName != laptop
				&& groupSearchName != refrigerator && groupSearchName != speakers && groupSearchName != vaccumCleaner) {

			return false;
		}
		return true;
	}
}