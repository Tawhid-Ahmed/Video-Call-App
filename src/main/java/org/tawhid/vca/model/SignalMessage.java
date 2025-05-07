package org.tawhid.vca.model;

import lombok.Data;

@Data
public class SignalMessage {
private SignalType type;
private String from;
private String to;
private Object data;
private String roomId;
}
