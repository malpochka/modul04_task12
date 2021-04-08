package by.epam.car.entity;

public class Engine {
	private String type;

	public Engine(String type) {
		this.type = type;
	}

	public Engine() {
		this.type = "Бензиновый";
	}

	public void onEngine() {
		System.out.println("Включить зажигание");
	}

	public void offEngine() {
		System.out.println("Выключить зажигание");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Engine other = (Engine) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return type;
	}

}
