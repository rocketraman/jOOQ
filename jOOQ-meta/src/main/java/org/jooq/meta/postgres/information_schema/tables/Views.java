/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.postgres.information_schema.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.postgres.information_schema.InformationSchema;
import org.jooq.meta.postgres.information_schema.Keys;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Views extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.views</code>
     */
    public static final Views VIEWS = new Views();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.views.table_catalog</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.views.table_schema</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.views.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.views.view_definition</code>.
     */
    public final TableField<Record, String> VIEW_DEFINITION = createField(DSL.name("view_definition"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.views.check_option</code>.
     */
    public final TableField<Record, String> CHECK_OPTION = createField(DSL.name("check_option"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.views.is_updatable</code>.
     */
    public final TableField<Record, String> IS_UPDATABLE = createField(DSL.name("is_updatable"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.views.is_insertable_into</code>.
     */
    public final TableField<Record, String> IS_INSERTABLE_INTO = createField(DSL.name("is_insertable_into"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.views.is_trigger_updatable</code>.
     */
    public final TableField<Record, String> IS_TRIGGER_UPDATABLE = createField(DSL.name("is_trigger_updatable"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.views.is_trigger_deletable</code>.
     */
    public final TableField<Record, String> IS_TRIGGER_DELETABLE = createField(DSL.name("is_trigger_deletable"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column
     * <code>information_schema.views.is_trigger_insertable_into</code>.
     */
    public final TableField<Record, String> IS_TRIGGER_INSERTABLE_INTO = createField(DSL.name("is_trigger_insertable_into"), SQLDataType.VARCHAR(3), this, "");

    private Views(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Views(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>information_schema.views</code> table reference
     */
    public Views(String alias) {
        this(DSL.name(alias), VIEWS);
    }

    /**
     * Create an aliased <code>information_schema.views</code> table reference
     */
    public Views(Name alias) {
        this(alias, VIEWS);
    }

    /**
     * Create a <code>information_schema.views</code> table reference
     */
    public Views() {
        this(DSL.name("views"), null);
    }

    public <O extends Record> Views(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, VIEWS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.asList(Keys.VIEWS__SYNTHETIC_FK_VIEWS__SYNTHETIC_PK_SCHEMATA, Keys.VIEWS__SYNTHETIC_FK_VIEWS__SYNTHETIC_PK_TABLES);
    }

    private transient Schemata _schemata;
    private transient Tables _tables;

    /**
     * Get the implicit join path to the
     * <code>information_schema.schemata</code> table.
     */
    public Schemata schemata() {
        if (_schemata == null)
            _schemata = new Schemata(this, Keys.VIEWS__SYNTHETIC_FK_VIEWS__SYNTHETIC_PK_SCHEMATA);

        return _schemata;
    }

    /**
     * Get the implicit join path to the <code>information_schema.tables</code>
     * table.
     */
    public Tables tables() {
        if (_tables == null)
            _tables = new Tables(this, Keys.VIEWS__SYNTHETIC_FK_VIEWS__SYNTHETIC_PK_TABLES);

        return _tables;
    }

    @Override
    public Views as(String alias) {
        return new Views(DSL.name(alias), this);
    }

    @Override
    public Views as(Name alias) {
        return new Views(alias, this);
    }

    @Override
    public Views as(Table<?> alias) {
        return new Views(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Views rename(String name) {
        return new Views(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Views rename(Name name) {
        return new Views(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Views rename(Table<?> name) {
        return new Views(name.getQualifiedName(), null);
    }
}
