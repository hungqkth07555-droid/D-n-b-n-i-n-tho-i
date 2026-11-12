package Model;

public class QualityGradingCriteria {
    private int criterionId;
    private String criterionName;
    private String category;
    private double weight;

    public QualityGradingCriteria() {
    }

    public QualityGradingCriteria(int criterionId, String criterionName, String category, double weight) {
        this.criterionId = criterionId;
        this.criterionName = criterionName;
        this.category = category;
        this.weight = weight;
    }

    public int getCriterionId() { return criterionId; }
    public void setCriterionId(int criterionId) { this.criterionId = criterionId; }

    public String getCriterionName() { return criterionName; }
    public void setCriterionName(String criterionName) { this.criterionName = criterionName; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }
}