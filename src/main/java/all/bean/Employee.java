package all.bean;

public class Employee {


    private Integer empId;
    private String empName;
    private String gender;
    private String email;
    private Integer dId;
    //��ѯԱ��ʱ�����ϲ���
    private Deportment deportment;
  
    public Deportment getDeportment() {
		return deportment;
	}

	public void setDeportment(Deportment deportment) {
		this.deportment = deportment;
	}

	public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

  
    public String getEmpName() {
        return empName;
    }

 
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

  
    public String getGender() {
        return gender;
    }

 
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getEmail() {
        return email;
    }

   
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

   
    public Integer getdId() {
        return dId;
    }

   
    public void setdId(Integer dId) {
        this.dId = dId;
    }
}