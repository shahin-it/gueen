package com.queen_cash.domain;

import com.queen_cash.domain.admin.Administrator;
import com.queen_cash.domain.model.DomainBase;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Sales extends DomainBase {

    @OneToMany
    private Collection<SalesItem> salesItems = new ArrayList<>();
    @NotNull
    private Double salesTotal = 0.0;

    @NotNull
    @OneToOne
    private Administrator salesMan;
    @OneToOne
    private Customer customer;

    @NotNull
    private String customerName;
    @NotNull
    private String salesManName;
}
