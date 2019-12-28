package by.tc.task01.entity;

public class TabletPC extends Appliance {
	// BATTERY_CAPACITY=3, DISPLAY_INCHES=14, MEMORY_ROM=8000,
	// FLASH_MEMORY_CAPACITY=2, COLOR=blue
	private String batteryCapacity;
	private String displayInches;
	private String memoryRom;
	private String flashMemorycapacity;
	private String color;

	private TabletPC() {

	}

	private TabletPC(String batteryCapacity, String displayInches, String memoryRom, String flashMemorycapacity,
			String color) {
		this.batteryCapacity = batteryCapacity;
		this.displayInches = displayInches;
		this.memoryRom = memoryRom;
		this.flashMemorycapacity = flashMemorycapacity;
		this.color = color;
	}

	public String getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(String displayInches) {
		this.displayInches = displayInches;
	}

	public String getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(String memoryRom) {
		this.memoryRom = memoryRom;
	}

	public String getFlashMemorycapacity() {
		return flashMemorycapacity;
	}

	public void setFlashMemorycapacity(String flashMemorycapacity) {
		this.flashMemorycapacity = flashMemorycapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batteryCapacity == null) ? 0 : batteryCapacity.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((displayInches == null) ? 0 : displayInches.hashCode());
		result = prime * result + ((flashMemorycapacity == null) ? 0 : flashMemorycapacity.hashCode());
		result = prime * result + ((memoryRom == null) ? 0 : memoryRom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TabletPC other = (TabletPC) obj;
		if (batteryCapacity == null) {
			if (other.batteryCapacity != null)
				return false;
		} else if (!batteryCapacity.equals(other.batteryCapacity))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (displayInches == null) {
			if (other.displayInches != null)
				return false;
		} else if (!displayInches.equals(other.displayInches))
			return false;
		if (flashMemorycapacity == null) {
			if (other.flashMemorycapacity != null)
				return false;
		} else if (!flashMemorycapacity.equals(other.flashMemorycapacity))
			return false;
		if (memoryRom == null) {
			if (other.memoryRom != null)
				return false;
		} else if (!memoryRom.equals(other.memoryRom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", displayInches=" + displayInches + ", memoryRom="
				+ memoryRom + ", flashMemorycapacity=" + flashMemorycapacity + ", color=" + color + "]";
	}
}
