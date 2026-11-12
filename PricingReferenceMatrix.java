package Model;

import java.util.Date;

public class PricingReferenceMatrix {
    private int matrixId;
    private int variantId;
    private double baseNewPrice;
    private double baseUsedPrice;
    private Date updatedAt;

    public PricingReferenceMatrix() {
    }

    public PricingReferenceMatrix(int matrixId, int variantId, double baseNewPrice, double baseUsedPrice, Date updatedAt) {
        this.matrixId = matrixId;
        this.variantId = variantId;
        this.baseNewPrice = baseNewPrice;
        this.baseUsedPrice = baseUsedPrice;
        this.updatedAt = updatedAt;
    }

    public int getMatrixId() { return matrixId; }
    public void setMatrixId(int matrixId) { this.matrixId = matrixId; }

    public int getVariantId() { return variantId; }
    public void setVariantId(int variantId) { this.variantId = variantId; }

    public double getBaseNewPrice() { return baseNewPrice; }
    public void setBaseNewPrice(double baseNewPrice) { this.baseNewPrice = baseNewPrice; }

    public double getBaseUsedPrice() { return baseUsedPrice; }
    public void setBaseUsedPrice(double baseUsedPrice) { this.baseUsedPrice = baseUsedPrice; }

    public Date getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Date updatedAt) { this.updatedAt = updatedAt; }
}