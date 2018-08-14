<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../header.jsp"%>

<script>
	layui
			.use(
					[ 'form', 'layedit', 'laydate' ],
					function() {
						var form = layui.form, layer = layui.layer, layedit = layui.layedit, laydate = layui.laydate;

						//自定义验证规则
						form.verify({
							username : function(value) {
								if (value.length < 5) {
									return '标题至少得5个字符啊';
								}
							},
							password : [ /(.+){6,12}$/, '密码必须6到12位' ],
							content : function(value) {
								layedit.sync(editIndex);
							}
						});

					});
</script>

<div id="regLogin" class="wrap">
	<div class="dialog">
		<dl class="clearfix">
			<dt>新用户注册</dt>
			<dd class="past">填写个人信息</dd>
		</dl>
		<div class="box">
			<form id="User_register_action" name="User_register_action" action=""
				class="layui-form" method="post">
				<div class="infos">
					<div class="layui-form-item">
						<label class="layui-form-label">用 户 名：</label>
						<div class="layui-input-block">
							<input type="text" name="username" lay-verify="username"
								style="width: 255px; height: 35px" autocomplete="off"
								placeholder="请输入用户名" class="layui-input">

						</div>
					</div>

					<div class="layui-form-item">
						<label class="layui-form-label">密 码：</label>
						<div class="layui-input-block">
							<input type="password" name="password" lay-verify="password"
								style="width: 255px; height: 35px" autocomplete="off"
								placeholder="请输入密码" class="layui-input">

						</div>
					</div>

					<div class="layui-form-item">
						<label class="layui-form-label">确认密码：</label>
						<div class="layui-input-block">
							<input type="password" name="repassword" lay-verify="repassword"
								style="width: 255px; height: 35px" autocomplete="off"
								placeholder="请输入确认密码" class="layui-input">

						</div>
					</div>

					<div class="layui-form-item">
						<label class="layui-form-label">电 话：</label>
						<div class="layui-input-block">
							<input type="text" name="telephone" lay-verify="title"
								style="width: 255px; height: 35px" autocomplete="off"
								placeholder="请输入电话" class="layui-input">

						</div>
					</div>

					<div class="layui-form-item">
						<label class="layui-form-label">用户姓名：</label>
						<div class="layui-input-block">
							<input type="text" name="name" lay-verify="name"
								style="width: 255px; height: 35px" autocomplete="off"
								placeholder="请输入用户姓名" class="layui-input">
						</div>
					</div>
					<div>
						<div style="float: left">

							<input class="layui-btn layui-btn-primary"
								style="width: 100px; margin-left: 120px"
								onclick='document.location="index.action"' value="返回登录">
						</div>

						<div id="button" onclick="button()" style="float: right">

							<input type="button" class="layui-btn "
								style="width: 100px; margin-right: 150px" name="button"
								value="立即注册 " />
						</div>
					</div>
				</div>
			</form>

			<div id="result" style="color: red;margin-left:100px">${registerError }</div>
		</div>
	</div>
</div>

<script type="text/javascript">
	function button() {

		$.ajax({
			url : "user_register.action",
			type : "post",
			dateType : "json",
			data : $("#User_register_action").serialize(),
			success : function(data) {
				  if (data.code == 1) {
					$("#result").html(data.msg);
				} else {
					$("#result").html(data.msg);
					location.href="toRegister.action";
				} 
			}
		});

	}
</script>



<%@ include file="../fooder.jsp"%>