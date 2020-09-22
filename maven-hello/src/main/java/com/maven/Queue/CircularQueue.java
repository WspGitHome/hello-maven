package com.maven.Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Packagename com.maven.Queue
 * @Classname CircularQueue
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/09/17 16:37
 * @Version 1.0
 */
public class CircularQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.offer(3);
        ((LinkedList<Integer>) queue).offerFirst(0);
        Integer peek = queue.peek();
        Integer poll = queue.poll();
        Integer element = queue.element();
        System.out.println(1);
    }
}

