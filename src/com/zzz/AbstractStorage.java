package com.zzz;

public interface AbstractStorage {
    void save(Resume r);
    void delete(String uuid);
    void update(Resume r);
    Resume get(String uuid);
    Resume[] getAll();
    int size();
    void clear();
}
