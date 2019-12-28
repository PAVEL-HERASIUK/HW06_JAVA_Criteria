package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {

	public static void print(Appliance appliance) {
		int i;
		for (i = 0; i < appliance.size(); i++) {
			if (appliance.get(i) != null) {
				System.out.println(appliance.get(i).toString());
			} else {
				System.out.println(" ноль ");
			}
		}
		System.out.println();
	}
}
// you may add your own code here