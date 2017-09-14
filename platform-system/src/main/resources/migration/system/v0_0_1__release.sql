CREATE TABLE `system_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usercode` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '0正常 1冻结 2关闭',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;