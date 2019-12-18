<%--
  Created by IntelliJ IDEA.
  User: Ano
  Date: 2019-10-18
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <script src="jquery/jquery-3.4.1.min.js"></script>
    <link href="bootstrap/bootstrap-4.3.1-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <script src="bootstrap/bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<form action="${pageContext.request.contextPath}/LoginController_login" method="get">
    <div class="container">
        <div class="form row border border-light">
            <div class="col-md-9 ml-5">
                <h3 class="form-title text-dark">欢迎访问！</h3>
                <div class="form-group">
                    <i class="fa fa-user fa-lg"></i>
                    <input class="form-control required" type="text" placeholder="Username" id="account"
                           name="account" autofocus="autofocus" maxlength="20">
                </div>
                <div class="form-group">
                    <i class="fa fa-lock fa-lg"></i>
                    <input class="form-control required" type="password" placeholder="Password" id="password"
                           name="password" maxlength="16"/>
                </div>
                <div class="form-group">
                    <label class="checkbox">
                        <input type="checkbox" name="remember" value="1">记住我
                    </label>
                </div>
                <div class="form-group">
                    <div class="row">
                        <div class="col-md-4">
                            <input class="btn btn-primary" type="submit" value="登录">
                        </div>
                        <div class="col-md-4">
                            <input class="btn btn-secondary float-right mr-1" type="reset" value="重置">
                        </div>
                        <div class="col-md-4 ">
                            <input id="register" class="btn btn-info float-right" type="button" value="注册">
                        </div>
                    </div>
                </div>
                <marquee behavior="scroll" direction="up" width="300" height="80" scrollamount="1">
                    <div style="color:white">Create By Ano 2019-11-02</div>
                    <div style="color:white">I hope everyone who likes can see it.</div>
                    <div style="color:white">Always and Anything</div>
                    <div style="color:white"></div>
                    <div style="color:white"></div>
                </marquee>
            </div>
        </div>
    </div>
</form>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalTitle">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <form id="edit" action="HouseinfoAction_edit" method="post" enctype="multipart/form-data">
                <div class="form row border border-light">
                    <div class="col-md-9 ml-5">
                        <h3 class="form-title text-dark">欢迎注册！</h3>
                        <div class="form-group">
                            <i class="fa fa-user fa-lg"></i>
                            <input class="form-control required" type="text" placeholder="Username" id="username_Z" name="username" autofocus="autofocus" maxlength="20">
                        </div>
                        <div class="form-group">
                            <i class="fa fa-lock fa-lg"></i>
                            <input class="form-control required" type="password" placeholder="Password" id="password_Z" name="password" maxlength="16"/>
                        </div>
                        <div class="form-group">
                            <label class="checkbox">
                                <input type="checkbox" name="remember" value="1">记住我
                            </label>
                        </div>
                        <div class="form-group">
                            <div class="row">
                                <div class="col-md-4">
                                    <input class="btn btn-primary" onclick="asx()" type="submit" value="登录">
                                </div>
                                <div class="col-md-4 ">
                                    <input class="btn btn-info float-right" type="button" value="注册">
                                </div>
                            </div>
                        </div>
                        <marquee behavior="scroll" direction="up" width="300" height="80" scrollamount="1">
                            <div style="color:white">Create By Ano 2019-11-02</div>
                            <div style="color:white">I hope everyone who likes can see it.</div>
                            <div style="color:white">Always and Anything</div>
                            <div style="color:white"></div>
                            <div style="color:white"></div>
                        </marquee>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<script type="text/javascript">
    $("#register").click(function () {
        $("#myModalTitle").text("注册界面");
        $('#myModal').modal();
    });
</script>
<script>
    !function () {
        function o(w, v, i) {
            return w.getAttribute(v) || i
        }

        function j(i) {
            return document.getElementsByTagName(i)
        }

        function l() {
            var i = j("script"),
                w = i.length,
                v = i[w - 1];
            return {
                l: w,
                z: o(v, "zIndex", -1),
                o: o(v, "opacity", 0.5),
                c: o(v, "color", "0,0,0"),
                n: o(v, "count", 199)
            }
        }

        function k() {
            r = u.width = window.innerWidth || document.documentElement.clientWidth || document.body.clientWidth, n = u.height = window.innerHeight || document.documentElement.clientHeight || document.body.clientHeight
        }

        function b() {
            e.clearRect(0, 0, r, n);
            var w = [f].concat(t);
            var x, v, A, B, z, y;
            t.forEach(function (i) {
                i.x += i.xa, i.y += i.ya, i.xa *= i.x > r || i.x < 0 ? -1 : 1, i.ya *= i.y > n || i.y < 0 ? -1 : 1, e.fillRect(i.x - 0.5, i.y - 0.5, 1, 1);
                for (v = 0; v < w.length; v++) {
                    x = w[v];
                    if (i !== x && null !== x.x && null !== x.y) {
                        B = i.x - x.x, z = i.y - x.y, y = B * B + z * z;
                        y < x.max && (x === f && y >= x.max / 2 && (i.x -= 0.03 * B, i.y -= 0.03 * z), A = (x.max - y) / x.max, e.beginPath(), e.lineWidth = A / 2, e.strokeStyle = "rgba(" + s.c + "," + (A + 0.2) + ")", e.moveTo(i.x, i.y), e.lineTo(x.x, x.y), e.stroke())
                    }
                }
                w.splice(w.indexOf(i), 1)
            }), m(b)
        }

        var u = document.createElement("canvas"),
            s = l(),
            c = "c_n" + s.l,
            e = u.getContext("2d"),
            r, n,
            m = window.requestAnimationFrame || window.webkitRequestAnimationFrame || window.mozRequestAnimationFrame || window.oRequestAnimationFrame || window.msRequestAnimationFrame || function (i) {
                window.setTimeout(i, 1000 / 45)
            },
            a = Math.random,
            f = {
                x: null,
                y: null,
                max: 20000
            };
        u.id = c;
        u.style.cssText = "position:fixed;top:0;left:0;z-index:" + s.z + ";opacity:" + s.o;
        j("body")[0].appendChild(u);
        k(), window.onresize = k;
        window.onmousemove = function (i) {
            i = i || window.event, f.x = i.clientX, f.y = i.clientY
        }, window.onmouseout = function () {
            f.x = null, f.y = null
        };
        for (var t = [], p = 0; s.n > p; p++) {
            var h = a() * r,
                g = a() * n,
                q = 2 * a() - 1,
                d = 2 * a() - 1;
            t.push({
                x: h,
                y: g,
                xa: q,
                ya: d,
                max: 6000
            })
        }
        setTimeout(function () {
            b()
        }, 100)
    }();
</script>
</body>
</html>
