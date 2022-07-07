package com.maven.arithmetic.lecode;

import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

/**
 * @Packagename com.maven.arithmetic.lecode
 * @Classname SimpleArithmetic
 * @Description
 * @Authors Mr.Wu
 * @Date 2022/04/06 17:43
 * @Version 1.0
 */
public class SimpleArithmetic {

/*    public static void main(String[] args) {
//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
//输入: s = "abcabcbb"
//输出: 3
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
//示例 2:
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
//示例 3:
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
        String str = "jfjfhuuwiafkk";
        int unRepetionString = getUnRepetionString(str);
        System.out.println(1);
    }*/

    private static int getUnRepetionString(String s) {
        List<String> chars = new ArrayList<>();
        String resultStr = "";
        for (int i = 0, j = 0; i < s.length(); i++) {
            String string = Character.toString(s.charAt(i));
            if (chars.contains(string)) {
                i = ++j;
                String join = String.join("", chars);
                if (join.length() > resultStr.length()) {
                    resultStr = join;
                }
                chars.clear();
            }
            chars.add(Character.toString(s.charAt(i)));
        }
        if (resultStr.length() < String.join("", chars).length())
            return String.join("", chars).length();
        return resultStr.length();
    }

    //删除指定位置的链表
    private static ListNode deleteAssignLinked(ListNode head, int n) {
        int i = 1;
        ListNode nodeList = head;
        while (nodeList.next != null) {
            i++;
            nodeList = nodeList.next;
        }
        int toDeleteI = i - n + 1;
        int y = 1;
        for (ListNode node = head; node != null; node = node.next) {
            if (toDeleteI == 1) {
                head = head.next;
                break;
            }
            if (y == toDeleteI - 1) {
                node.next = node.next.next;
                break;
            }
            y++;
        }
        return head;
    }

    //找到中间位置的节点
    private static void findLinkedHalf(ListNode listNode1) {
        int i = 0;
        for (ListNode node = listNode1; node != null; node = node.next) {
            i++;
        }
        int i1 = i / 2 + 1;
        ListNode result = null;
        i = 1;
        for (ListNode node = listNode1; node != null; node = node.next) {
            if (i++ == i1) {
                result = node;
            }
        }
        System.out.println(JSONUtil.toJsonStr(result));
    }

    static class ListNode {
        Integer value;
        ListNode next;

        ListNode(Integer o) {
            this.value = o;
        }

        public String toString() {
            return value.toString();
        }
    }

    //inverse chart
    private static char[] inverseChart(char[] chars) {
        for (int i = 0, j = chars.length - 1; i <= j; ++i, --j) {
            char s = chars[i];
            chars[i] = chars[j];
            chars[j] = s;
        }
        return chars;
    }

    //二合一 二分
    private static int[] twoSum(int[] nums, int target) {
        for (int q = 0; q < nums.length; q++) {
            int i = q + 1, j = nums.length - 1;
            while (i <= j) {
                int mid = (i + (j - i) / 2);
                if (nums[q] + nums[mid] == target) {
                    return new int[]{q + 1, mid + 1};
                } else if (nums[q] + nums[mid] > target) {
                    j = mid - 1;
                } else if (nums[q] + nums[mid] < target) {
                    i = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
    }


    //double point 二合1下标数组
    private static int[] twoSumDoublePoint(int[] nums, int target) {
        for (int i = 0, j = nums.length - 1; i < j; ) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else if (nums[i] + nums[j] == target) {
                return new int[]{i + 1, j + 1};
            }
        }
        return new int[]{-1, -1};
    }

    //暴力二合1下标数组
    private static int[] violenceTwoSum(int[] nums, int sum) {
        int result[] = new int[2];
        boolean isBreak = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] + nums[j] == sum && i != j) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    isBreak = true;
                    break;
                }
            }
            if (isBreak)
                break;
        }
        return result;
    }

    //zero after -m双指针（还有一种单次循环忽略0 最终赋值方法）
    private static int[] zeroAfterDoublePointer(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
        return nums;
    }

    //zero after
    private static int[] zeroAfter(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            boolean isBreak = false;
            for (int j = 1; j <= nums.length - 1 - i; j++) {
                if (nums[j - 1] == 0) {
                    int tmp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = tmp;
                    isBreak = true;
                }
            }
            if (!isBreak) {
                break;
            }
        }
        return nums;
    }

    //冒泡
    private static int[] orderArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j <= nums.length - 1 - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        return nums;
    }

    //负数乘积顺序排序
    private static int[] doublePointer(int[] nums) {
        int n = nums.length;
        int posArray[] = new int[n];

        for (int i = 0, j = n - 1, pos = n - 1; i <= j; ) {
            if (nums[j] > nums[i]) {
                posArray[pos] = nums[j];
                --j;
            } else {
                posArray[pos] = nums[i];
                ++i;
            }
            --pos;
        }
        return posArray;
    }

    //轮转数组 -m额外空间复杂度
    private static int[] rotateArray(int[] nums, int k) {
        //size = 8 , displacement = 6;
        int size = nums.length;
        int displacement = k;
        int result = displacement % size;
        int posArray[] = new int[nums.length];
        for (int i = 0, index = 0, j = size - result; index < size; ) {
            if (j <= size - 1) {
                posArray[index] = nums[j];
                j++;
            } else {
                posArray[index] = nums[i];
                i++;
            }
            index++;
        }
        nums = posArray;
        return nums;
    }

    //轮转数组 -m数组反转
    private static int[] rotateArrayReverse(int[] nums, int k) {
        k = k % nums.length;
        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, nums.length - 1);
        return nums;
    }

    //数组反转
    private static int[] reverseArray(int[] nums, int start, int end) {
        while (start <= end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
        return nums;
    }


    public static void main(String[] args) {
        String jsonStr = "[{\"a\":\"1\",\"b\":\"2\",\"c\":\"3\"},{\"a\":\"4\",\"b\":\"5\",\"c\":\"6\"}]";
        JSONArray object = JSONUtil.parseArray(jsonStr);
        List<Object> objectList = new ArrayList<>();
        object.stream().forEach(e -> {
            JSONObject e1 = (JSONObject) e;
            Set<String> stringSet = e1.keySet();
            List<String> keyList = new ArrayList<>();
            keyList.addAll(stringSet);
            for (int i = 0; i < keyList.size(); i++) {
                String s = keyList.get(i);
                Object value = e1.get(s);
                Map<String, Object> hMap = new HashMap<>();
                //select count(0) as a from tableA where 1=1
                hMap.put("name", s);// 原始字段 count(0)
                hMap.put("oldName", s);//别名 a
                hMap.put("clName", s);// 名称 总数
                hMap.put("value", value);//具体值
                objectList.add(hMap);
            }
        });

        System.out.println(System.currentTimeMillis());
    }
}
