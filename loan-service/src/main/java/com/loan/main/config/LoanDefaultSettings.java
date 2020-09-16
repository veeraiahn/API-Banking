package com.loan.main.config;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "loan")
public class LoanDefaultSettings {
    @NotNull
    private BigDecimal interest;

    @NotNull
    private BigDecimal factor;

    @NotNull
    private Integer weekIncreasePerExtension;

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public Integer getWeekIncreasePerExtension() {
        return weekIncreasePerExtension;
    }

    public void setWeekIncreasePerExtension(Integer weekIncreasePerExtension) {
        this.weekIncreasePerExtension = weekIncreasePerExtension;
    }

    public BigDecimal getFactor() {
        return factor;
    }

    public void setFactor(BigDecimal factor) {
        this.factor = factor;
    }
}
