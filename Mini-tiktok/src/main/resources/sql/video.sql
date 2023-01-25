




-- ----------------------------
-- Table structure for tb_video
-- ----------------------------
DROP TABLE IF EXISTS `tb_video`;
CREATE TABLE `tb_video`  (
    `video_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
    `user_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '作者id',
    `favorite_count` int(8) UNSIGNED NULL DEFAULT 0 COMMENT '点赞数',
    `comment_count` int(8) UNSIGNED NULL DEFAULT 0 COMMENT '评论数',
    `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '标题',
    `play_url`  varchar(2048) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '视频播放地址',
    `cover_url` varchar(2048) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '视频封面地址',
    PRIMARY KEY (`video_id`) ,
) ENGINE = InnoDB AUTO_INCREMENT = 1010 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;