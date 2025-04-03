package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private Bar bar;
    private List<Baz> bazs = new ArrayList<>();
    private Qux qux;
    private Corge corge;
    private List<Grault> graults = new ArrayList<>();

    public Foo(Bar bar) {
        this.bar = bar;
        this.qux = new Qux();
        this.corge = null;
    }

    public void addBaz(final Baz baz) {
        this.bazs.add(baz);
    }

    public void addGrault(final Grault grault) {
        this.graults.add(grault);
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
        this.corge = corge;
    }

    public List<Grault> getGraults() {
        return this.graults;
    }
}
