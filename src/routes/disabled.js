
import React, { useState, useEffect } from 'react'
import axios from "axios"

export default function Disabled() {

    let [disabledId, setdisabledId] = useState("")
    let [disableType, setdisableType] = useState("")
    let [disableDegree, setdisableDegree] = useState("")
    let [id, setid] = useState("")


    const [mydt, setMyDt] = useState([{ disabledId: "", disableType: "", disableDegree: "", id: "" }]);

    function handeldisabledId(event) {
        setdisabledId((event.target.value));
    }

    function handelType(event) {
        setdisableType((event.target.value));
    }

    function handelDegree(event) {
        setdisableDegree((event.target.value));
    }

    function handelid(event) {
        setid((event.target.value));
    }

    let foreignKey = { "id": id }
    let nuwUser = {
        disabledId: disabledId,
        disableType: disableType,
        disableDegree: disableDegree,
        user: foreignKey
    }

    // useEffect(() => {
    //     axios.get("api/disabled")
    //         .then(response => {
    //             console.log(response.data)
    //             setMyDt(response.data[0])
    //         })
    //     return () => { }
    // }, [])
    function reg() {
        axios({
            method: 'post',
            url: 'https://databaseinspir.herokuapp.com/api/disabled/add',

            data: nuwUser
        });
    }
    // function handle3(){
    //     axios({
    //       method: 'ubdate',
    //       url: "/api/disableds/ubdate/1"
    //     })}
    // function Delete() {
    //     axios({
    //         method: 'delete',
    //         url: "/api/disableds/delete/1"
    //     })
    // }
    return (
        <div class="disreg">
            <h2>Type Of Disability</h2>

            {/* <label > disabledId :</label>
            <br />
            <input type="text" placeholder="" name="name" onChange={handeldisabledId} /> */}
            <br />
            <label > disableType :</label>
            <br />
            <input type="text" placeholder="" name="name" onChange={handelType} />
            <br />
            <label > disableDegree :</label>
            <br />
            <input type="text" placeholder="" name="email" onChange={handelDegree} />
            <br />
            <label > National ID  :</label>
            <br /> <input type="text" placeholder="" name="id" onChange={handelid} />
            <br />
            <br />

            <button onClick={reg}>Post</button>
            {/* <button onClick={handle3}>ubdate</button> */}
            {/* <button onClick={Delete}>delete</button> */}

        </div>
    )
}