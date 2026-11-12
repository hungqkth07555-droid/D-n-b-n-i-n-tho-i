package Model;

public class PriceComparisonsCache {
    private int cacheId;
    private int variantId;
    private String qualityTier;
    private Integer avgBatteryHealth;
    private double avgPrice;
    private double savingsVsNew;

    public PriceComparisonsCache() {
    }

    public PriceComparisonsCache(int cacheId, int variantId, String qualityTier, Integer avgBatteryHealth, double avgPrice, double savingsVsNew) {
        this.cacheId = cacheId;
        this.variantId = variantId;
        this.qualityTier = qualityTier;
        this.avgBatteryHealth = avgBatteryHealth;
        this.avgPrice = avgPrice;
        this.savingsVsNew = savingsVsNew;
    }

    public int getCacheId() { return cacheId; }
    public void setCacheId(int cacheId) { this.cacheId = cacheId; }

    public int getVariantId() { return variantId; }
    public void setVariantId(int variantId) { this.variantId = variantId; }

    public String getQualityTier() { return qualityTier; }
    public void setQualityTier(String qualityTier) { this.qualityTier = qualityTier; }

    public Integer getAvgBatteryHealth() { return avgBatteryHealth; }
    public void setAvgBatteryHealth(Integer avgBatteryHealth) { this.avgBatteryHealth = avgBatteryHealth; }

    public double getAvgPrice() { return avgPrice; }
    public void setAvgPrice(double avgPrice) { this.avgPrice = avgPrice; }

    public double getSavingsVsNew() { return savingsVsNew; }
    public void setSavingsVsNew(double savingsVsNew) { this.savingsVsNew = savingsVsNew; }
}