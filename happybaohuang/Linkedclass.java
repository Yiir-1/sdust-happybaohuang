package happybaohuang;

public class Linkedclass {
	int num=1;
	MyMap m;
	Linkedclass(MyMap m)
	{
		
		this.m=m;
	}
	public void addnum()
	{
		this.num++;
	}
	public int getnum()
	{
		return this.num;
	}
	public MyMap getmymap()
	{
		return this.m;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((m == null) ? 0 : m.hashCode());
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
		Linkedclass other = (Linkedclass) obj;
		if (m == null) {
			if (other.m != null)
				return false;
		} else if (!m.equals(other.m))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Linkedclass [num=" + num + ", m=" + m + "]";
	}
	
	
}
