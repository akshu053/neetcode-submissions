class MyHashSet {

    boolean[][] hashSet;
    int primaryBucket;
    int secondaryBucket;

    public MyHashSet() {
        this.primaryBucket = 1000;
        this.secondaryBucket = 1000;
        hashSet = new boolean[primaryBucket][];
    }

    private int getPrimaryHash(int key){
        return key % primaryBucket;
    }

    private int getSecondaryHash(int key){
        return key / secondaryBucket;
    }
    
    public void add(int key) {
        int primaryIndex = getPrimaryHash(key);
        int secondaryIndex = getSecondaryHash(key);
        if(hashSet[primaryIndex] == null){
            if(primaryIndex == 0){
                hashSet[primaryIndex] = new boolean[secondaryBucket+1];
            }else{
                hashSet[primaryIndex] = new boolean[secondaryBucket];
            }
        }
        
        hashSet[primaryIndex][secondaryIndex] = true;
    }
    
    public void remove(int key) {
        int primaryIndex = getPrimaryHash(key);
        int secondaryIndex = getSecondaryHash(key);
        if(hashSet[primaryIndex] == null){
            return;
        }
        hashSet[primaryIndex][secondaryIndex] = false;
    }
    
    public boolean contains(int key) {
        int primaryIndex = getPrimaryHash(key);
        int secondaryIndex = getSecondaryHash(key);
        if(hashSet[primaryIndex] == null){
            return false;
        }
        return hashSet[primaryIndex][secondaryIndex];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */