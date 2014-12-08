package com.mossle.internal.template.persistence.domain;

// Generated by Hibernate Tools
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TemplateInfo .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "TEMPLATE_INFO")
public class TemplateInfo implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private String name;

    /** null. */
    private String code;

    /** . */
    private Set<TemplateField> templateFields = new HashSet<TemplateField>(0);

    public TemplateInfo() {
    }

    public TemplateInfo(String name, String code,
            Set<TemplateField> templateFields) {
        this.name = name;
        this.code = code;
        this.templateFields = templateFields;
    }

    /** @return null. */
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @Column(name = "NAME", length = 50)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "CODE", length = 50)
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     *            null.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "templateInfo")
    public Set<TemplateField> getTemplateFields() {
        return this.templateFields;
    }

    /**
     * @param templateFields
     *            .
     */
    public void setTemplateFields(Set<TemplateField> templateFields) {
        this.templateFields = templateFields;
    }
}
