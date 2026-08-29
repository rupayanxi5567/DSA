class RandomizedSet {

    Map<Integer, Integer> h; 
    List<Integer> a;
    Random r;
    public RandomizedSet() {
        h = new HashMap<>();
        a = new ArrayList<>();
        r = new Random();
    }
    
    public boolean insert(int x) {
        if(h.containsKey(x)){
            return false;
        }    
        a.add(x);
        h.put(x,a.size()-1);
        return true;
    }
    
    public boolean remove(int x) {
        if(!h.containsKey(x)){
            return false;
        }   
        int f=a.get(h.get(x));
        int s=a.get(a.size()-1);
        a.set(h.get(x),s);
        a.remove(a.size()-1);
        h.put(s,h.get(x));
        h.remove(x);
        return true;
    }
    
    public int getRandom() {
        int randomIndex=r.nextInt(a.size());
        return a.get(randomIndex);   
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */