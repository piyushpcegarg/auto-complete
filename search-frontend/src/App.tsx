import React from 'react';
import './App.css';
import Autocomplete from '@material-ui/lab/Autocomplete';
import TextField from '@material-ui/core/TextField';

interface Employee {
  id: number
  name: string;
}

function App() {

  const [options, setOptions] = React.useState<Employee[]>([]);

  const fetchEmployee = (event: object, value: string) => {

    fetch('http://localhost:8080/search?name=' + value)
      .then(response => response.json())
      .then(data => setOptions(data))
      .catch((error) => {
        console.error('Error:', error);
      });
  };

  return (
    <div className="App">
      <Autocomplete
          id="name"
          style={{ width: 300 }}
          freeSolo
          options={options.map((option) => option.name)}
          onInputChange={fetchEmployee}
          renderInput={(params) => (
            <TextField {...params} label="Search" margin="normal" variant="outlined" />
          )}
      />
    </div>
  );
}

export default App;
