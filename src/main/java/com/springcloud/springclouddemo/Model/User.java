package com.springcloud.springclouddemo.Model;

/**
 * created by 魏霖涛 on 2017/11/2 0002
 */
public class User {
        private final long id;
        private final String name;

        public User(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public long getId() {
            return id;
        }

        public String getName() {
            return name;
        }
}
