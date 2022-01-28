
import React from "react";
import axios from "axios";
import { useState, useEffect } from "react";
import './h.css'

export default function Volunteer() {
  let [volunteerId, setvolunteerId] = useState("");
  let [specialty, setspecialty] = useState("");
  let [expreince, setexpreince] = useState("");
  let [id, setid] = useState("")

  const [myv, setMyv] = useState([{ volunteerId: "", specialty: "", expreince: "", id: "" }]);

  function handelvolunteerId(event) {
    setvolunteerId((event.target.value));
  }
  function handelspecialty(event) {
    setspecialty((event.target.value));
  }
  function handelexpreince(event) {
    setexpreince((event.target.value));
  }
  function handelid(event) {
    setid((event.target.value));
  }

  let foreignKey = { "id": id }
  let nuwVol = {
    volunteerId: volunteerId,
    specialty: specialty,
    expreince: expreince,
    user: foreignKey

  };

  function Reg() {
    axios({
      method: "post",
      url: "https://databaseinspir.herokuapp.com/api/volunteer/add",

      data: nuwVol

    });
  }
  // function Delete() {
  //   axios({
  //     method: 'delete',
  //     url: "/api/volunteer/delete/1"
  //   })
  // }

  //   function Delete() {
  //     console.log("ikk");
  //     axios.delete("delete/2").then(() => setmyid("deleted"));
  //   }

  return (
    <div class="form">

      <h2>Register As Volunteer</h2>
   
      <br />
      <label > specialty :</label>
      <br />
      <input type="text" placeholder="" name="name" onChange={handelspecialty} />
      <br />
      <label > expreince :</label>
      <br />
      <input type="text" placeholder="" name="name" onChange={handelexpreince} />
      <br />
      <label > National ID  :</label>
      <br /> <input type="text" placeholder="" name="id" onChange={handelid} />
      <br />

      <br></br>
      <button onClick={Reg}>Add </button>
      {/* <button onClick={Delete}>delete</button> */}

    </div>
  );
}