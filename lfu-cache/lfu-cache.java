    updateNode(curNode);
    return curNode.val;
}
​
/**
 * add new node into LFU cache, as well as double linked list
 * condition 1: if LFU cache has input key, update node value and node position in list
 * condition 2: if LFU cache does NOT have input key
 *  - sub condition 1: if LFU cache does NOT have enough space, remove the Least Recent Used node
 *  in minimum frequency list, then add new node
 *  - sub condition 2: if LFU cache has enough space, add new node directly
 * **/
public void put(int key, int value) {
    // corner case: check cache capacity initialization
    if (capacity == 0) {
        return;
    }
​
    if (cache.containsKey(key)) {
        DLLNode curNode = cache.get(key);
        curNode.val = value;
        updateNode(curNode);
    }
    else {
        curSize++;
        if (curSize > capacity) {
            // get minimum frequency list
            DoubleLinkedList minFreqList = frequencyMap.get(minFrequency);
            DLLNode deleteNode = minFreqList.removeTail();
            cache.remove(deleteNode.key);
            curSize--;
        }
        // reset min frequency to 1 because of adding new node
        minFrequency = 1;
        DLLNode newNode = new DLLNode(key, value);
​
        // get the list with frequency 1, and then add new node into the list, as well as into LFU cache
        DoubleLinkedList curList = frequencyMap.getOrDefault(1, new DoubleLinkedList());
        curList.addNode(newNode);
        frequencyMap.put(1, curList);
        cache.put(key, newNode);
    }
}
​
public void updateNode(DLLNode curNode) {
    int curFreq = curNode.frequency;
    DoubleLinkedList curList = frequencyMap.get(curFreq);
    curList.removeNode(curNode);
​
    // if current list the the last list which has lowest frequency and current node is the only node in that list
    // we need to remove the entire list and then increase min frequency value by 1
    if (curFreq == minFrequency && curList.listSize == 0) {
        minFrequency++;
    }
​
    curNode.frequency++;
    // add current node to another list has current frequency + 1,
    // if we do not have the list with this frequency, initialize it
    DoubleLinkedList newList = frequencyMap.getOrDefault(curNode.frequency, new DoubleLinkedList());
    newList.addNode(curNode);
    frequencyMap.put(curNode.frequency, newList);
}
}
​
/*
* @param key: node key
* @param val: node value
* @param frequency: frequency count of current node
