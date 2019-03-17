package com.sk.cashrichtask.model;

public class Item {
    private String bankName;
    private String mutualFundName;
    private double currentValue;
    private double withdrawalAmount;
    private int imageUrl;

    public Item(int imageUrl, String bankName, String mutualFundName, Double currentValue, Double withdrawalAmount) {
        this.imageUrl = imageUrl;
        this.bankName = bankName;
        this.mutualFundName = mutualFundName;
        this.currentValue = currentValue;
        this.withdrawalAmount = withdrawalAmount;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getMutualFundName() {
        return mutualFundName;
    }

    public void setMutualFundName(String mutualFundName) {
        this.mutualFundName = mutualFundName;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(double withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }
}
