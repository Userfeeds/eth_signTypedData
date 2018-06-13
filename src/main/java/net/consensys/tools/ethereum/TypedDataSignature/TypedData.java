package net.consensys.tools.ethereum.TypedDataSignature;

public class TypedData {
    public String name;
    public String type;
    public Object value;

    public TypedData() {
    }

    public TypedData(String name, String type, Object value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }
}

