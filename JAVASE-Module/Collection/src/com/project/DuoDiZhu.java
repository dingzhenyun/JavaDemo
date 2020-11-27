package com.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author DingZhenYun
 * @create 2019-03-17 11:04
 */
/*
 *  实现模拟斗地主的功能
 *   1. 组合牌
 *   2. 洗牌
 *   3. 发牌
 *   4. 看牌
 */
public class DuoDiZhu {
    public static void main(String[] args) {
        //1. 组合牌
        //创建Map集合,键是编号,值是牌
        HashMap<Integer,String> pooker=new HashMap<>();
        //创建List集合,存储编号
        ArrayList<Integer> pookerNumber=new ArrayList<>();
        //定义出13个点数的数组
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //定义4个花色数组
        String[] colors = {"♠","♥","♣","♦"};
        int index=2;
        for(String number:numbers){
            for(String color:colors){
                pooker.put(index,color+number);
                pookerNumber.add(index);
                index++;
            }
        }
        //存储大王,和小王
        pooker.put(0,"大王");
        pookerNumber.add(0);
        pooker.put(1,"小王");
        pookerNumber.add(1);
        //洗牌,将牌的编号打乱
        Collections.shuffle(pookerNumber);
        Collections.shuffle(pookerNumber);
        //发牌功能,将牌编号,发给玩家集合,底牌集合
        ArrayList<Integer> player1=new ArrayList<>();
        ArrayList<Integer> player2=new ArrayList<>();
        ArrayList<Integer> player3=new ArrayList<>();
        ArrayList<Integer> bottom=new ArrayList<>();
        for(int i=0;i<pookerNumber.size();i++){
            if(i<3){
                //存到底牌去
                bottom.add(pookerNumber.get(i));
            }else if(i%3==0){
                player1.add(pookerNumber.get(i));
            }else if(i%3==1){
                player2.add(pookerNumber.get(i));
            }else{
                player3.add(pookerNumber.get(i));
            }
        }
        //对玩家手中的编号排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        look("a",player1,pooker);
        look("b",player2,pooker);
        look("c",player3,pooker);
        look("d",bottom,pooker);
    }
    public static void look(String name,ArrayList<Integer> player,HashMap<Integer,String> pooker){
        //遍历ArrayList集合,获取元素,作为键,到集合Map中找值
        System.out.print(name+" ");
        for(Integer key:player){
            String value=pooker.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }

}
