/*
 * This file is generated by jOOQ.
 */
package org.blackdread.lib.restfilter.demo.jooq;


import org.blackdread.lib.restfilter.demo.jooq.tables.ChildEntity;
import org.blackdread.lib.restfilter.demo.jooq.tables.ParentEntity;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -1887564855;

    /**
     * The reference instance of <code>PUBLIC</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>PUBLIC.CHILD_ENTITY</code>.
     */
    public final ChildEntity CHILD_ENTITY = ChildEntity.CHILD_ENTITY;

    /**
     * The table <code>PUBLIC.PARENT_ENTITY</code>.
     */
    public final ParentEntity PARENT_ENTITY = ParentEntity.PARENT_ENTITY;

    /**
     * No further instances allowed
     */
    private Public() {
        super("PUBLIC", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            ChildEntity.CHILD_ENTITY,
            ParentEntity.PARENT_ENTITY);
    }
}