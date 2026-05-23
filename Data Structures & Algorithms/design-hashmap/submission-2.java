class MyHashMap {

    int primaryBuckets;
    int secondaryBuckets;
    int[][] storage;

    public MyHashMap() {
        this.primaryBuckets = 1000;
        this.secondaryBuckets = 1000;
        this.storage = new int[primaryBuckets][];
    }

    public int getPrimaryHash(int key){
        return key % primaryBuckets;
    }

    public int getSecondaryHash(int key){
        return key / secondaryBuckets;
    }
    
    public void put(int key, int value) {
        int primaryIndex = getPrimaryHash(key);
        int secondaryIndex = getSecondaryHash(key);
        if(this.storage[primaryIndex] == null){
            if(primaryIndex == 0){
                this.storage[primaryIndex] = new int[secondaryBuckets+1];
            }else{
                this.storage[primaryIndex] = new int[secondaryBuckets];
            }
            
            Arrays.fill(storage[primaryIndex], -1);
        }
        this.storage[primaryIndex][secondaryIndex] = value;
    }
    
    public int get(int key) {
        int primaryIndex = getPrimaryHash(key);
        int secondaryIndex = getSecondaryHash(key);
        if(this.storage[primaryIndex] == null || this.storage[primaryIndex][secondaryIndex] == -1){
            return -1;
        }else{
            return this.storage[primaryIndex][secondaryIndex];
        }
    }
    
    public void remove(int key) {
        int primaryIndex = getPrimaryHash(key);
        int secondaryIndex = getSecondaryHash(key);
        if(this.storage[primaryIndex] == null){
            return;
        }else{
            this.storage[primaryIndex][secondaryIndex] = -1;
        }
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */