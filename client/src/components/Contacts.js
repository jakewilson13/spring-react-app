import React, { Component } from 'react';
import SingleContact from './SingleContact';
import AddContacts from './AddContacts';


export default class Contacts extends Component {
    constructor(props) {
        super(props);
        //state holds all of the information of your application
        this.state = {
            contacts: [],
        };
    }

    componentDidMount() {
        fetch('http://localhost:8080/api/contacts')
        .then(response => response.json())
        .then(data => this.setState({contacts: data}))
    }

    render() {
        return(
        <div>
            <div className="row">
                <AddContacts />
            </div>
            <div className="row">
                { this.state.contacts.map((item) => (
                    //whenever returning multiple items through an array with a single component we need a key prop
                    //the key prop needs to have a unique id
                    <SingleContact key={item.id} />
                ))}
            </div>
        </div>
        )
    }
}