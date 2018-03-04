/*
 * Simple CSS stylesheet for a navigation bar and flash messages.
 */
main {
  background-color: #eee;
  padding-bottom: 80px;
  width: 100%;
  }
header {
  border: 1px solid #d4d4d4;
  background-image: linear-gradient(to bottom, white, #f2f2f2);
  background-color: #f9f9f9;
  -webkit-box-shadow: 0 1px 10px rgba(0, 0, 0, 0.1);
  -moz-box-shadow: 0 1px 10px rgba(0, 0, 0, 0.1);
  box-shadow: 0 1px 10px rgba(0, 0, 0, 0.1);
  margin-bottom: 20px;
  font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
}
ul.nav li {
  display: inline;
}
ul.nav li a {
  padding: 10px 15px 10px;
  color: #777777;
  text-decoration: none;
  text-shadow: 0 1px 0 white;
}
.flash_notice, .flash_alert {
  padding: 8px 35px 8px 14px;
  margin-bottom: 20px;
  text-shadow: 0 1px 0 rgba(255, 255, 255, 0.5);
  border: 1px solid #fbeed5;
  -webkit-border-radius: 4px;
  -moz-border-radius: 4px;
  border-radius: 4px;
  font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-size: 14px;
  line-height: 20px;
}
.flash_notice {
  background-color: #dff0d8;
  border-color: #d6e9c6;
  color: #468847;
}
.flash_alert {
  background-color: #f2dede;
  border-color: #eed3d7;
  color: #b94a48;
}
#myHadithLogo {
	float: left;
	padding-top: 0px;
	margin-right: 10px;
}
