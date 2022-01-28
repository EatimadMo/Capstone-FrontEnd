
import React, { useEffect, useState } from 'react'
import axios from "axios"
import './h.css'

export default function Volunteers() {

    const [data, setData] = useState([]);
    let [Users, setUsers] = useState("");


    useEffect(() => {
        axios
            .get("https://databaseinspir.herokuapp.com/api/volunteer")
            .then(result => setData(result.data));
        console.log(data);
    }, []);

    function deleteAccount(id,e) {
        axios.delete(`https://databaseinspir.herokuapp.com/api/volunteer/delete/${id}`)
        .then(result => {
          const Users =result.data;
            const data = Object.values(Users).filter(e => e.id !== id);
            setUsers( data );
          })
          .catch((error) => console.log(error));
      };

    return (
        <div>
            <h1> The Volunteers : </h1>
            {data.length > 0 && data.map(item => {
                return <div key={item.volunteerId}>
                    <div class="disdiv">
                        {/* <img src={item.avatar}width={"150px"} height={"100px"}/> */}
                        <br></br>
                        <img src={item.user?.avatar} width={"150px"} height={"100px"} />
                        <br></br>
                        <br></br>
                        <label class="h" >username :  </label> <p>{item.user?.username}</p>
                        <label class="h" >specialty :</label>  <p>{item.specialty}</p>
                        <label class="h" > expreince :  </label>       <p>{item.expreince}</p>
                        <hr />
                        <button onClick={(e) => deleteAccount(item.id, e)} > delete  </button>

                    </div>
                </div>
            })}
        </div>
    )
}