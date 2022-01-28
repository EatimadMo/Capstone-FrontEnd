
import React, { useEffect, useState } from 'react'
import axios from "axios"
import './h.css'

export default function Disableds() {
    let [Users, setUsers] = useState("");

    const [data, setData] = useState([{ id: "", username: "", email: "", pass: "", avatar: "", phn: "", age: "", gender: "", city: "", descr: "" }]);

    useEffect(() => {
        axios
            .get("https://databaseinspir.herokuapp.com/api/inspir")
            .then(result => setData(result.data));
        console.log(data);
    }, []);

    function deleteAccount(id, e) {
        axios.delete(`https://databaseinspir.herokuapp.com/api/inspir/delete/${id}`)
            .then(result => {
                const Users = result.data;
                const data = Object.values(Users).filter(e => e.id !== id);
                setUsers(data);
            })
            .catch((error) => console.log(error));
    };
    return (
        <div>
            <h1> All Users : </h1>
            {data.map(item => {
                return <div key={item.id}>
                    <div class="disdiv">
                        <img src={item.avatar} width={"150px"} height={"100px"} />
                        <br></br>

                        <label class="h" >User Name :</label>  <p>{item.username}</p>
                        {/* email       <td>{item.email}</td> */}
                        {/* pass       <td>{item.pass}</td> */}

                        <label class="h" >  Phone Number: </label>  <p>{item.phn}</p>
                        <label class="h" > Age :  </label>       <p>{item.age}</p>
                        <label class="h" >Gende : </label>       <p>{item.gender}</p>
                        <label class="h" > City : </label>       <p>{item.city}</p>

                        <hr />
                        <button onClick={(e) => deleteAccount(item.id, e)} > delete  </button>

                    </div>
                </div>
            })}
        </div>
    )
}