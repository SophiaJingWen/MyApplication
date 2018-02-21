package com.example.dell.myapplication;

/**
 * Created by DELL on 2018/2/2.
 */

public class Msg {
        public static final int TYPE_RECEIVED = 0;
        public static final int TYPE_SENT = 1;
        private String content;
        private int type;
        public Msg(String content, int type) {
            this.content = content;
            this.type = type;
        }
        public String getContent() {
            return content;
        }
        public int getType() {
            return type;
        }

}
