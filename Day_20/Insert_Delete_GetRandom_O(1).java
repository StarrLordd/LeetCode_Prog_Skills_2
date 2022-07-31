class RandomizedSet {

    List<Integer> set;

public RandomizedSet() {

    set = new ArrayList();
    
}

public boolean insert(int val) {
    if(set.contains(val)){
        return false;
    }else{
        set.add(val);
        return true;
    }
}

public boolean remove(int val) {
   if(set.contains(val)){
       set.remove(set.indexOf(val));
        return true;
    }else{
        return false;
    }
}

public int getRandom() {
    int randomKey = (int)(Math.random()*(set.size()));
    
    return set.get(randomKey);
}
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */