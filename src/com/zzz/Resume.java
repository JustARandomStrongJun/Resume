package com.zzz;

public class Resume {
    private String uuid;
    //see you later!
    //private String fullName;

    public Resume(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return uuid;
    }
}
