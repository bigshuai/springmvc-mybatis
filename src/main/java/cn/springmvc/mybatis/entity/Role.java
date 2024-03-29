package cn.springmvc.mybatis.entity;


/**
 * 角色
 *
 * @author Vincent.wang
 *
 */
public class Role implements BaseEntity<String> {

    private static final long serialVersionUID = -6982490361440305761L;

    private String id;

    /** 角色名称 **/
    private String name;

    /** 编码 **/
    private String code;

    /** 备注 **/
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
