import PropTypes from "prop-types"
import { TireDetail } from "./TiresDetailShort"

export const TiresGrid = ({handlerTireSelected,handlerRemove,tires =[]}) => {

    return(
        <table className="table table-hover">
            <thead>
                <tr>
                    <th>name</th>
                    <th>description</th>
                    <th>price</th>
                    {/* <th>update</th>
                    <th>remove</th> */}
                </tr>
            </thead>
            <tbody>
                {tires.map( t =>{
                    return <TireDetail t = {t} handlerRemove={handlerRemove} handlerProductSelected={handlerProductSelected} key ={t.id}/>
                    })}
            </tbody>
        </table>
    )
}