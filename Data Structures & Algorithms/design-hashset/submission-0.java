class MyHashSet {

    int primaryBuckets;
    int secondaryBuckets;
    boolean storage[][];

    public MyHashSet() {
        this.primaryBuckets = 1000;
        this.secondaryBuckets = 1000;
        this.storage = new boolean[primaryBuckets][]; //null values are assigned to no of primaryBuckets
    }

    private int getPrimaryHash(int key){
        return key % primaryBuckets;
    }

    private int getSecondaryHash(int key){
        return key / secondaryBuckets;
    }
    
    public void add(int key) {
        int primaryIndex = getPrimaryHash(key);
        int secondaryIndex = getSecondaryHash(key);

        if(this.storage[primaryIndex] == null){
            if(primaryIndex == 0){
                this.storage[primaryIndex] = new boolean[secondaryBuckets + 1]; // false value are assigned at primaryIndex
            }else{
                this.storage[primaryIndex] = new boolean[secondaryBuckets];
            }
        }
        this.storage[primaryIndex][secondaryIndex] = true; 
    }
    
    public void remove(int key) {
        int primaryIndex = getPrimaryHash(key);
        int secondaryIndex = getSecondaryHash(key);

        if(this.storage[primaryIndex] == null){
            return;
        }
        this.storage[primaryIndex][secondaryIndex] = false;
    }
    
    public boolean contains(int key) {
        int primaryIndex = getPrimaryHash(key);
        int secondaryIndex = getSecondaryHash(key);

        if(this.storage[primaryIndex] == null){
            return false;
        }
        return this.storage[primaryIndex][secondaryIndex];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */