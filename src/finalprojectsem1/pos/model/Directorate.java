
package finalprojectsem1.pos.model;

public class Directorate {
    private String D_ID;
    private String Directorate_Name;
    private String P_ID;

    public Directorate(String D_ID, String Directorate_Name, String P_ID) {
        this.D_ID = D_ID;
        this.Directorate_Name = Directorate_Name;
        this.P_ID = P_ID;
    }

    public Directorate() {
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
     * @return the Directorate_Name
     */
    public String getDirectorate_Name() {
        return Directorate_Name;
    }

    /**
     * @param Directorate_Name the Directorate_Name to set
     */
    public void setDirectorate_Name(String Directorate_Name) {
        this.Directorate_Name = Directorate_Name;
    }

    /**
     * @return the P_ID
     */
    public String getP_ID() {
        return P_ID;
    }

    /**
     * @param P_ID the P_ID to set
     */
    public void setP_ID(String P_ID) {
        this.P_ID = P_ID;
    }
}
