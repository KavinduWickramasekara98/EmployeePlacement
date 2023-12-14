
package finalprojectsem1.pos.model;
 

public class DutyPoint {
    private String DP_ID;
    private int no_of_Employee;
    private String D_ID;
    private String G_ID;

    public DutyPoint(String DP_ID, int no_of_Employee, String D_ID, String G_ID) {
        this.DP_ID = DP_ID;
        this.no_of_Employee = no_of_Employee;
        this.D_ID = D_ID;
        this.G_ID = G_ID;
    }

    public DutyPoint() {
    }

    /**
     * @return the DP_ID
     */
    public String getDP_ID() {
        return DP_ID;
    }

    /**
     * @param DP_ID the DP_ID to set
     */
    public void setDP_ID(String DP_ID) {
        this.DP_ID = DP_ID;
    }

    /**
     * @return the no_of_Employee
     */
    public int getNo_of_Employee() {
        return no_of_Employee;
    }

    /**
     * @param no_of_Employee the no_of_Employee to set
     */
    public void setNo_of_Employee(int no_of_Employee) {
        this.no_of_Employee = no_of_Employee;
    }

    /**
     * @return the D_ID
     */
    public String getD_ID() {
        return D_ID;
    }

    /**
     * @param D_ID the D_ID to set
     */
    public void setD_ID(String D_ID) {
        this.D_ID = D_ID;
    }

    /**
     * @return the G_ID
     */
    public String getG_ID() {
        return G_ID;
    }

    /**
     * @param G_ID the G_ID to set
     */
    public void setG_ID(String G_ID) {
        this.G_ID = G_ID;
    }
    
}
