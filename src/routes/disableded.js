
import React, { useEffect, useState } from 'react'
import axios from "axios"
import './h.css'

export default function Disableded() {
    let [Users, setUsers] = useState("");

    const [data, setData] = useState([]);

    useEffect(() => {
        axios
            .get("https://databaseinspir.herokuapp.com/api/disabled")
            .then(result => {
                console.log('result', result);

                setData(result.data)
            });
    }, []);

 function deleteAccount(id,e) {
        axios.delete(`https://databaseinspir.herokuapp.com/api/disabled/delete/${id}`)
        .then(result => {
          const Users =result.data;
            const data = Object.values(Users).filter(e => e.id !== id);
            setUsers( data );
          })
          .catch((error) => console.log(error));
      };

    return (
        <div>
            <h1>  The Disableds : </h1>
            {data.length > 0 && data.map(item => {
                return <div key={item.disabledId}>
                    <div class="disdiv">
                        {/* <img src={item.avatar}width={"150px"} height={"100px"}/> */}
                        <br></br>
                        <img src={item.user?.avatar} width={"150px"} height={"100px"} />
                        <br></br>
                        <br></br>
                        <label class="h" >username :  </label> <p>{item.user?.username}</p>
                        <label class="h" >disableType :</label>  <p>{item.disableType}</p>
                        <label class="h" > disableDegree :  </label> <p>{item.disableDegree}</p>
                        <hr />
               <button onClick={(e) => deleteAccount(item.id, e)} > delete  </button>

                    </div>
                </div>
            })}
        </div>
    )
}