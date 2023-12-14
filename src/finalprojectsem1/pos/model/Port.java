
package finalprojectsem1.pos.model;


public class Port {
   private String P_ID;
   private String Port_Name;

    /**
     * @return the P_ID
     */
    public String getP_ID() {
        return P_ID;
    }

    public Port(String P_ID, String Port_Name) {
        this.P_ID = P_ID;
        this.Port_Name = Port_Name;
    }

    public Port() {
    }

    /**
     * @param P_ID the P_ID to set
     */
    public void setP_ID(String P_ID) {
        this.P_ID = P_ID;
    }

    /**
     * @return the Port_Name
     */
    public String getPort_Name() {
        return Port_Name;
    }

    /**
     * @param Port_Name the Port_Name to set
     */
    public void setPort_Name(String Port_Name) {
        this.Port_Name = Port_Name;
    }
   
}
