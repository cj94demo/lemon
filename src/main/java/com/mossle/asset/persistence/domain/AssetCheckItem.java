package com.mossle.asset.persistence.domain;

// Generated by Hibernate Tools
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AssetCheckItem 资产申请细目.
 * 
 * @author Lingo
 */
@Entity
@Table(name = "ASSET_CHECK_ITEM")
public class AssetCheckItem implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** 主键. */
    private Long id;

    /** null. */
    private AssetCheckInfo assetCheckInfo;

    /** null. */
    private String code;

    /** null. */
    private String productCategory;

    /** null. */
    private String purpose;

    /** null. */
    private String productName;

    /** null. */
    private String productModel;

    /** null. */
    private Integer productPrice;

    /** null. */
    private Integer productNum;

    /** null. */
    private String description;

    /** null. */
    private String tenantId;

    public AssetCheckItem() {
    }

    public AssetCheckItem(Long id) {
        this.id = id;
    }

    public AssetCheckItem(Long id, AssetCheckInfo assetCheckInfo, String code,
            String productCategory, String purpose, String productName,
            String productModel, Integer productPrice, Integer productNum,
            String description, String tenantId) {
        this.id = id;
        this.assetCheckInfo = assetCheckInfo;
        this.code = code;
        this.productCategory = productCategory;
        this.purpose = purpose;
        this.productName = productName;
        this.productModel = productModel;
        this.productPrice = productPrice;
        this.productNum = productNum;
        this.description = description;
        this.tenantId = tenantId;
    }

    /** @return 主键. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            主键.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INFO_ID")
    public AssetCheckInfo getAssetCheckInfo() {
        return this.assetCheckInfo;
    }

    /**
     * @param assetCheckInfo
     *            null.
     */
    public void setAssetCheckInfo(AssetCheckInfo assetCheckInfo) {
        this.assetCheckInfo = assetCheckInfo;
    }

    /** @return null. */
    @Column(name = "CODE", length = 100)
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

    /** @return null. */
    @Column(name = "PRODUCT_CATEGORY", length = 100)
    public String getProductCategory() {
        return this.productCategory;
    }

    /**
     * @param productCategory
     *            null.
     */
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    /** @return null. */
    @Column(name = "PURPOSE", length = 100)
    public String getPurpose() {
        return this.purpose;
    }

    /**
     * @param purpose
     *            null.
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /** @return null. */
    @Column(name = "PRODUCT_NAME", length = 200)
    public String getProductName() {
        return this.productName;
    }

    /**
     * @param productName
     *            null.
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /** @return null. */
    @Column(name = "PRODUCT_MODEL", length = 50)
    public String getProductModel() {
        return this.productModel;
    }

    /**
     * @param productModel
     *            null.
     */
    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    /** @return null. */
    @Column(name = "PRODUCT_PRICE")
    public Integer getProductPrice() {
        return this.productPrice;
    }

    /**
     * @param productPrice
     *            null.
     */
    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    /** @return null. */
    @Column(name = "PRODUCT_NUM")
    public Integer getProductNum() {
        return this.productNum;
    }

    /**
     * @param productNum
     *            null.
     */
    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    /** @return null. */
    @Column(name = "DESCRIPTION", length = 200)
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     *            null.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** @return null. */
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            null.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}