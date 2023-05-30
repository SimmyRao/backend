

import java.util.ArrayList;
import java.util.List;

import javax.persistance.Entity;
import javax.presistence.Id;
import javax.persistence.;
import javax.persistence.OneToMany;






public class LA {

	@Id
	private int cid;
	private String cname;
	@ManyToOne
	private LATeachers lat;
	@OneToMany(mappedBy ="lacc")
	private List<LASubjects> las = new Arraylist<LASubjects>()
    public int getCid() {
		    return cid ;
	}
	public void setCid (int cid) {
		this.cid = cid;
	}
	public String getCName() {
	        return cname;
	}
	
	public void setCname(String cname)  {
		this.cname = cname;
	}
	public LATeachers getLat() {
	       return lat;
	}
	public void setLat(LATeachers lat) {
		   this.lat = lat;
	}
	publicList<LASubjects>getLas() {
		     return las;
	}
	public void setLas(List<LASubject>las) {
		    this.las = las;
	}

		
		    
	}
		
	
	
	
	
	

	}

	
	
}







