class SeatManager {
    PriorityQueue<Integer> pq;
    int count=1;
    public SeatManager(int n) {
        pq=new PriorityQueue();
    }
    
    public int reserve() {
        if(pq.size()>0 && pq.peek()<count){
            return pq.poll();
        }
        return count++;
    }
    
    public void unreserve(int seatNumber) {
        pq.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */