package com.alecgorge.minecraft.jsonapi.packets;

import java.io.IOException;

//#ifdefined mcversion
//$import net.minecraft.server./*$mcversion$*/.Packet;
//$import net.minecraft.server./*$mcversion$*/.PacketDataSerializer;
//$import net.minecraft.server./*$mcversion$*/.PacketListener;
//#else
import net.minecraft.server.v1_7_R1.Packet;
import net.minecraft.server.v1_7_R1.PacketDataSerializer;
import net.minecraft.server.v1_7_R1.PacketListener;
//#endif

public class Packet0x47HttpGetPacket extends Packet {
	@Override
	public void a(PacketDataSerializer ser) throws IOException {
		
	}

	@Override
	public void b(PacketDataSerializer ser) throws IOException {
		
	}

	@Override
	public void handle(PacketListener listener) {
		
	}
}
