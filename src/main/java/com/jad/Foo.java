package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private Bar bar;
    private List<Baz> bazs;
    private Qux qux;
    private Corge corge;
    private List<Grault> graults;

    public Foo(Bar bar) {
        this.bazs = new ArrayList<>();
        this.bar = bar;
        this.qux = new Qux();
        this.corge = null;
        this.graults = new ArrayList<>();
    }

    public void addBaz(final Baz baz) {
        this.bazs.add(baz);
    }

    public void addGrault() {
        this.graults.add(new Grault(this));
    }

    public Bar getBar() {
        return this.bar;
    }

    public List<Baz> getBazs() {
        return this.bazs;
    }

    public Qux getQux() {
        return this.qux;
    }

    public Corge getCorge() {
        return this.corge;
    }

    public void setCorge(final Corge corge) {
        if (this.corge == null) {
            this.corge = corge;
            this.corge.setFoo(this);
        } else {
            this.corge.setFoo(null);
            this.corge = corge;
        }
    }

    public List<Grault> getGraults() {
        return this.graults;
    }
}
