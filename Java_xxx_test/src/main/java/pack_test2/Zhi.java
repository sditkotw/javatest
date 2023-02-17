package pack_test2;

import pack_test1.Fu;

import java.util.Date;
import java.util.Map;

/** * @author  sdking 
 * @date 创建时间：2018年5月23日 上午9:31:45 
 * @version 1.0 
 * @parameter   
 */
public class Zhi extends Fu {
	private String name;
	private Date date;
	private Map<String,Object> dataMap;

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Zhi [name=" + name + ", getName()=" + getName()+
				"date=" + date + ", dataMap=" + dataMap
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public Zhi(String name,Date date) {
		super();
		this.name = name;
		this.date=date;
	}

	public Zhi() {
		super();
		// TODO Auto-generated constructor stub
	}



	
}
