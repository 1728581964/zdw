/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : student_mis

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 15/06/2021 00:27:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `real_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `level` tinyint(4) NOT NULL DEFAULT 0,
  `school` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0',
  `phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `sex` tinyint(4) NOT NULL DEFAULT 0,
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, '1403795908', 'sunyali990216', '孙雅丽', 0, '湖北工程学院', '1403795908@qq.com', '17371510355', 1, '2020-03-28 15:06:24');

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '编号',
  `name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程名',
  `credits` decimal(4, 1) NOT NULL DEFAULT 2.0 COMMENT '学分',
  `score` int(11) NOT NULL DEFAULT 100 COMMENT '满分',
  `number` int(4) NOT NULL DEFAULT 32 COMMENT '课时',
  `year` int(6) NOT NULL DEFAULT 2016 COMMENT '届时',
  `term` tinyint(4) NOT NULL DEFAULT 0 COMMENT '学期',
  `type` tinyint(4) NOT NULL DEFAULT 1 COMMENT '类别 1必修 2选修',
  `profession` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '专业',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('2018014121003', '软件工程', 4.0, 100, 32, 2022, 2, 1, '计算机科学与技术', '2021-06-14 00:34:33');
INSERT INTO `course` VALUES ('2018014221003', '计算机专业英语', 4.0, 100, 32, 2022, 2, 1, '计算机科学与技术', '2021-06-14 00:28:55');
INSERT INTO `course` VALUES ('2021011001', 'Android项目开发', 4.0, 100, 48, 2022, 2, 1, '计算机科学与技术', '2021-06-14 00:31:49');
INSERT INTO `course` VALUES ('20210131001', 'ASP.NET程序设计', 4.0, 100, 64, 2022, 2, 1, '计算机科学与技术', '2021-06-13 05:03:06');
INSERT INTO `course` VALUES ('2021013121003', '网络工程综合设计', 4.0, 100, 32, 2022, 2, 1, '计算机科学与技术', '2021-06-13 05:03:48');
INSERT INTO `course` VALUES ('202101321002', 'J2EE框架程序设计', 4.0, 100, 96, 2022, 2, 1, '计算机科学与技术', '2021-06-13 05:03:29');

-- ----------------------------
-- Table structure for course_info
-- ----------------------------
DROP TABLE IF EXISTS `course_info`;
CREATE TABLE `course_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `start` int(11) NOT NULL,
  `end` int(11) NOT NULL,
  `room` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `profession` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 39 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course_info
-- ----------------------------
INSERT INTO `course_info` VALUES (32, '20210131001', 1, 25, NULL, '计算机科学与技术');
INSERT INTO `course_info` VALUES (33, '202101321002', 1, 25, NULL, '计算机科学与技术');
INSERT INTO `course_info` VALUES (34, '2021013121003', 1, 25, NULL, '计算机科学与技术');
INSERT INTO `course_info` VALUES (35, '2018014221003', 1, 25, NULL, '计算机科学与技术');
INSERT INTO `course_info` VALUES (36, '2021011001', 1, 25, NULL, '计算机科学与技术');
INSERT INTO `course_info` VALUES (37, '2018014121003', 1, 25, NULL, '计算机科学与技术');

-- ----------------------------
-- Table structure for profession
-- ----------------------------
DROP TABLE IF EXISTS `profession`;
CREATE TABLE `profession`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of profession
-- ----------------------------
INSERT INTO `profession` VALUES (1, '电子信息工程');
INSERT INTO `profession` VALUES (2, '物联网');
INSERT INTO `profession` VALUES (3, '计算机');
INSERT INTO `profession` VALUES (4, '通信工程');
INSERT INTO `profession` VALUES (5, '土木工程');
INSERT INTO `profession` VALUES (6, '网络工程');
INSERT INTO `profession` VALUES (7, '工程造价');
INSERT INTO `profession` VALUES (8, '会计');
INSERT INTO `profession` VALUES (9, '环境工程');
INSERT INTO `profession` VALUES (12, '测试工程');
INSERT INTO `profession` VALUES (13, '软件工程');
INSERT INTO `profession` VALUES (14, '计算机科学与技术');

-- ----------------------------
-- Table structure for silent
-- ----------------------------
DROP TABLE IF EXISTS `silent`;
CREATE TABLE `silent`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `state` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `real_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `level` tinyint(4) NOT NULL DEFAULT 2,
  `school` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `admission_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0',
  `profession` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `grade` int(11) NOT NULL,
  `phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `sex` tinyint(4) NOT NULL DEFAULT 0,
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('518300214301', '518300214301', '123456', '陈德旺', 2, '湖北工程学院新技术学院', '2018', '1@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-13 23:52:16');
INSERT INTO `student` VALUES ('518300214302', '518300214302', '123456', '陈丰', 2, '湖北工程学院新技术学院', '2018', '2@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-13 23:53:18');
INSERT INTO `student` VALUES ('518300214303', '518300214303', '123456', '陈果', 2, '湖北工程学院新技术学院', '2018', '3@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-13 23:54:05');
INSERT INTO `student` VALUES ('518300214304', '518300214304', '123456', '丁新宇', 2, '湖北工程学院新技术学院', '2018', '4@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-13 23:54:47');
INSERT INTO `student` VALUES ('518300214305', '518300214305', '123456', '董庭华', 2, '湖北工程学院新技术学院', '2018', '5@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-13 23:56:23');
INSERT INTO `student` VALUES ('518300214306', '518300214306', '123456', '黄进', 2, '湖北工程学院新技术学院', '2018', '6@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-13 23:57:10');
INSERT INTO `student` VALUES ('518300214307', '518300214307', '123456', '蒋隆基', 2, '湖北工程学院新技术学院', '2018', '7@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-13 23:58:09');
INSERT INTO `student` VALUES ('518300214308', '518300214308', '123456', '孔祥族', 2, '湖北工程学院新技术学院', '2018', '8@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-13 23:58:54');
INSERT INTO `student` VALUES ('518300214309', '518300214309', '123456', '赖珊', 2, '湖北工程学院新技术学院', '2018', '9@qq.com', '计算机科学与技术', 3, '15542160355', 1, '2021-06-13 23:59:32');
INSERT INTO `student` VALUES ('518300214310', '518300214310', '123456', '刘宇航', 2, '湖北工程学院新技术学院', '2018', '10@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-14 00:00:16');
INSERT INTO `student` VALUES ('518300214311', '518300214311', '123456', '吕晓', 2, '湖北工程学院新技术学院', '2018', '11@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-14 00:00:50');
INSERT INTO `student` VALUES ('518300214312', '518300214312', '123456', '沈志豪', 2, '湖北工程学院新技术学院', '2018', '12@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-14 00:01:51');
INSERT INTO `student` VALUES ('518300214313', '518300214313', '123456', '孙雅丽', 2, '湖北工程学院新技术学院', '2018', '13@qq.com', '计算机科学与技术', 3, '15542160355', 1, '2021-06-14 00:02:25');
INSERT INTO `student` VALUES ('518300214314', '518300214314', '123456', '覃素娇', 2, '湖北工程学院新技术学院', '2018', '14@qq.com', '计算机科学与技术', 3, '15542160355', 1, '2021-06-14 00:03:55');
INSERT INTO `student` VALUES ('518300214315', '518300214315', '123456', '吴光皓', 2, '湖北工程学院新技术学院', '2018', '15@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-14 00:04:38');
INSERT INTO `student` VALUES ('518300214316', '518300214316', '123456', '向友', 2, '湖北工程学院新技术学院', '2018', '16@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-14 00:05:37');
INSERT INTO `student` VALUES ('518300214317', '518300214317', '123456', '肖诗晴', 2, '湖北工程学院新技术学院', '2018', '17@qq.com', '计算机科学与技术', 3, '15542160355', 1, '2021-06-14 00:06:31');
INSERT INTO `student` VALUES ('518300214318', '518300214318', '123456', '肖玉凤', 2, '湖北工程学院新技术学院', '2018', '18@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-14 00:07:09');
INSERT INTO `student` VALUES ('518300214319', '518300214319', '123456', '熊文浩', 2, '湖北工程学院新技术学院', '2018', '19@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-14 00:07:55');
INSERT INTO `student` VALUES ('518300214320', '518300214320', '123456', '徐菡廷', 2, '湖北工程学院新技术学院', '2018', '20@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-14 00:08:37');
INSERT INTO `student` VALUES ('518300214321', '518300214321', '123456', '许子谦', 2, '湖北工程学院新技术学院', '2018', '21@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-14 00:09:14');
INSERT INTO `student` VALUES ('518300214322', '518300214322', '123456', '颜成龙', 2, '湖北工程学院新技术学院', '2018', '22@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-14 00:10:00');
INSERT INTO `student` VALUES ('518300214323', '518300214323', '123456', '杨震宇', 2, '湖北工程学院新技术学院', '2018', '23@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-14 00:10:52');
INSERT INTO `student` VALUES ('518300214324', '518300214324', '123456', '余学勤', 2, '湖北工程学院新技术学院', '2018', '24@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-14 00:11:25');
INSERT INTO `student` VALUES ('518300214325', '518300214325', '123456', '袁佳颜', 2, '湖北工程学院新技术学院', '2018', '25@qq.com', '计算机科学与技术', 3, '15542160355', 1, '2021-06-14 00:12:22');
INSERT INTO `student` VALUES ('518300214326', '518300214326', '123456', '章超', 2, '湖北工程学院新技术学院', '2018', '26@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-14 00:12:55');
INSERT INTO `student` VALUES ('518300214327', '518300214327', '123456', '赵宏杰', 2, '湖北工程学院新技术学院', '2018', '27@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-14 00:13:28');
INSERT INTO `student` VALUES ('518300214328', '518300214328', '123456', '周威龙', 2, '湖北工程学院新技术学院', '2018', '28@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-14 00:14:06');
INSERT INTO `student` VALUES ('518300214329', '518300214329', '123456', '左雷', 2, '湖北工程学院新技术学院', '2018', '29@qq.com', '计算机科学与技术', 3, '15542160355', 0, '2021-06-14 00:14:41');

-- ----------------------------
-- Table structure for student_course
-- ----------------------------
DROP TABLE IF EXISTS `student_course`;
CREATE TABLE `student_course`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `course_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `score` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `point` decimal(4, 1) NOT NULL,
  `credits` decimal(4, 1) NOT NULL,
  `term` tinyint(4) NOT NULL,
  `year` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 495 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student_course
-- ----------------------------
INSERT INTO `student_course` VALUES (486, '518300214301', '2021013121003', '网络工程综合设计', '65', 1.5, 4.0, 2, 2018);
INSERT INTO `student_course` VALUES (487, '518300214301', '20210131001', 'ASP.NET程序设计', '85', 3.5, 4.0, 2, 2018);
INSERT INTO `student_course` VALUES (488, '518300214301', '202101321002', 'J2EE框架程序设计', '64', 1.4, 4.0, 2, 2018);
INSERT INTO `student_course` VALUES (489, '518300214302', '2021013121003', '网络工程综合设计', '88', 3.8, 4.0, 2, 2018);
INSERT INTO `student_course` VALUES (490, '518300214301', '2021011001', 'Android项目开发', '88', 3.8, 4.0, 2, 2018);
INSERT INTO `student_course` VALUES (491, '518300214302', '2021011001', 'Android项目开发', '89', 3.9, 4.0, 2, 2018);
INSERT INTO `student_course` VALUES (492, '518300214303', '2021011001', 'Android项目开发', '78', 2.8, 4.0, 2, 2018);
INSERT INTO `student_course` VALUES (493, '518300214304', '2021011001', 'Android项目开发', '82', 3.2, 4.0, 2, 2018);
INSERT INTO `student_course` VALUES (494, '518300214305', '2021011001', 'Android项目开发', '78', 2.8, 4.0, 2, 2018);

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `real_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `level` tinyint(4) NOT NULL DEFAULT 1,
  `school` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0',
  `phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `sex` tinyint(4) NOT NULL DEFAULT 0,
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3890291 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES (3890000, '22', '123456', '22', 1, '湖北工程学院', '22@qq.com', '13471510355', 0, '2021-06-05 00:01:26');
INSERT INTO `teacher` VALUES (3890010, '3890010', '123456', 'ss', 1, '湖北工程学院新技术学院', '1@qq.com', '15542160355', 0, '2021-06-14 00:15:21');

-- ----------------------------
-- Table structure for teacher_course
-- ----------------------------
DROP TABLE IF EXISTS `teacher_course`;
CREATE TABLE `teacher_course`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `profession` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `grade` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `term` tinyint(4) NOT NULL,
  `course_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher_course
-- ----------------------------
INSERT INTO `teacher_course` VALUES (28, '3890000', '22', 'Java', '软件工程', '1', 1, '20210131001');
INSERT INTO `teacher_course` VALUES (29, '3890010', '3890010', 'ASP.NET程序设计', '计算机科学与技术', '3', 2, '20210131001');

-- ----------------------------
-- Table structure for timetable
-- ----------------------------
DROP TABLE IF EXISTS `timetable`;
CREATE TABLE `timetable`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `week_id` int(11) NOT NULL,
  `profession` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `grade` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `year` int(11) NOT NULL,
  `term` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 145 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of timetable
-- ----------------------------
INSERT INTO `timetable` VALUES (131, 131, '计算机科学与技术', '3', 2021, 2);
INSERT INTO `timetable` VALUES (132, 132, '计算机科学与技术', '3', 2021, 2);
INSERT INTO `timetable` VALUES (133, 133, '计算机科学与技术', '3', 2021, 2);
INSERT INTO `timetable` VALUES (134, 134, '计算机科学与技术', '3', 2021, 2);
INSERT INTO `timetable` VALUES (135, 135, '计算机科学与技术', '3', 2021, 2);
INSERT INTO `timetable` VALUES (136, 136, '计算机科学与技术', '3', 2021, 2);
INSERT INTO `timetable` VALUES (137, 137, '计算机科学与技术', '3', 2021, 2);
INSERT INTO `timetable` VALUES (138, 138, '计算机科学与技术', '3', 2021, 2);
INSERT INTO `timetable` VALUES (139, 139, '计算机科学与技术', '3', 2021, 2);
INSERT INTO `timetable` VALUES (140, 140, '计算机科学与技术', '3', 2021, 2);
INSERT INTO `timetable` VALUES (141, 141, '计算机科学与技术', '3', 2021, 2);
INSERT INTO `timetable` VALUES (142, 142, '计算机科学与技术', '3', 2021, 2);
INSERT INTO `timetable` VALUES (143, 143, '计算机科学与技术', '3', 2021, 2);
INSERT INTO `timetable` VALUES (144, 144, '计算机科学与技术', '3', 2021, 2);

-- ----------------------------
-- Table structure for upload
-- ----------------------------
DROP TABLE IF EXISTS `upload`;
CREATE TABLE `upload`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `level` int(11) NOT NULL DEFAULT 0,
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for week
-- ----------------------------
DROP TABLE IF EXISTS `week`;
CREATE TABLE `week`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `monday` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tuesday` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `wednesday` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `thursday` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `friday` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `saturday` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sunday` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 145 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of week
-- ----------------------------
INSERT INTO `week` VALUES (131, '网络工程综合设计', '一', '软件工程', '网络工程综合设计', '一', '一', '一');
INSERT INTO `week` VALUES (132, '网络工程综合设计', '一', '软件工程', '网络工程综合设计', '一', '一', '一');
INSERT INTO `week` VALUES (133, '一', 'ASP.NET程序设计', '一', 'Android项目开发', '一', '一', '一');
INSERT INTO `week` VALUES (134, '一', 'ASP.NET程序设计', '一', 'Android项目开发', '一', '一', '一');
INSERT INTO `week` VALUES (135, '一', '一', '一', 'Android项目开发', '一', '一', '一');
INSERT INTO `week` VALUES (136, '一', '一', '一', '一', '一', '一', '一');
INSERT INTO `week` VALUES (137, '一', '一', 'ASP.NET程序设计', '一', '一', '一', '一');
INSERT INTO `week` VALUES (138, '一', '一', 'ASP.NET程序设计', '一', '一', '一', '一');
INSERT INTO `week` VALUES (139, 'J2EE框架程序设计', '计算机专业英语', '一', '一', '一', '一', '一');
INSERT INTO `week` VALUES (140, 'J2EE框架程序设计', '计算机专业英语', '一', '一', '一', '一', '一');
INSERT INTO `week` VALUES (141, '一', '一', '一', '网络管理与维护', '一', '一', '一');
INSERT INTO `week` VALUES (142, '一', '一', '一', '网络管理与维护', '一', '一', '一');
INSERT INTO `week` VALUES (143, '一', '一', '一', '网络管理与维护', '一', '一', '一');
INSERT INTO `week` VALUES (144, '一', '一', '一', '一', '一', '一', '一');

SET FOREIGN_KEY_CHECKS = 1;
