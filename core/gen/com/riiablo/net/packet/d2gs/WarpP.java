// automatically generated by the FlatBuffers compiler, do not modify

package com.riiablo.net.packet.d2gs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class WarpP extends Table {
  public static WarpP getRootAsWarpP(ByteBuffer _bb) { return getRootAsWarpP(_bb, new WarpP()); }
  public static WarpP getRootAsWarpP(ByteBuffer _bb, WarpP obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public WarpP __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int index() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createWarpP(FlatBufferBuilder builder,
      int index) {
    builder.startObject(1);
    WarpP.addIndex(builder, index);
    return WarpP.endWarpP(builder);
  }

  public static void startWarpP(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addIndex(FlatBufferBuilder builder, int index) { builder.addInt(0, index, 0); }
  public static int endWarpP(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

