package Model;

import java.util.Date;

public class DevicePriceLog {
    private int logId;
    private int deviceId;
    private Double suggestedBuyinPrice;
    private Double suggestedSellingPrice;
    private double actualSellingPrice;
    private double marketAdjustment;
    private Date changedAt;
    private Integer changedBy;

    public DevicePriceLog() {
    }

    public DevicePriceLog(int logId, int deviceId, Double suggestedBuyinPrice, Double suggestedSellingPrice, double actualSellingPrice, double marketAdjustment, Date changedAt, Integer changedBy) {
        this.logId = logId;
        this.deviceId = deviceId;
        this.suggestedBuyinPrice = suggestedBuyinPrice;
        this.suggestedSellingPrice = suggestedSellingPrice;
        this.actualSellingPrice = actualSellingPrice;
        this.marketAdjustment = marketAdjustment;
        this.changedAt = changedAt;
        this.changedBy = changedBy;
    }

    public int getLogId() { return logId; }
    public void setLogId(int logId) { this.logId = logId; }

    public int getDeviceId() { return deviceId; }
    public void setDeviceId(int deviceId) { this.deviceId = deviceId; }

    public Double getSuggestedBuyinPrice() { return suggestedBuyinPrice; }
    public void setSuggestedBuyinPrice(Double suggestedBuyinPrice) { this.suggestedBuyinPrice = suggestedBuyinPrice; }

    public Double getSuggestedSellingPrice() { return suggestedSellingPrice; }
    public void setSuggestedSellingPrice(Double suggestedSellingPrice) { this.suggestedSellingPrice = suggestedSellingPrice; }

    public double getActualSellingPrice() { return actualSellingPrice; }
    public void setActualSellingPrice(double actualSellingPrice) { this.actualSellingPrice = actualSellingPrice; }

    public double getMarketAdjustment() { return marketAdjustment; }
    public void setMarketAdjustment(double marketAdjustment) { this.marketAdjustment = marketAdjustment; }

    public Date getChangedAt() { return changedAt; }
    public void setChangedAt(Date changedAt) { this.changedAt = changedAt; }

    public Integer getChangedBy() { return changedBy; }
    public void setChangedBy(Integer changedBy) { this.changedBy = changedBy; }
}