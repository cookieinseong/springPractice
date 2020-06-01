<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "js/join.js"></script>
<link rel="stylesheet" type="text/css" href="css/join.css">
<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR&display=swap" rel="stylesheet">
</head>
<body>
	<header>
		<div id="nav_up">
			<ul>
				<li><a href="join.html">회원가입</a></li>
				<li><a href="login.html">로그인</a></li>
				<li><a href="my_notice.html">고객행복센터</a></li>
				<li>배송지역검색</li>
				<li><a href="adminLogin.html">ADMINISTRATOR</a></li>

			</ul>
		</div>
		<nav>
			<h1>
				<a class="logo" href="main.html"></a>
			</h1>
			<ul>
				<li>COOKIT소개</li>
				<li>COOKIT메뉴</li>
				<li>리뷰</li>
				<li><a href="eventList.html">이벤트</a></li>
				<li>MY쿡킷</li>

			</ul>
			<ul>
				<li><a href="#"><span>장바구니</span></a></li>
				<li><a href="#"><span>메뉴찾기</span></a></li>
			</ul>

		</nav>


	</header>
	<section>
		<div id="img"></div>
		<div id="title">
			<h1>회원가입</h1>
		</div>
		<div>
			<h3 class="smallTitle">
				필수 정보 입력<span>(* 항목은 필수 항목입니다.)</span>
			</h3>
		</div>
		<form action = "join_success" name = "join" method = "get">
			<div id="sectionform">
				<div id="sectionform1">
					<table id="inputTable1">
						<!--1행  -->
						<tr>
							<th class="th"><img alt="빨간별표식" src="images/point_rs.png"
								class="star">이름</th>
							<td><input type="text" id="name" name="name"></td>
						</tr>
						<!--2행  -->
						<tr>
							<th class="th"><img alt="빨간별표식" src="images/point_rs.png"
								class="star">아이디</th>
							<td><input type="text" name="id" id="id">
								<button id="check" onclick="open1()">중복확인</button>
								<input type="button" onclick="open1()" value="중복확인"> <br>
								<P class="notice">
									4~15자리의 영문,숫자,특수기호(_)만 사용하실 수 있습니다.<br> 첫글자는 영문으로 입력해주세요.
								</P></td>
						</tr>
						<!--3행  -->
						<tr>
							<th class="th"><img alt="빨간별표식" src="images/point_rs.png"
								class="star">비밀번호</th>
							<td><input type="password" id="psw1" name = "pw"><br>
								<p class="notice">
									영문, 숫자, 특수문자 중 2종류 조합 시 10자리 이상 입력<br> 영문, 숫자, 특수문자 모두 조합
									시 8자리 이상 입력
								</p></td>
						</tr>
						<!--4행  -->
						<tr>
							<th class="th"><img alt="빨간별표식" src="images/point_rs.png"
								class="star">비밀번호 확인</th>
							<td><input type="password" id="psw2">
								<p class="notice">비밀번호를 다시 한번 입력해 주세요.</p></td>
						</tr>
						<!--5행  -->
						<tr>
							<th class="th"><img alt="빨간별표식" src="images/point_rs.png"
								class="star">이메일</th>
							<td><input type="text" id="email1"> @ <input
								type="text" id="email2"> <select>
									<option>직접입력</option>
									<option>naver.com</option>
									<option>daum.net</option>
									<option>google.coms</option>
									<option>nate.com</option>

							</select></td>
						</tr>
						<!--6행  -->
						<tr>
							<th class="th"><img alt="빨간별표식" src="images/point_rs.png"
								class="star">주소</th>
							<td><input type="text" id="address1" mname = "post1">&nbsp;&nbsp;-&nbsp;&nbsp;<input
								type="text" id="address2" name = "post2">
								<button id="check1">우편번호</button> <br> <input type="text"
								id="address3" name = "post3"> <br> <input type="text" id="adress4"></td>
						</tr>
						<!--7행  -->
						<tr>
							<th class="th"><img alt="빨간별표식" src="images/point_rs.png"
								class="star">휴대전화</th>
							<td><input type="text" id="phone1" name = "tel1">&nbsp;&nbsp;-&nbsp;&nbsp;<input
								type="text" id="phone2" name = "tel2">&nbsp;&nbsp;-&nbsp;&nbsp;<input
								type="text" id="phone3" name = "tel3"></td>
						</tr>
						<!--8행  -->
						<tr>
							<th class="th"><img alt="빨간별표식" src="images/point_rs.png"
								class="star">생년월일</th>
							<td><select id="year" name = "birth1">
									<option value = "1991">1991</option>
									<option value = "1992">1992</option>
									<option value = "1993">1993</option>
									<option value = "1994">1994</option>
									<option value = "1995">1995</option>
									<option value = "1996">1996</option>
									<option value = "1997">1997</option>
							</select>년&nbsp;&nbsp; <select id="month" name = "birth2">
									<option value = "1">1</option>
									<option value = "2">2</option>
									<option value = "3">3</option>
									<option value = "4">4</option>
									<option value = "5">5</option>
									<option value = "6">6</option>
									<option value = "7">7</option>
									<option value = "8">8</option>
									<option value = "9">9</option>
									<option value = "10">10</option>
									<option value = "11">11</option>
									<option value = "12">12</option>
							</select id="day">월&nbsp;&nbsp; <select name = "birth3">
									<option value = "1">1</option>
									<option value = "2">2</option>
									<option value = "3">3</option>
									<option value = "4">4</option>
									<option value = "5">5</option>
									<option value = "6">6</option>
									<option value = "7">7</option>
									<option value = "8">8</option>
									<option value = "9">9</option>
									<option value = "10">10</option>
									<option value = "11">11</option>
									<option value = "12">12</option>
									<option value = "13">13</option>
									<option value = "14">14</option>
									<option value = "15">15</option>
									<option value = "16">16</option>
									<option value = "17">17</option>
									<option value = "18">18</option>
									<option value = "19">19</option>
									<option value = "20">20</option>
									<option value = "21">21</option>
									<option value = "22">22</option>
									<option value = "23">23</option>
									<option value = "24">24</option>
									<option value = "25">25</option>
									<option value = "26">26</option>
									<option value = "27">27</option>
									<option value = "28">28</option>
									<option value = "29">29</option>
									<option value = "30">30</option>
									<option>31</option>
							</select>일&nbsp;&nbsp; <input type="radio" name="cal" id="solar"
								value="solar"><span class=notice1>양력</span> &nbsp;&nbsp; <input
								type="radio" name="cal" id="lunar" value="solar"><span
								class=notice1>음력</span></td>
						</tr>
						<!--9행  -->
						<tr>
							<th class="th"><img alt="빨간별표식" src="images/point_rs.png"
								class="star">성별</th>
							<td><input type="radio" name="gender" id="male" value="male"><span
								class=notice1>남성</span>&nbsp;&nbsp; <input type="radio"
								name="gender" id="female" value="male"><span
								class=notice1>여성</span></td>
						</tr>
						<!--10행  -->
						<tr>
							<th class="th"><img alt="빨간별표식" src="images/point_rs.png"
								class="star">뉴스레터 수신여부</th>
							<td><span class=notice1>이메일을 통한 상품 및 이벤트 정보 수신에
									동의합니다.</span> <input type="radio" name="news" id="yes" value="yes"><span
								class=notice1>예</span> <input type="radio" name="news" id="no"
								value="no"><span class=notice1>아니오</span></td>
						</tr>
						<!--11행  -->
						<tr>
							<th class="th"><img alt="빨간별표식" src="images/point_rs.png"
								class="star">SMS 수신여부</th>
							<td><span class=notice1>문자를 통한 상품 및 이벤트 정보 수신에 동의합니다.</span>
								<input type="radio" name="textagree" id="textagree1" value="yes"><span
								class=notice1>예</span> <input type="radio" name="textagree"
								id="textagree2" value="no"><span class=notice1>아니오</span>
							</td>
						</tr>


					</table>
					<div>
						<h3 class="smallTitle">
							분양회원 정보 입력<span>(다구좌 회원일 경우 가지고 계신 카드번호 중 하나를 입력해 주시면 됩니다)</span>
						</h3>
					</div>
					<div id="sectionform2">
						<table id="inputTable2">
							<tr>
								<th class="th"><img alt="빨간별표식" src="images/point_rs.png"
									class="star">회원번호</th>
								<td><input type="text" name="memNum" id="memNum">
									<p class="notice">하이픈(-)이나 띄어쓰기 없이 입력해 주시기 바랍니다.</p></td>
							</tr>
							<tr>
								<th class="th"><img alt="빨간별표식" src="images/point_rs.png"
									class="star">회원인증번호</th>
								<td><input type="text" name="checkMemNum" id="checkMemNum">
									<p class="notice">숫자 4자리 입력</p></td>
							</tr>
						</table>
					</div>
					<div>
						<h3 class="smallTitle">선택 입력 정보</h3>
					</div>
					<div id="sectionform3">
						<table id="inputTable3">
							<tr>
								<th class="th"><img alt="빨간별표식" src="images/point_rs.png"
									class="star"> 직업</th>
								<td><select>
										<option>선택</option>
										<option>회사원</option>
										<option>자영업</option>
										<option>프리랜서</option>
										<option>전업주부</option>
										<option>학생</option>
										<option>기타</option>
								</select></td>
							</tr>
							<tr>
								<th class="th"><img alt="빨간별표식" src="images/point_rs.png"
									class="star">직업 결혼여부</th>
								<td><input type="radio" name="marriage" id="marriage1"
									value="yes"><span class=notice1>예</span>&nbsp;&nbsp;<input
									type="radio" name="marriage" id="marriage2" value="no"><span
									class=notice1>아니오</span></td>
							</tr>
							<tr>
								<th class="th"><img alt="빨간별표식" src="images/point_rs.png"
									class="star">관심사</th>
								<td><span class="inter"><input type="checkbox" name="interest" class="interest"
									id="comInternet" value="com"  >컴퓨터/인터넷</span>
									<span class="inter"><input type="checkbox" name="interest" class="interest"
									id="movieVideo" value="movie">영화/비디오</span>
									<span class="inter"><input type="checkbox" name="interest" class="interest"
									id="music" value="music" >음악</span>
									<span class="inter"><input type="checkbox" name="interest" class="interest"
									id="shopping" value="shopping">쇼핑</span>
									<span class="inter"><input type="checkbox" name="interest" class="interest"
									id="game" value="game">게임</span><span class="inter"> <input
									type="checkbox" name="interest" class="interest" id="culture"
									value="culture">문화/예술</span><br>
									<span class="inter"><input type="checkbox" name="interest" class="interest" id=""
									value="">육아/아동</span> <span class="inter"><input
									type="checkbox" name="interest" class="interest" id="parenting"
									value="parenting">요리</span> <span class="inter"><input
									type="checkbox" name="interest" class="interest" id="cooking"
									value="cooking">인테리어</span><span class="inter"> <input
									type="checkbox" name="interest" class="interest" id="interior"
									value="interior">레져/여가</span> <span class="inter"><input
									type="checkbox" name="interest" class="interest" id="health"
									value="health"  >건강/다이어트</span><span class="inter"> <input
									type="checkbox" name="interest" class="interest" id="fashion"
									value="fashion">패션/미용</span></td>
							</tr>
						</table>
					</div>
					<div id="buttondiv">

						<input type = "button" value = "가입하기" onclick = "check2()">	
						<input type = "reset" value = "취소하기">
					</div>
				</div>

			</div>
		</form>

	</section>
	<footer>
		<div id="big">
			<div>
				<div></div>
				<div>
					<p>©COOKITALL RIGHTS RESERVED</p>
				</div>
			</div>
			<div>
				<ul>
					<li>이용약관</li>
					<li>개인정보처리방침</li>
					<li>법적고지</li>
					<li>사업</li>
				</ul>
				<div>
					<p>씨제이제일제당(주) | 대표이사:손경식,강신호,신현재 | 사업자등록번호:104-86-09535</p>
					<p>주소:서울 중구 동호로330CJ제일제당 센터(우)04560 | 통신판매업신고중고 제07767호 |
						개인정보보호책임자:조영민</p>
					<p>이메일:cjon@cj.net | 호스팅제공자:CJ올리브네트웍스(주)</p>
					<P>고객님은 안전거래를 위해 현금등으로 결제시 LGU+전자 결제의 매매보호(에스크로) 서비스를 이용하실 수
						있습니다.
				</div>

			</div>

			<div>
				<div>
					<span>CJ그룹계열사 바로가기</span>
				</div>
				<div>고객행복센터 1668-1920</div>
			</div>

		</div>



	</footer>

</body>
</html>