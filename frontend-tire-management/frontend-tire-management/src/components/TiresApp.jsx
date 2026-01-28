import { useState,useEffect } from "react"
import { TiresGrid } from "./TiresGrid";
import PropTypes from "prop-types";
import { findAllOrdered } from "../services/TireService"

export const TiresApp = () =>{

    const[tires,setTires] = useState([]);

    const getTires = async () => {
        const result = await findAllOrdered();
        setTires(result.data._embedded.tires);
    }
    useEffect(() => {
        getTires();
    },[]) //[] Indica que se va a renderizar cuando se crea el componente (post_create

    return(
        <div>
            <h1>Listado de neumaticos</h1>
            <div className="row">
                <div className="col">
                    {
                        tires.length != 0 ? <TiresGrid tires={tires} handlerRemove={handlerRemove} handlerTireSelected={handlerTireSelected}/>
                        : <div> No hay ningún neumático en la base de datos</div>
                    }
                </div>
            </div>

        </div>
    )
}


TiresApp.propTypes = {
    title: PropTypes.string.isRequired
}