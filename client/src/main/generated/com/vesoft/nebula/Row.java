/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula;

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
public class Row implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Row");
  private static final TField VALUES_FIELD_DESC = new TField("values", TType.LIST, (short)1);

  public List<Value> values;
  public static final int VALUES = 1;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(VALUES, new FieldMetaData("values", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, Value.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(Row.class, metaDataMap);
  }

  public Row() {
  }

  public Row(
    List<Value> values)
  {
    this();
    this.values = values;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Row(Row other) {
    if (other.isSetValues()) {
      this.values = TBaseHelper.deepCopy(other.values);
    }
  }

  public Row deepCopy() {
    return new Row(this);
  }

  @Deprecated
  public Row clone() {
    return new Row(this);
  }

  public List<Value>  getValues() {
    return this.values;
  }

  public Row setValues(List<Value> values) {
    this.values = values;
    return this;
  }

  public void unsetValues() {
    this.values = null;
  }

  // Returns true if field values is set (has been assigned a value) and false otherwise
  public boolean isSetValues() {
    return this.values != null;
  }

  public void setValuesIsSet(boolean value) {
    if (!value) {
      this.values = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case VALUES:
      if (value == null) {
        unsetValues();
      } else {
        setValues((List<Value>)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case VALUES:
      return getValues();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case VALUES:
      return isSetValues();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Row)
      return this.equals((Row)that);
    return false;
  }

  public boolean equals(Row that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_values = true && this.isSetValues();
    boolean that_present_values = true && that.isSetValues();
    if (this_present_values || that_present_values) {
      if (!(this_present_values && that_present_values))
        return false;
      if (!TBaseHelper.equalsNobinary(this.values, that.values))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_values = true && (isSetValues());
    builder.append(present_values);
    if (present_values)
      builder.append(values);

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
        case VALUES:
          if (field.type == TType.LIST) {
            {
              TList _list13 = iprot.readListBegin();
              this.values = new ArrayList<Value>(Math.max(0, _list13.size));
              for (int _i14 = 0; 
                   (_list13.size < 0) ? iprot.peekList() : (_i14 < _list13.size); 
                   ++_i14)
              {
                Value _elem15;
                _elem15 = new Value();
                _elem15.read(iprot);
                this.values.add(_elem15);
              }
              iprot.readListEnd();
            }
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
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.values != null) {
      oprot.writeFieldBegin(VALUES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.values.size()));
        for (Value _iter16 : this.values)        {
          _iter16.write(oprot);
        }
        oprot.writeListEnd();
      }
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
    StringBuilder sb = new StringBuilder("Row");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("values");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getValues() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getValues(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

