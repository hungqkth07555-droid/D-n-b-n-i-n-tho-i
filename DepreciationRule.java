package Model;

public class DepreciationRule {
    private int ruleId;
    private String ruleType;
    private Double minVal; 
    private Double maxVal;
    private double deductionAmount;
    private double deductionPercentage;

    public DepreciationRule() {
    }

    public DepreciationRule(int ruleId, String ruleType, Double minVal, Double maxVal, double deductionAmount, double deductionPercentage) {
        this.ruleId = ruleId;
        this.ruleType = ruleType;
        this.minVal = minVal;
        this.maxVal = maxVal;
        this.deductionAmount = deductionAmount;
        this.deductionPercentage = deductionPercentage;
    }

    public int getRuleId() { return ruleId; }
    public void setRuleId(int ruleId) { this.ruleId = ruleId; }

    public String getRuleType() { return ruleType; }
    public void setRuleType(String ruleType) { this.ruleType = ruleType; }

    public Double getMinVal() { return minVal; }
    public void setMinVal(Double minVal) { this.minVal = minVal; }

    public Double getMaxVal() { return maxVal; }
    public void setMaxVal(Double maxVal) { this.maxVal = maxVal; }

    public double getDeductionAmount() { return deductionAmount; }
    public void setDeductionAmount(double deductionAmount) { this.deductionAmount = deductionAmount; }

    public double getDeductionPercentage() { return deductionPercentage; }
    public void setDeductionPercentage(double deductionPercentage) { this.deductionPercentage = deductionPercentage; }
}