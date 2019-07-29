
package com.ustcsoft.pdqc.core.autogen.entity;

import java.util.Date;

import com.ustcsoft.pdqc.core.common.entity.Entity;

/**
 * Entity基类.
 * 
 * @author kxiong
 *
 */
public class BaseEntity implements Entity {
    /**
     * EntryId (M_ALLERGY.EntryId)
     */
    private String entryid;

    /**
     * EntryDate (M_ALLERGY.EntryDate)
     */
    private Date entrydate;

    /**
     * ModifyId (M_ALLERGY.ModifyId)
     */
    private String modifyid;

    /**
     * ModifyDate (M_ALLERGY.ModifyDate)
     */
    private Date modifydate;

    /**
     * entryid的GET方法.
     *
     * @return entryid
     */
    public String getEntryid() {
        return entryid;
    }

    /**
     * entryid的SET方法.
     *
     * @param entryid entryid
     */
    public void setEntryid(String entryid) {
        this.entryid = entryid;
    }

    /**
     * entrydate的GET方法.
     *
     * @return entrydate
     */
    public Date getEntrydate() {
        return entrydate;
    }

    /**
     * entrydate的SET方法.
     *
     * @param entrydate entrydate
     */
    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    /**
     * modifyid的GET方法.
     *
     * @return modifyid
     */
    public String getModifyid() {
        return modifyid;
    }

    /**
     * modifyid的SET方法.
     *
     * @param modifyid modifyid
     */
    public void setModifyid(String modifyid) {
        this.modifyid = modifyid;
    }

    /**
     * modifydate的GET方法.
     *
     * @return modifydate
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * modifydate的SET方法.
     *
     * @param modifydate modifydate
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * <code>serialVersionUID</code>.
     */
    private static final long serialVersionUID = 1L;

}
