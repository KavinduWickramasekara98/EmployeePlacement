
package finalprojectsem1.pos.model;

public class Group {
    private String G_ID;
    private String Group_Name;

    
    public String getG_ID() {
        return G_ID;
    }

    public Group(String G_ID, String Group_Name) {
        this.G_ID = G_ID;
        this.Group_Name = Group_Name;
    }

    public Group() {
    }

    
    public void setG_ID(String G_ID) {
        this.G_ID = G_ID;
    }

   
    public String getGroup_Name() {
        return Group_Name;
    }

    /**
     * @param Group_Name the Group_Name to set
     */
    public void setGroup_Name(String Group_Name) {
        this.Group_Name = Group_Name;
    }
}
