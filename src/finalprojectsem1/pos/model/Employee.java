
package finalprojectsem1.pos.model;
public class Employee {
    private int  Employee_Seniority;
    private String  EID;
    private String  Name;  
    private String  Address;

    public Employee() {
    }

    public Employee(int Employee_Seniority, String EID, String Name, String Address) {
        this.Employee_Seniority = Employee_Seniority;
        this.EID = EID;
        this.Name = Name;
        this.Address = Address;
    }

    
    public int getEmployee_Seniority() {
        return Employee_Seniority;
    }

    
    public void setEmployee_Seniority(int Employee_Seniority) {
        this.Employee_Seniority = Employee_Seniority;
    }

    
    public String getEID() {
        return EID;
    }

    /**
     * @param EID the EID to set
     */
    public void setEID(String EID) {
        this.EID = EID;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "Employee{" + "Employee_Seniority=" + Employee_Seniority + ", EID=" + EID + ", Name=" + Name + ", Address=" + Address + '}';
    }

    
    
}
