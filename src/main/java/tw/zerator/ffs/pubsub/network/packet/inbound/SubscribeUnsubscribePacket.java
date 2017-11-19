package tw.zerator.ffs.pubsub.network.packet.inbound;

import tw.zerator.ffs.pubsub.network.packet.Packet;

public class SubscribeUnsubscribePacket extends Packet {
	public String nonce;
	public String[] topics;
	public String auth_token;
}
