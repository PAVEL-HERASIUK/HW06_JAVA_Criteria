package by.tc.task01.entity;

public class Speakers extends Appliance {
	// POWER_CONSUMPTION=15, NUMBER_OF_SPEAKERS=2, FREQUENCY_RANGE=2-4,
	// CORD_LENGTH=2

	private String powerConsumption;
	private String numberOfSpeakers;
	private String fequencyRange;
	private String cordLength;

	private Speakers() {
	}

	private Speakers(String powerConsumption, String numberOfSpeakers, String fequencyRange, String cordLength) {

		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.fequencyRange = fequencyRange;
		this.cordLength = cordLength;
	}

	public String getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(String powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public String getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setNumberOfSpeakers(String numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public String getFequencyRange() {
		return fequencyRange;
	}

	public void setFequencyRange(String fequencyRange) {
		this.fequencyRange = fequencyRange;
	}

	public String getCordLength() {
		return cordLength;
	}

	public void setCordLength(String cordLength) {
		this.cordLength = cordLength;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cordLength == null) ? 0 : cordLength.hashCode());
		result = prime * result + ((fequencyRange == null) ? 0 : fequencyRange.hashCode());
		result = prime * result + ((numberOfSpeakers == null) ? 0 : numberOfSpeakers.hashCode());
		result = prime * result + ((powerConsumption == null) ? 0 : powerConsumption.hashCode());
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
		Speakers other = (Speakers) obj;
		if (cordLength == null) {
			if (other.cordLength != null)
				return false;
		} else if (!cordLength.equals(other.cordLength))
			return false;
		if (fequencyRange == null) {
			if (other.fequencyRange != null)
				return false;
		} else if (!fequencyRange.equals(other.fequencyRange))
			return false;
		if (numberOfSpeakers == null) {
			if (other.numberOfSpeakers != null)
				return false;
		} else if (!numberOfSpeakers.equals(other.numberOfSpeakers))
			return false;
		if (powerConsumption == null) {
			if (other.powerConsumption != null)
				return false;
		} else if (!powerConsumption.equals(other.powerConsumption))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Speakers [powerConsumption=" + powerConsumption + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", fequencyRange=" + fequencyRange + ", cordLength=" + cordLength + "]";
	}
}
