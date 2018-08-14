<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ include file="../header.jsp"%>
<fieldset class="layui-elem-field site-demo-button"
	style="margin-top: 30px; width: 500px; margin-left: 400px">
	<legend>用户登录</legend>
	<div>

		<form class="layui-form" id="User_login_action"
			name="User_login_action" action="user_login.action" method="post">
			<div class="infos">
				<table class="field">
					<tr>
						<td colspan="2" style="text-align: center; color: red"></td>
					</tr>
					<div class="layui-form-item" width="200px">
						<label class="layui-form-label">用&nbsp; 户 &nbsp;名：</label>
						<div class="layui-input-block" style="width: 280px">
							<input type="text" name="username" id="username"
								lay-verify="title" autocomplete="off" placeholder="请输入用户名"
								class="layui-input">
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
						<div class="layui-input-block" style="width: 280px">
							<input type="password" name="password" id="password"
								lay-verify="required" autocomplete="off" placeholder="请输入密码"
								class="layui-input">
						</div>
					</div>

					<div class="layui-form-item">
						<label class="layui-form-label"> 验&nbsp; 证&nbsp; 码：</label>
						<div class="layui-input-block" style="width: 280px">
							<input type="text" name="zccode" id="zccode"
								lay-verify="required" autocomplete="off" placeholder="请输入验证码"
								class="layui-input"><br /> <img id="image01"
								src="pages/image.jsp" /> <a href="javascript:void(0)"
								onclick="changeImage()">看不清</a> <br />
						</div>
						<br />
						<div id="reslut" style="margin-left: 100px; color: red;">
							${errorMsg }</div>
					</div>
					<!-- <tr>
							<td class="field">验 证 码：</td>
							<td><input type="text" class="text verycode" name="veryCode" /></td>
						</tr> -->
				</table>
				<br>
				<div class="buttons" style="margin-left: 80px;">
					<input class="layui-btn layui-btn-primary"   style="width: 100px"
					onclick='document.location="toRegister.action"'  value="立即注册 "> 
					<button class="layui-btn" id="User_login_action_0"
						 >立即登录</button>
				</div>
		</form>

	</div>
</fieldset>

<script type="text/javascript">
	function changeImage() {
		document.getElementById("image01").src = "pages/image.jsp?"
				+ new Date();
	}
</script>



<%@ include file="../fooder.jsp"%>