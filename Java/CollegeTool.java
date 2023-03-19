public class CollegeTool {
    private String tool_name;

    public CollegeTool() {
    }

    public CollegeTool(String tool_name) {
        this.tool_name = tool_name;
    }

    /* Setter & Getter */

    public void setTool_name(String tool_name) {
        this.tool_name = tool_name;
    }

    public String getTool_name() {
        return tool_name;
    }

    public void use() {
        System.out.println("==> " + this.tool_name + " is being used.");
    }
}
