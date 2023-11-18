// 705 - Design Hash Set

class MyHashSet {
    vector<bool> v;

public:
    MyHashSet() {
        v.resize(1e6 + 1, 0);
    }
    
    void add(int key) {
        v[key] = true;
    }
    
    void remove(int key) {
        v[key] = false;
    }
    
    bool contains(int key) {
        return v[key];
    }
};