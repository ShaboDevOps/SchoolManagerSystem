<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>REGISTRATION</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="styleSheet">
    <link rel='stylesheet' type='text/css' media='screen' href='registaration.css'>
</head>

<body style="background-color: #faf9f9;">
    <section>
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-12" style="background-color: #3c3177; height: 
                20px;border-top-right-radius: 0.8em; border-top-left-radius: 0.8em;">

                </div>
                <div class="col-sm-12" style="background-color: #e2ded5; height: 30px;">
                    <h5 class="pull-right">Welcome:<b> Sir, Simon Mwalingo</b></h5>
                </div>
            </div>
        </div>
    </section>

    <section>
        <div class="contaner">
            <div class="contaner">
                <div class="row">

                    <div class="col-sm-2" style="background-color: #e2ded5;">
                        <div class="collapse navbar-collapse" id="example-navbar-collapse">
                            <ul class="nav nav-pills nav-stacked" style="font-weight: 900;">
                               <li><a href="smhome"><span">Home</span></a></li>
                                <li class="dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                        View Students<span class="caret"></span>
                                    </a>
                                    <ul class="dropdown-menu">
                                        <li><a href="smform1">Form I</a></li>
                                        <li><a href="smform2">Form II</a></li>
                                        <li><a href="smform3">Form III</a></li>
                                        <li><a href="smform4">Form IV</a></li>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                       Registration<span class="caret"></span>
                                    </a>
                                    <ul class="dropdown-menu">
                                        <li><a href="stdregister">Students</a></li>
                                        <li><a href="tchregister">Teachers</a></li>
                                    </ul>
                                </li>	
                                <li><a href="smviewteachers"> <span>View Teachers</span></a></li>
                                <li><a href="viewresult"> <span>View Results</span></a></li>
                                <li><a href="viewanoucement"> <span>View Anoucements</span></a></li>
                                <li><a href="changepassword"> <span>Change password</span></a></li>
                                <li><a href="logout"> <span>Logout</span></a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-md-10">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-11" style="text-align: center;font-size: 20px; font-weight: 900;
                                padding-top:3%;">
                                    <span><b>TEACHER'S REGISTRATION FORM</b> </span>
                                </div>

                                <div class="col-md-12">
                                    <form action="registertch">
                                        <div class="cont01" style="background-color: white;">

                                            <div class="title">
                                                Please!, Honestly fill the Teacher's valid details.
                                            </div>

                                            <div class="names">
                                                <label for="name">FIRST NAME :</label>
                                                <input type="text" name="firstname" placeholder="First name">
                                            </div>

                                            <div class="place">
                                                <label for="name">MIDDLE NAME :</label> <input type="text" name="middlename"
                                                    placeholder="Middle name">
                                            </div>
                                            <div class="place">
                                                <label for="name">LAST NAME :</label> <input type="text" name="lastname"
                                                    placeholder="Last name">
                                            </div>
                                            <div style="padding-left:55%; padding-top: 5%;">
                                                <div class="col-sm-4" style="color: black;font-weight: 900;">
                                                    <label for="name">SUBJECTS</label>
                                                    <select multiple class="form-control" name="subjects">
                                                        <option>B/Mathematics</option>
                                                        <option>Physics</option>
                                                        <option>Chemistry</option>
                                                        <option>Biology</option>
                                                        <option>Geograph</option>
                                                        <option>English</option>
                                                        <option>History</option>
                                                        <option>Civics</option>
                                                        <option>Kiswahili</option>
                                                    </select>
                                                </div>
                                                <div class="col-md-12" style="padding-top: 5%;">
                                                    <label for="name">GENDER</label>
                                                    <div class="radio">
                                                        <label>
                                                            <input type="radio" name="gender" id="male" value="male"
                                                                checked> Male
                                                        </label>
                                                    </div>
                                                    <div class="radio">
                                                        <label>
                                                            <input type="radio" name="gender" id="female"
                                                                value="female">Female
                                                        </label>
                                                    </div>
                                                    <div class="col-sm-3" style="padding-top: 5%;color: black;font-weight: 900;
                                                    padding-bottom: 5%; padding-left: 0%;">
                                                        <label for="name">YEAR</label>
                                                        <select class="form-control" name="year">
                                                            <option>2012</option>
                                                            <option>2013</option>
                                                            <option>2014</option>
                                                            <option>2015</option>
                                                            <option>2016</option>
                                                            <option>2017</option>
                                                            <option>2018</option>
                                                            <option>2019</option>
                                                            <option>2020</option>
                                                            <option>2021</option>
                                                            <option>2022</option>
                                                            <option>2023</option>
                                                            <option>2024</option>
                                                            <option>2025</option>
                                                            <option>2026</option>
                                                            <option>2027</option>
                                                            <option>2028</option>
                                                            <option>2029</option>
                                                            <option>2030</option>
                                                            <option>2031</option>
                                                            <option>2032</option>
                                                            <option>2033</option>
                                                            <option>2034</option>
                                                            <option>2035</option>
                                                        </select>
                                                    </div>
                                                    <div class="form-group" style="padding-top: 11%; padding-left:60%;">
                                                        <div class="col-sm-offset-2 col-sm-10">
                                                            <button type="submit"
                                                                class="btn btn-primary btn-md ">REGISTER</button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                    </form>
                                </div>

                            </div>

                        </div>
                    </div>
                </div>
            </div>
    </section>

    <div class="container" style="padding-top: 3%;">

        <div class="container-fluid" style="text-align: center;background-color: #ddd1d1;
         height: 2px;">
            <div class="col-md-12"></div>
        </div>
        <span class="pull-right" style="font-size: x-small; color: #4d532b;">@ Shabo</span>

    </div>
    <!-- jQuery (necessary for Bootstrap’s JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!--Include all compiled plugins(below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <style>
        .col-md-2 {
            border-radius: 1.2em;
            background-color: #34495e;
            text-align: center;
            padding: 1em 2em 1em 2em;
            color: white;

        }
    </style>
</body>

</html>