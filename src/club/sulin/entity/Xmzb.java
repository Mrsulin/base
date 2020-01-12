package club.sulin.entity;

/**
 * Title: Xmzb
 */
public class Xmzb {
    private String id;
    private String pid;
    /**
     * 项目个数
     */
    private Integer xmgs;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPid() {
        return pid;
    }
    public void setPid(String pid) {
        this.pid = pid;
    }
    public Integer getXmgs() {
        return xmgs;
    }
    public void setXmgs(Integer xmgs) {
        this.xmgs = xmgs;
    }
    public Xmzb(String id, String pid, Integer xmgs) {
        super();
        this.id = id;
        this.pid = pid;
        this.xmgs = xmgs;
    }


}