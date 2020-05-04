<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>LOGIN</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>

<body style="background-color: #f1e8e8;">
<div class = "container">
    <div style="text-align: center; font-style: italic; font-weight: 900; font-family:'Franklin Gothic Medium';">
        <h3 style="font-size: 30px;">TUNYENYE SEC SCHOOL</h3>
        <h4>"Quality education for all"</h4>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-lg-12"></div>
            <div class="container">
                <div class="row">
                    <div class="col-md-12">ENTER YOUR LOGIN DETAILS</div>
                </div>
            </div>
            <div class="container">
                <form action="login" class="form-horizontal">
                    <div class="col-md-4" style="background-color: #ffffff;">
                        <p style="text-align:center; font-size:21.48px;font-style: italic; font-weight: bold;
                        color: olive;">
                            Welcome to<br>
                            SchoolManagerSystem<br>
                            ... <br>
                            . <br>
                            You must be <br>
                            authenticated <br>
                            to use the System.</p>
                    </div>
                    <div class="col-md-8" style="background-color: #faf9f9;">
                        <div class="form-group" style="padding-top: 2%; padding-left: 20%;">
                            <label for="username" class="col-md-2" style="font-size:15px;">USERNAME:</label>
                            <div class="col-md-10" style="padding-right:50% ;">
                                <input type="text" name="username" id="username" class="form-control input-sm"
                                    placeholder="Username">
                            </div>
                        </div>

                        <div class="form-group" style="padding-top: 2%;padding-left: 20%">
                            <label for="username" class="col-md-2" style="font-size:15px;">PASSWORD:</label>
                            <div class="col-md-10" style="padding-right:50% ;">
                                <input type="password" name="password" id="password" class="form-control input-sm"
                                    placeholder="Password">
                            </div>
                        </div>
                        <div class="form-group" style="padding-left: 20%">
                            <label for="remember" class="checkbox-inline col-sm-offset-2 col-sm-10">
                                <input type="checkbox" name="remember" id="remember"> REMEMBER ME!
                            </label>
                        </div>
                        <div class="form-group" style="padding-top: 2%; padding-left:60%;">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-primary btn-md ">Login</button>
                            </div>
                        </div>
                    </div>

                </form>
            </div>
            <div class="container-fluid" style="padding-top: 15%;">
                <div class="col-sm-12"
                    style="background-color:  #e4d1d1; height: 3px;; text-align: center; font-weight:1000;">
                    - - -
                </div>
            </div>
            <div class="pull-right" style="font-size: x-small; color: #887355;">
                <b>@</b> Shabo
            </div>
            <style>
                .col-md-12 {
                    text-align: center;
                    background-color: #e4d1d1;
                    font-family: Verdana;
                    font-style: italic;
                    font-weight: bold;
                    font-size: 20px;
                    border-top-left-radius: 1em;
                    border-top-right-radius: 1em;
                }

                .col-lg-12 {
                    padding: 1%;
                }
            </style>
        </div>
    </div>
    </div>
    </div>
    <!-- jQuery (necessary for Bootstrap’s JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!--Include all compiled plugins(below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>