package by.tc.task01.entity;

public class Laptop extends Appliance {
	// you may add your own code here
	// BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS

	private String batteryCapacity;
	private String os;
	private String memoryRom;
	private String systemMemory;
	private String cpu;
	private String displayInchs;
	
	@Override
	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", os=" + os + ", memoryRom=" + memoryRom
				+ ", systemMemory=" + systemMemory + ", cpu=" + cpu + ", displayInchs=" + displayInchs + "]";
	}
}