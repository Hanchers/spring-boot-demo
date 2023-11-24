CREATE TABLE `city` (
                        `id` int unsigned NOT NULL AUTO_INCREMENT,
                        `name` varchar(255) DEFAULT NULL COMMENT '名字',
                        `state` varchar(255) DEFAULT NULL COMMENT '州-省',
                        `country` varchar(255) DEFAULT NULL COMMENT '国',
                        `extra_json` json DEFAULT NULL COMMENT '补充字段',
                        `extra_json2` varchar(100) DEFAULT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;