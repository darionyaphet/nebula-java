/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class ColumnDef implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ColumnDef");
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)1);
  private static final TField TYPE_FIELD_DESC = new TField("type", TType.I32, (short)2);
  private static final TField DEFAULT_VALUE_FIELD_DESC = new TField("default_value", TType.STRUCT, (short)3);
  private static final TField TYPE_LENGTH_FIELD_DESC = new TField("type_length", TType.I16, (short)4);
  private static final TField NULLABLE_FIELD_DESC = new TField("nullable", TType.BOOL, (short)5);

  public byte[] name;
  /**
   * 
   * @see PropertyType
   */
  public int type;
  public com.vesoft.nebula.Value default_value;
  public short type_length;
  public boolean nullable;
  public static final int NAME = 1;
  public static final int TYPE = 2;
  public static final int DEFAULT_VALUE = 3;
  public static final int TYPE_LENGTH = 4;
  public static final int NULLABLE = 5;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __TYPE_ISSET_ID = 0;
  private static final int __TYPE_LENGTH_ISSET_ID = 1;
  private static final int __NULLABLE_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(NAME, new FieldMetaData("name", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(TYPE, new FieldMetaData("type", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(DEFAULT_VALUE, new FieldMetaData("default_value", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, com.vesoft.nebula.Value.class)));
    tmpMetaDataMap.put(TYPE_LENGTH, new FieldMetaData("type_length", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I16)));
    tmpMetaDataMap.put(NULLABLE, new FieldMetaData("nullable", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(ColumnDef.class, metaDataMap);
  }

  public ColumnDef() {
    this.type_length = (short)0;

    this.nullable = false;

  }

  public ColumnDef(
    byte[] name,
    int type)
  {
    this();
    this.name = name;
    this.type = type;
    setTypeIsSet(true);
  }

  public ColumnDef(
    byte[] name,
    int type,
    com.vesoft.nebula.Value default_value,
    short type_length,
    boolean nullable)
  {
    this();
    this.name = name;
    this.type = type;
    setTypeIsSet(true);
    this.default_value = default_value;
    this.type_length = type_length;
    setType_lengthIsSet(true);
    this.nullable = nullable;
    setNullableIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ColumnDef(ColumnDef other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetName()) {
      this.name = TBaseHelper.deepCopy(other.name);
    }
    this.type = TBaseHelper.deepCopy(other.type);
    if (other.isSetDefault_value()) {
      this.default_value = TBaseHelper.deepCopy(other.default_value);
    }
    this.type_length = TBaseHelper.deepCopy(other.type_length);
    this.nullable = TBaseHelper.deepCopy(other.nullable);
  }

  public ColumnDef deepCopy() {
    return new ColumnDef(this);
  }

  @Deprecated
  public ColumnDef clone() {
    return new ColumnDef(this);
  }

  public byte[]  getName() {
    return this.name;
  }

  public ColumnDef setName(byte[] name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  // Returns true if field name is set (has been assigned a value) and false otherwise
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  /**
   * 
   * @see PropertyType
   */
  public int  getType() {
    return this.type;
  }

  /**
   * 
   * @see PropertyType
   */
  public ColumnDef setType(int type) {
    this.type = type;
    setTypeIsSet(true);
    return this;
  }

  public void unsetType() {
    __isset_bit_vector.clear(__TYPE_ISSET_ID);
  }

  // Returns true if field type is set (has been assigned a value) and false otherwise
  public boolean isSetType() {
    return __isset_bit_vector.get(__TYPE_ISSET_ID);
  }

  public void setTypeIsSet(boolean value) {
    __isset_bit_vector.set(__TYPE_ISSET_ID, value);
  }

  public com.vesoft.nebula.Value  getDefault_value() {
    return this.default_value;
  }

  public ColumnDef setDefault_value(com.vesoft.nebula.Value default_value) {
    this.default_value = default_value;
    return this;
  }

  public void unsetDefault_value() {
    this.default_value = null;
  }

  // Returns true if field default_value is set (has been assigned a value) and false otherwise
  public boolean isSetDefault_value() {
    return this.default_value != null;
  }

  public void setDefault_valueIsSet(boolean value) {
    if (!value) {
      this.default_value = null;
    }
  }

  public short  getType_length() {
    return this.type_length;
  }

  public ColumnDef setType_length(short type_length) {
    this.type_length = type_length;
    setType_lengthIsSet(true);
    return this;
  }

  public void unsetType_length() {
    __isset_bit_vector.clear(__TYPE_LENGTH_ISSET_ID);
  }

  // Returns true if field type_length is set (has been assigned a value) and false otherwise
  public boolean isSetType_length() {
    return __isset_bit_vector.get(__TYPE_LENGTH_ISSET_ID);
  }

  public void setType_lengthIsSet(boolean value) {
    __isset_bit_vector.set(__TYPE_LENGTH_ISSET_ID, value);
  }

  public boolean  isNullable() {
    return this.nullable;
  }

  public ColumnDef setNullable(boolean nullable) {
    this.nullable = nullable;
    setNullableIsSet(true);
    return this;
  }

  public void unsetNullable() {
    __isset_bit_vector.clear(__NULLABLE_ISSET_ID);
  }

  // Returns true if field nullable is set (has been assigned a value) and false otherwise
  public boolean isSetNullable() {
    return __isset_bit_vector.get(__NULLABLE_ISSET_ID);
  }

  public void setNullableIsSet(boolean value) {
    __isset_bit_vector.set(__NULLABLE_ISSET_ID, value);
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((byte[])value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((Integer)value);
      }
      break;

    case DEFAULT_VALUE:
      if (value == null) {
        unsetDefault_value();
      } else {
        setDefault_value((com.vesoft.nebula.Value)value);
      }
      break;

    case TYPE_LENGTH:
      if (value == null) {
        unsetType_length();
      } else {
        setType_length((Short)value);
      }
      break;

    case NULLABLE:
      if (value == null) {
        unsetNullable();
      } else {
        setNullable((Boolean)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case NAME:
      return getName();

    case TYPE:
      return getType();

    case DEFAULT_VALUE:
      return getDefault_value();

    case TYPE_LENGTH:
      return new Short(getType_length());

    case NULLABLE:
      return new Boolean(isNullable());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case NAME:
      return isSetName();
    case TYPE:
      return isSetType();
    case DEFAULT_VALUE:
      return isSetDefault_value();
    case TYPE_LENGTH:
      return isSetType_length();
    case NULLABLE:
      return isSetNullable();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ColumnDef)
      return this.equals((ColumnDef)that);
    return false;
  }

  public boolean equals(ColumnDef that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!TBaseHelper.equalsSlow(this.name, that.name))
        return false;
    }

    boolean this_present_type = true;
    boolean that_present_type = true;
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!TBaseHelper.equalsNobinary(this.type, that.type))
        return false;
    }

    boolean this_present_default_value = true && this.isSetDefault_value();
    boolean that_present_default_value = true && that.isSetDefault_value();
    if (this_present_default_value || that_present_default_value) {
      if (!(this_present_default_value && that_present_default_value))
        return false;
      if (!TBaseHelper.equalsNobinary(this.default_value, that.default_value))
        return false;
    }

    boolean this_present_type_length = true && this.isSetType_length();
    boolean that_present_type_length = true && that.isSetType_length();
    if (this_present_type_length || that_present_type_length) {
      if (!(this_present_type_length && that_present_type_length))
        return false;
      if (!TBaseHelper.equalsNobinary(this.type_length, that.type_length))
        return false;
    }

    boolean this_present_nullable = true && this.isSetNullable();
    boolean that_present_nullable = true && that.isSetNullable();
    if (this_present_nullable || that_present_nullable) {
      if (!(this_present_nullable && that_present_nullable))
        return false;
      if (!TBaseHelper.equalsNobinary(this.nullable, that.nullable))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_name = true && (isSetName());
    builder.append(present_name);
    if (present_name)
      builder.append(name);

    boolean present_type = true;
    builder.append(present_type);
    if (present_type)
      builder.append(type);

    boolean present_default_value = true && (isSetDefault_value());
    builder.append(present_default_value);
    if (present_default_value)
      builder.append(default_value);

    boolean present_type_length = true && (isSetType_length());
    builder.append(present_type_length);
    if (present_type_length)
      builder.append(type_length);

    boolean present_nullable = true && (isSetNullable());
    builder.append(present_nullable);
    if (present_nullable)
      builder.append(nullable);

    return builder.toHashCode();
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case NAME:
          if (field.type == TType.STRING) {
            this.name = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TYPE:
          if (field.type == TType.I32) {
            this.type = iprot.readI32();
            setTypeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DEFAULT_VALUE:
          if (field.type == TType.STRUCT) {
            this.default_value = new com.vesoft.nebula.Value();
            this.default_value.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TYPE_LENGTH:
          if (field.type == TType.I16) {
            this.type_length = iprot.readI16();
            setType_lengthIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case NULLABLE:
          if (field.type == TType.BOOL) {
            this.nullable = iprot.readBool();
            setNullableIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    if (!isSetType()) {
      throw new TProtocolException("Required field 'type' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeBinary(this.name);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(TYPE_FIELD_DESC);
    oprot.writeI32(this.type);
    oprot.writeFieldEnd();
    if (this.default_value != null) {
      if (isSetDefault_value()) {
        oprot.writeFieldBegin(DEFAULT_VALUE_FIELD_DESC);
        this.default_value.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    if (isSetType_length()) {
      oprot.writeFieldBegin(TYPE_LENGTH_FIELD_DESC);
      oprot.writeI16(this.type_length);
      oprot.writeFieldEnd();
    }
    if (isSetNullable()) {
      oprot.writeFieldBegin(NULLABLE_FIELD_DESC);
      oprot.writeBool(this.nullable);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("ColumnDef");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("name");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getName() == null) {
      sb.append("null");
    } else {
        int __name_size = Math.min(this. getName().length, 128);
        for (int i = 0; i < __name_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getName()[i]).length() > 1 ? Integer.toHexString(this. getName()[i]).substring(Integer.toHexString(this. getName()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getName()[i]).toUpperCase());
        }
        if (this. getName().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("type");
    sb.append(space);
    sb.append(":").append(space);
    String type_name = PropertyType.VALUES_TO_NAMES.get(this. getType());
    if (type_name != null) {
      sb.append(type_name);
      sb.append(" (");
    }
    sb.append(this. getType());
    if (type_name != null) {
      sb.append(")");
    }
    first = false;
    if (isSetDefault_value())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("default_value");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getDefault_value() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getDefault_value(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetType_length())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("type_length");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getType_length(), indent + 1, prettyPrint));
      first = false;
    }
    if (isSetNullable())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("nullable");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. isNullable(), indent + 1, prettyPrint));
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (name == null) {
      throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'name' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'type' because it's a primitive and you chose the non-beans generator.
    // check that fields of type enum have valid values
    if (isSetType() && !PropertyType.VALID_VALUES.contains(type)){
      throw new TProtocolException("The field 'type' has been assigned the invalid value " + type);
    }
  }

}

