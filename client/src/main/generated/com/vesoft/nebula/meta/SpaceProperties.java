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
public class SpaceProperties implements TBase, java.io.Serializable, Cloneable, Comparable<SpaceProperties> {
  private static final TStruct STRUCT_DESC = new TStruct("SpaceProperties");
  private static final TField SPACE_NAME_FIELD_DESC = new TField("space_name", TType.STRING, (short)1);
  private static final TField PARTITION_NUM_FIELD_DESC = new TField("partition_num", TType.I32, (short)2);
  private static final TField REPLICA_FACTOR_FIELD_DESC = new TField("replica_factor", TType.I32, (short)3);
  private static final TField VID_SIZE_FIELD_DESC = new TField("vid_size", TType.I32, (short)4);
  private static final TField CHARSET_NAME_FIELD_DESC = new TField("charset_name", TType.STRING, (short)5);
  private static final TField COLLATE_NAME_FIELD_DESC = new TField("collate_name", TType.STRING, (short)6);

  public byte[] space_name;
  public int partition_num;
  public int replica_factor;
  public int vid_size;
  public byte[] charset_name;
  public byte[] collate_name;
  public static final int SPACE_NAME = 1;
  public static final int PARTITION_NUM = 2;
  public static final int REPLICA_FACTOR = 3;
  public static final int VID_SIZE = 4;
  public static final int CHARSET_NAME = 5;
  public static final int COLLATE_NAME = 6;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __PARTITION_NUM_ISSET_ID = 0;
  private static final int __REPLICA_FACTOR_ISSET_ID = 1;
  private static final int __VID_SIZE_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE_NAME, new FieldMetaData("space_name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(PARTITION_NUM, new FieldMetaData("partition_num", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(REPLICA_FACTOR, new FieldMetaData("replica_factor", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(VID_SIZE, new FieldMetaData("vid_size", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(CHARSET_NAME, new FieldMetaData("charset_name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(COLLATE_NAME, new FieldMetaData("collate_name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(SpaceProperties.class, metaDataMap);
  }

  public SpaceProperties() {
    this.vid_size = 8;

  }

  public SpaceProperties(
    byte[] space_name,
    int partition_num,
    int replica_factor,
    int vid_size,
    byte[] charset_name,
    byte[] collate_name)
  {
    this();
    this.space_name = space_name;
    this.partition_num = partition_num;
    setPartition_numIsSet(true);
    this.replica_factor = replica_factor;
    setReplica_factorIsSet(true);
    this.vid_size = vid_size;
    setVid_sizeIsSet(true);
    this.charset_name = charset_name;
    this.collate_name = collate_name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SpaceProperties(SpaceProperties other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetSpace_name()) {
      this.space_name = TBaseHelper.deepCopy(other.space_name);
    }
    this.partition_num = TBaseHelper.deepCopy(other.partition_num);
    this.replica_factor = TBaseHelper.deepCopy(other.replica_factor);
    this.vid_size = TBaseHelper.deepCopy(other.vid_size);
    if (other.isSetCharset_name()) {
      this.charset_name = TBaseHelper.deepCopy(other.charset_name);
    }
    if (other.isSetCollate_name()) {
      this.collate_name = TBaseHelper.deepCopy(other.collate_name);
    }
  }

  public SpaceProperties deepCopy() {
    return new SpaceProperties(this);
  }

  @Deprecated
  public SpaceProperties clone() {
    return new SpaceProperties(this);
  }

  public byte[]  getSpace_name() {
    return this.space_name;
  }

  public SpaceProperties setSpace_name(byte[] space_name) {
    this.space_name = space_name;
    return this;
  }

  public void unsetSpace_name() {
    this.space_name = null;
  }

  // Returns true if field space_name is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_name() {
    return this.space_name != null;
  }

  public void setSpace_nameIsSet(boolean value) {
    if (!value) {
      this.space_name = null;
    }
  }

  public int  getPartition_num() {
    return this.partition_num;
  }

  public SpaceProperties setPartition_num(int partition_num) {
    this.partition_num = partition_num;
    setPartition_numIsSet(true);
    return this;
  }

  public void unsetPartition_num() {
    __isset_bit_vector.clear(__PARTITION_NUM_ISSET_ID);
  }

  // Returns true if field partition_num is set (has been assigned a value) and false otherwise
  public boolean isSetPartition_num() {
    return __isset_bit_vector.get(__PARTITION_NUM_ISSET_ID);
  }

  public void setPartition_numIsSet(boolean value) {
    __isset_bit_vector.set(__PARTITION_NUM_ISSET_ID, value);
  }

  public int  getReplica_factor() {
    return this.replica_factor;
  }

  public SpaceProperties setReplica_factor(int replica_factor) {
    this.replica_factor = replica_factor;
    setReplica_factorIsSet(true);
    return this;
  }

  public void unsetReplica_factor() {
    __isset_bit_vector.clear(__REPLICA_FACTOR_ISSET_ID);
  }

  // Returns true if field replica_factor is set (has been assigned a value) and false otherwise
  public boolean isSetReplica_factor() {
    return __isset_bit_vector.get(__REPLICA_FACTOR_ISSET_ID);
  }

  public void setReplica_factorIsSet(boolean value) {
    __isset_bit_vector.set(__REPLICA_FACTOR_ISSET_ID, value);
  }

  public int  getVid_size() {
    return this.vid_size;
  }

  public SpaceProperties setVid_size(int vid_size) {
    this.vid_size = vid_size;
    setVid_sizeIsSet(true);
    return this;
  }

  public void unsetVid_size() {
    __isset_bit_vector.clear(__VID_SIZE_ISSET_ID);
  }

  // Returns true if field vid_size is set (has been assigned a value) and false otherwise
  public boolean isSetVid_size() {
    return __isset_bit_vector.get(__VID_SIZE_ISSET_ID);
  }

  public void setVid_sizeIsSet(boolean value) {
    __isset_bit_vector.set(__VID_SIZE_ISSET_ID, value);
  }

  public byte[]  getCharset_name() {
    return this.charset_name;
  }

  public SpaceProperties setCharset_name(byte[] charset_name) {
    this.charset_name = charset_name;
    return this;
  }

  public void unsetCharset_name() {
    this.charset_name = null;
  }

  // Returns true if field charset_name is set (has been assigned a value) and false otherwise
  public boolean isSetCharset_name() {
    return this.charset_name != null;
  }

  public void setCharset_nameIsSet(boolean value) {
    if (!value) {
      this.charset_name = null;
    }
  }

  public byte[]  getCollate_name() {
    return this.collate_name;
  }

  public SpaceProperties setCollate_name(byte[] collate_name) {
    this.collate_name = collate_name;
    return this;
  }

  public void unsetCollate_name() {
    this.collate_name = null;
  }

  // Returns true if field collate_name is set (has been assigned a value) and false otherwise
  public boolean isSetCollate_name() {
    return this.collate_name != null;
  }

  public void setCollate_nameIsSet(boolean value) {
    if (!value) {
      this.collate_name = null;
    }
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case SPACE_NAME:
      if (value == null) {
        unsetSpace_name();
      } else {
        setSpace_name((byte[])value);
      }
      break;

    case PARTITION_NUM:
      if (value == null) {
        unsetPartition_num();
      } else {
        setPartition_num((Integer)value);
      }
      break;

    case REPLICA_FACTOR:
      if (value == null) {
        unsetReplica_factor();
      } else {
        setReplica_factor((Integer)value);
      }
      break;

    case VID_SIZE:
      if (value == null) {
        unsetVid_size();
      } else {
        setVid_size((Integer)value);
      }
      break;

    case CHARSET_NAME:
      if (value == null) {
        unsetCharset_name();
      } else {
        setCharset_name((byte[])value);
      }
      break;

    case COLLATE_NAME:
      if (value == null) {
        unsetCollate_name();
      } else {
        setCollate_name((byte[])value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SPACE_NAME:
      return getSpace_name();

    case PARTITION_NUM:
      return new Integer(getPartition_num());

    case REPLICA_FACTOR:
      return new Integer(getReplica_factor());

    case VID_SIZE:
      return new Integer(getVid_size());

    case CHARSET_NAME:
      return getCharset_name();

    case COLLATE_NAME:
      return getCollate_name();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case SPACE_NAME:
      return isSetSpace_name();
    case PARTITION_NUM:
      return isSetPartition_num();
    case REPLICA_FACTOR:
      return isSetReplica_factor();
    case VID_SIZE:
      return isSetVid_size();
    case CHARSET_NAME:
      return isSetCharset_name();
    case COLLATE_NAME:
      return isSetCollate_name();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SpaceProperties)
      return this.equals((SpaceProperties)that);
    return false;
  }

  public boolean equals(SpaceProperties that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_space_name = true && this.isSetSpace_name();
    boolean that_present_space_name = true && that.isSetSpace_name();
    if (this_present_space_name || that_present_space_name) {
      if (!(this_present_space_name && that_present_space_name))
        return false;
      if (!TBaseHelper.equalsSlow(this.space_name, that.space_name))
        return false;
    }

    boolean this_present_partition_num = true;
    boolean that_present_partition_num = true;
    if (this_present_partition_num || that_present_partition_num) {
      if (!(this_present_partition_num && that_present_partition_num))
        return false;
      if (!TBaseHelper.equalsNobinary(this.partition_num, that.partition_num))
        return false;
    }

    boolean this_present_replica_factor = true;
    boolean that_present_replica_factor = true;
    if (this_present_replica_factor || that_present_replica_factor) {
      if (!(this_present_replica_factor && that_present_replica_factor))
        return false;
      if (!TBaseHelper.equalsNobinary(this.replica_factor, that.replica_factor))
        return false;
    }

    boolean this_present_vid_size = true;
    boolean that_present_vid_size = true;
    if (this_present_vid_size || that_present_vid_size) {
      if (!(this_present_vid_size && that_present_vid_size))
        return false;
      if (!TBaseHelper.equalsNobinary(this.vid_size, that.vid_size))
        return false;
    }

    boolean this_present_charset_name = true && this.isSetCharset_name();
    boolean that_present_charset_name = true && that.isSetCharset_name();
    if (this_present_charset_name || that_present_charset_name) {
      if (!(this_present_charset_name && that_present_charset_name))
        return false;
      if (!TBaseHelper.equalsSlow(this.charset_name, that.charset_name))
        return false;
    }

    boolean this_present_collate_name = true && this.isSetCollate_name();
    boolean that_present_collate_name = true && that.isSetCollate_name();
    if (this_present_collate_name || that_present_collate_name) {
      if (!(this_present_collate_name && that_present_collate_name))
        return false;
      if (!TBaseHelper.equalsSlow(this.collate_name, that.collate_name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_space_name = true && (isSetSpace_name());
    builder.append(present_space_name);
    if (present_space_name)
      builder.append(space_name);

    boolean present_partition_num = true;
    builder.append(present_partition_num);
    if (present_partition_num)
      builder.append(partition_num);

    boolean present_replica_factor = true;
    builder.append(present_replica_factor);
    if (present_replica_factor)
      builder.append(replica_factor);

    boolean present_vid_size = true;
    builder.append(present_vid_size);
    if (present_vid_size)
      builder.append(vid_size);

    boolean present_charset_name = true && (isSetCharset_name());
    builder.append(present_charset_name);
    if (present_charset_name)
      builder.append(charset_name);

    boolean present_collate_name = true && (isSetCollate_name());
    builder.append(present_collate_name);
    if (present_collate_name)
      builder.append(collate_name);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(SpaceProperties other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSpace_name()).compareTo(other.isSetSpace_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(space_name, other.space_name);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetPartition_num()).compareTo(other.isSetPartition_num());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(partition_num, other.partition_num);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetReplica_factor()).compareTo(other.isSetReplica_factor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(replica_factor, other.replica_factor);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetVid_size()).compareTo(other.isSetVid_size());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(vid_size, other.vid_size);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetCharset_name()).compareTo(other.isSetCharset_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(charset_name, other.charset_name);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetCollate_name()).compareTo(other.isSetCollate_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(collate_name, other.collate_name);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
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
        case SPACE_NAME:
          if (field.type == TType.STRING) {
            this.space_name = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PARTITION_NUM:
          if (field.type == TType.I32) {
            this.partition_num = iprot.readI32();
            setPartition_numIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case REPLICA_FACTOR:
          if (field.type == TType.I32) {
            this.replica_factor = iprot.readI32();
            setReplica_factorIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case VID_SIZE:
          if (field.type == TType.I32) {
            this.vid_size = iprot.readI32();
            setVid_sizeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CHARSET_NAME:
          if (field.type == TType.STRING) {
            this.charset_name = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case COLLATE_NAME:
          if (field.type == TType.STRING) {
            this.collate_name = iprot.readBinary();
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
    if (this.space_name != null) {
      oprot.writeFieldBegin(SPACE_NAME_FIELD_DESC);
      oprot.writeBinary(this.space_name);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(PARTITION_NUM_FIELD_DESC);
    oprot.writeI32(this.partition_num);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(REPLICA_FACTOR_FIELD_DESC);
    oprot.writeI32(this.replica_factor);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(VID_SIZE_FIELD_DESC);
    oprot.writeI32(this.vid_size);
    oprot.writeFieldEnd();
    if (this.charset_name != null) {
      oprot.writeFieldBegin(CHARSET_NAME_FIELD_DESC);
      oprot.writeBinary(this.charset_name);
      oprot.writeFieldEnd();
    }
    if (this.collate_name != null) {
      oprot.writeFieldBegin(COLLATE_NAME_FIELD_DESC);
      oprot.writeBinary(this.collate_name);
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
    StringBuilder sb = new StringBuilder("SpaceProperties");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("space_name");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getSpace_name() == null) {
      sb.append("null");
    } else {
        int __space_name_size = Math.min(this. getSpace_name().length, 128);
        for (int i = 0; i < __space_name_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getSpace_name()[i]).length() > 1 ? Integer.toHexString(this. getSpace_name()[i]).substring(Integer.toHexString(this. getSpace_name()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getSpace_name()[i]).toUpperCase());
        }
        if (this. getSpace_name().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("partition_num");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getPartition_num(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("replica_factor");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getReplica_factor(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("vid_size");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getVid_size(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("charset_name");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getCharset_name() == null) {
      sb.append("null");
    } else {
        int __charset_name_size = Math.min(this. getCharset_name().length, 128);
        for (int i = 0; i < __charset_name_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getCharset_name()[i]).length() > 1 ? Integer.toHexString(this. getCharset_name()[i]).substring(Integer.toHexString(this. getCharset_name()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getCharset_name()[i]).toUpperCase());
        }
        if (this. getCharset_name().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("collate_name");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getCollate_name() == null) {
      sb.append("null");
    } else {
        int __collate_name_size = Math.min(this. getCollate_name().length, 128);
        for (int i = 0; i < __collate_name_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getCollate_name()[i]).length() > 1 ? Integer.toHexString(this. getCollate_name()[i]).substring(Integer.toHexString(this. getCollate_name()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getCollate_name()[i]).toUpperCase());
        }
        if (this. getCollate_name().length > 128) sb.append(" ...");
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

