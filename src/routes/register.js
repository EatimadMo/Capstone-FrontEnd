
import React from "react";
import axios from "axios";
import { useState, useEffect } from "react";
import { Outlet, Link } from "react-router-dom";
import './h.css'

export default function Register() {
  let [myid, setmyid] = useState("");
  let [myusername, setmyusername] = useState("");
  let [myemail, setmyemail] = useState("");
  let [mypass, setmypass] = useState("");
  let [myavatar, setmyavatar] = useState("");
  let [myphn, setmyphn] = useState("");
  let [myage, setmyage] = useState("");
  let [mygender, setmygender] = useState("");
  let [mycity, setmycity] = useState("");
  // let [mytype, setmytype] = useState("");


  // let myDis = {};

  let myData = {
    id: Number(myid),
    username: myusername,
    email: myemail,
    pass: mypass,
    avatar: myavatar,
    phn: myphn,
    age: myage,
    gender: mygender,
    city: mycity
  };
  console.log(myData);


  function handleChange(event) {
    const { name, value, type, checked } = event.target;
  }

  function Reg() {

    axios({
      method: "post",
      url: "https://databaseinspir.herokuapp.com/api/inspir/add",
      data: myData,
    });

    // if (mytype == "Disableds") {

    //   myDis = {
    //     disableType: "",
    //     disableDegree: "",
    //     user: { id: Number(myid) }
    //   }
    //   const myTimeout = setTimeout(axios({
    //     method: "post",
    //     url: "api/disableds/add",
    //     data: myDis,
    //   }), 500)
    // }

    // else if (mytype == "volunteer") {

    //   myDis = {
    //     specialty: "",
    //     expreince: "",
    //     user: { id: Number(myid) }
    //   }
    //   const myTimeout = setTimeout(axios({
    //     method: "post",
    //     url: "api/volunteers/add",
    //     data: myDis,
    //   }), 500)
    //   console.log("put code for volunteer here")
    // }
  }

  return (
    <div class="form">
      <form>
        <div>
          <h2>Register Now</h2>

          <br></br>
          National ID<br></br>{" "}
          <input placeholder=" Remember The Number" onChange={(event) => { setmyid(event.target.value); }} />
          <br></br>

          User Name<br></br>{" "}
          <input onChange={(event) => { setmyusername(event.target.value); }} />
          <br></br>

          Email<br></br>{" "}
          <input onChange={(event) => { setmyemail(event.target.value); }} />
          <br></br>

          Password<br></br>{" "}
          <input placeholder=" Number" onChange={(event) => { setmypass(event.target.value); }} />
          <br></br>

          Phone Number<br></br>{" "}
          <input placeholder=" Number" onChange={(event) => { setmyphn(event.target.value); }} />
          <br></br>

          Age <br></br>{" "}
          <input placeholder=" Number" onChange={(event) => { setmyage(event.target.value); }} />
          <br></br>

          Avatar<br></br>{" "}
          <input onChange={(event) => { setmyavatar(event.target.value); }} />
          <br></br>

          Gender<br></br>{" "}
          <input onChange={(event) => { setmygender(event.target.value); }} />
          <br></br>

          City <br></br>{" "}
          <input onChange={(event) => { setmycity(event.target.value); }} />
          {/* <br></br>
      descr <br></br>
      <input
        type="text"
        name="descr"
        onChange={(event) => {
          setmydescr(event.target.value);
        }}
      /> */}
          {/* <br></br>
          <br></br> */}

          {/* <select
            onChange={(event) => {
              setmytype(event.target.value);
            }}
          >
            <option value="select">Please select your state</option>
            <option value="User">User</option>
            <option value="Disabled">Disableds</option>
            <option value="volunteer">volunteer</option>
          </select> */}

          <br></br>
          <br></br>
          <button onClick={Reg} > <Link to="/home">Enter As User</Link> </button>
          <button onClick={Reg} > <Link to="/disabled">Enter As Disabled</Link> </button>
          <button onClick={Reg} > <Link to="/volunteer">Enter As Volunteer</Link> </button>

          <p>
            Already Have Account? <Link to="/login">Login</Link>
          </p>
        </div>
      </form>
    </div>
  );
}