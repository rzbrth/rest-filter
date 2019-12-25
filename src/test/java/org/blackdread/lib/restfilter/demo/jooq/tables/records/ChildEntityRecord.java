/*
 * This file is generated by jOOQ.
 */
/*
 * MIT License
 *
 * Copyright (c) 2019-2020 Yoann CAPLAIN
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.blackdread.lib.restfilter.demo.jooq.tables.records;


import org.blackdread.lib.restfilter.demo.jooq.tables.ChildEntity;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ChildEntityRecord extends UpdatableRecordImpl<ChildEntityRecord> implements Record11<Long, String, Instant, BigDecimal, Integer, LocalDate, Short, Boolean, UUID, String, Long> {

    private static final long serialVersionUID = -319274980;

    /**
     * Setter for <code>PUBLIC.CHILD_ENTITY.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.CHILD_ENTITY.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>PUBLIC.CHILD_ENTITY.NAME</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.CHILD_ENTITY.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.CHILD_ENTITY.CREATE_TIME</code>.
     */
    public void setCreateTime(Instant value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.CHILD_ENTITY.CREATE_TIME</code>.
     */
    public Instant getCreateTime() {
        return (Instant) get(2);
    }

    /**
     * Setter for <code>PUBLIC.CHILD_ENTITY.TOTAL</code>.
     */
    public void setTotal(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.CHILD_ENTITY.TOTAL</code>.
     */
    public BigDecimal getTotal() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>PUBLIC.CHILD_ENTITY.COUNT</code>.
     */
    public void setCount(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.CHILD_ENTITY.COUNT</code>.
     */
    public Integer getCount() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>PUBLIC.CHILD_ENTITY.LOCAL_DATE</code>.
     */
    public void setLocalDate(LocalDate value) {
        set(5, value);
    }

    /**
     * Getter for <code>PUBLIC.CHILD_ENTITY.LOCAL_DATE</code>.
     */
    public LocalDate getLocalDate() {
        return (LocalDate) get(5);
    }

    /**
     * Setter for <code>PUBLIC.CHILD_ENTITY.A_SHORT</code>.
     */
    public void setAShort(Short value) {
        set(6, value);
    }

    /**
     * Getter for <code>PUBLIC.CHILD_ENTITY.A_SHORT</code>.
     */
    public Short getAShort() {
        return (Short) get(6);
    }

    /**
     * Setter for <code>PUBLIC.CHILD_ENTITY.ACTIVE</code>.
     */
    public void setActive(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>PUBLIC.CHILD_ENTITY.ACTIVE</code>.
     */
    public Boolean getActive() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>PUBLIC.CHILD_ENTITY.UUID</code>.
     */
    public void setUuid(UUID value) {
        set(8, value);
    }

    /**
     * Getter for <code>PUBLIC.CHILD_ENTITY.UUID</code>.
     */
    public UUID getUuid() {
        return (UUID) get(8);
    }

    /**
     * Setter for <code>PUBLIC.CHILD_ENTITY.DURATION</code>.
     */
    public void setDuration(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>PUBLIC.CHILD_ENTITY.DURATION</code>.
     */
    public String getDuration() {
        return (String) get(9);
    }

    /**
     * Setter for <code>PUBLIC.CHILD_ENTITY.PARENT_ID</code>.
     */
    public void setParentId(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>PUBLIC.CHILD_ENTITY.PARENT_ID</code>.
     */
    public Long getParentId() {
        return (Long) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, Instant, BigDecimal, Integer, LocalDate, Short, Boolean, UUID, String, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, Instant, BigDecimal, Integer, LocalDate, Short, Boolean, UUID, String, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ChildEntity.CHILD_ENTITY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ChildEntity.CHILD_ENTITY.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Instant> field3() {
        return ChildEntity.CHILD_ENTITY.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return ChildEntity.CHILD_ENTITY.TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ChildEntity.CHILD_ENTITY.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDate> field6() {
        return ChildEntity.CHILD_ENTITY.LOCAL_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field7() {
        return ChildEntity.CHILD_ENTITY.A_SHORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return ChildEntity.CHILD_ENTITY.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field9() {
        return ChildEntity.CHILD_ENTITY.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ChildEntity.CHILD_ENTITY.DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return ChildEntity.CHILD_ENTITY.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Instant component3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDate component6() {
        return getLocalDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component7() {
        return getAShort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component9() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Instant value3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDate value6() {
        return getLocalDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value7() {
        return getAShort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value9() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildEntityRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildEntityRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildEntityRecord value3(Instant value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildEntityRecord value4(BigDecimal value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildEntityRecord value5(Integer value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildEntityRecord value6(LocalDate value) {
        setLocalDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildEntityRecord value7(Short value) {
        setAShort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildEntityRecord value8(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildEntityRecord value9(UUID value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildEntityRecord value10(String value) {
        setDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildEntityRecord value11(Long value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildEntityRecord values(Long value1, String value2, Instant value3, BigDecimal value4, Integer value5, LocalDate value6, Short value7, Boolean value8, UUID value9, String value10, Long value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ChildEntityRecord
     */
    public ChildEntityRecord() {
        super(ChildEntity.CHILD_ENTITY);
    }

    /**
     * Create a detached, initialised ChildEntityRecord
     */
    public ChildEntityRecord(Long id, String name, Instant createTime, BigDecimal total, Integer count, LocalDate localDate, Short aShort, Boolean active, UUID uuid, String duration, Long parentId) {
        super(ChildEntity.CHILD_ENTITY);

        set(0, id);
        set(1, name);
        set(2, createTime);
        set(3, total);
        set(4, count);
        set(5, localDate);
        set(6, aShort);
        set(7, active);
        set(8, uuid);
        set(9, duration);
        set(10, parentId);
    }
}
