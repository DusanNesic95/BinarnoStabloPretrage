package com.dusannesic.bst;

public class Element {

	private int vrednost;
	private Element levi;
	private Element desni;
	
	public Element(int vrednost) {
		this.vrednost = vrednost;
		this.levi = null;
		this.desni = null;
	}

	public int getVrednost() {
		return vrednost;
	}

	public void setVrednost(int vrednost) {
		this.vrednost = vrednost;
	}

	public Element getLevi() {
		return levi;
	}

	public void setLevi(Element levi) {
		this.levi = levi;
	}

	public Element getDesni() {
		return desni;
	}

	public void setDesni(Element desni) {
		this.desni = desni;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desni == null) ? 0 : desni.hashCode());
		result = prime * result + ((levi == null) ? 0 : levi.hashCode());
		result = prime * result + vrednost;
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
		Element other = (Element) obj;
		if (desni == null) {
			if (other.desni != null)
				return false;
		} else if (!desni.equals(other.desni))
			return false;
		if (levi == null) {
			if (other.levi != null)
				return false;
		} else if (!levi.equals(other.levi))
			return false;
		if (vrednost != other.vrednost)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Element [vrednost=" + vrednost + ", levi=" + levi + ", desni=" + desni + "]";
	}
	
}
