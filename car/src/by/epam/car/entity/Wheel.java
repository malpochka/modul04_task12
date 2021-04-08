package by.epam.car.entity;

public class Wheel {

	private int radius;
	private String brand;

	public Wheel(int radius, String brand) {
		this.radius = radius;
		this.brand = brand;

	}

	public Wheel() {
		this.radius = 8;
		this.brand = "Белшина";
	}

	public void spinTheWheel() {
		System.out.println("Колеса крутяться");
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + radius;
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
		Wheel other = (Wheel) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (radius != other.radius)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return " [радиус=" + radius + ",марка: " + brand + "]";
	}

}
