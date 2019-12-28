package by.tc.task01.dao.impl;

import by.tc.task01.entity.criteria.Criteria;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ApplianceMatcher {
	public List<String> match(List<String> appliance, Criteria criteria) {
		List<String> results = new ArrayList<String>();
		List<String> inquiries = partMatchFormer(criteria);

		for (String concreteApplianceData : appliance) {
			if (isMatch(concreteApplianceData, inquiries)) {
				results.add(concreteApplianceData);
			}
		}
		return results;
	}

	private List<String> partMatchFormer(Criteria criteria) {
		List<String> inquiries = new ArrayList<String>();
		Set<String> key = criteria.getCriteria().keySet();

		for (String key : keys) {
			Object value = criteria.getCriteria().get(key);
			inquiries.add(key + " = " + value + " , ");
		}
		return inquiries;
	}

	private boolean isMatch(String applianceData, List<String> inquiries) {

		for (String inquirie : inquiries) {
			if (!applianceData.contains(inquiries)) {
				return false;
			}
		}
		return true;
	}
}
