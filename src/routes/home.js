import React from "react";

export default function Home() {
    return (
        <main style={{ padding: "1rem 0" }}>

            <div>
                <h1>Welcom To Inspir</h1>
            </div>
            <table>
                <tr>
                    <th> <div class="card">
                        <div class="containerpic">

                            <h3><a href="https://www.idpwd.com.au/"> <img height={300} width={400} src="img1.jpg" /></a></h3>
                            <div class="hoverpic">International Day of People with Disability</div>

                        </div></div></th>
                    <th>
                        <div class="card">
                            <div class="containerpic">

                                <h3><a href="http://www.emro.who.int/violence-injuries-disabilities/violence-infocus/considerations-for-people-with-disability-during-covid-19.html"><img height={300} width={400} src="img2.png" /></a> </h3>
                                <div class="hoverpic">Disability considerations during the COVID-19</div>

                            </div></div></th>
                    <th>
                        <div class="card">
                            <div class="containerpic">

                                <h3><a href="https://wecapable.com/types-of-disabilities-list/"><img height={300} width={400} src="img3.jpg" /></a></h3>
                                <div class="hoverpic">Different Types of Disabilities</div>

                            </div></div></th>
                </tr>
            </table>
            <h3>Contact Us</h3>
            <p>Our Social Media Accounts </p>


        </main>
    );
}