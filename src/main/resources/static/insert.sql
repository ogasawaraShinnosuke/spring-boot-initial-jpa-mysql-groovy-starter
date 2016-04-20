INSERT INTO `test001`.`user_test` (`created`, `name`, `updated`) VALUES (now(), 'ken', now());
INSERT INTO `test001`.`user_test` (`created`, `name`, `updated`) VALUES (now(), 'mike', now());
INSERT INTO `test001`.`user_test` (`created`, `name`, `updated`) VALUES (now(), 'bob', now());
INSERT INTO `test001`.`user_test` (`created`, `name`, `updated`) VALUES (now(), 'marry', now());

INSERT INTO `test001`.`user_info` (`email`, `sex`, `user_id`) VALUES ('example+0001@example.com', '1', '1');
INSERT INTO `test001`.`user_info` (`email`, `sex`, `user_id`) VALUES ('example+0002@example.com', '1', '2');
INSERT INTO `test001`.`user_info` (`email`, `sex`, `user_id`) VALUES ('example+0003@example.com', '1', '3');
INSERT INTO `test001`.`user_info` (`email`, `sex`, `user_id`) VALUES ('example+0004@example.com', '2', '4');

INSERT INTO `test001`.`user_history` (`billing_flg`, `login_fail_count`, `user_agent`, `user_id`) VALUES (true, '1', 'hoge', '1');
INSERT INTO `test001`.`user_history` (`billing_flg`, `login_fail_count`, `user_agent`, `user_id`) VALUES (false, '10', 'fuga', '2');
INSERT INTO `test001`.`user_history` (`billing_flg`, `login_fail_count`, `user_agent`, `user_id`) VALUES (true, '4', 'piyo', '3');
INSERT INTO `test001`.`user_history` (`billing_flg`, `login_fail_count`, `user_agent`, `user_id`) VALUES (false, '0', 'hello', '4');