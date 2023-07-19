import { useState } from 'react'
import './Practice.css'


// political meeting in this evening 
// write some code 

const Practice = ()=>{
    const [todoList, setTodoList] = useState([])
    const [newTask, setNewTask] = useState('')
    const [status, setStatus] = useState(true)



    const handleChange = (e) => setNewTask(e.target.value)

    const addTask = () =>{
    const task = {
        id : todoList.length === 0 ? 1 : todoList[todoList.length - 1].id + 1,
        taskName : newTask,
        completed : false
    }
     const arr =  [...todoList, task]
     console.log('todoList is', arr)
     const makeToDoListClean = arr.filter(task => task.taskName !== '')
     setTodoList(makeToDoListClean)
    }

    const deleteTask = (id) =>{
        const cleanList = todoList.filter(value => value.id !== id)
        console.log('cleanLis is', cleanList)
        setTodoList(cleanList)
    }
    const completeTask = (id) =>{
        setTodoList(todoList.map((task)=>{
            if(task.id === id){
                setStatus(!status)
                console.log('task is ', task)
                const getIt =  {...task, completed : true}
                console.log('getit is ', getIt)
                return {...task, completed : status}
            }else{
                return task
            }
        }))
    }
    

    return (
        <div>

        <div className='addTask'>
        <input type = 'text' onChange={handleChange} />
        <button className='addTaskBtn' onClick={addTask} >Add Task</button>
        </div>




   <div className='list'>
        {todoList.map((task)=>{
            return <div>
            <h5>{task.taskName}  <button className='deleteBtn' onClick={()=> deleteTask(task.id)} >delete</button> <button className='updateBtn' onClick={()=> completeTask(task.id)} style={{background : task.completed ? "#d1e7dd" : '#fff3cd'}} >
            {task.completed ? <span style={{color : '#198754'}}>completed</span> : <span style = {{color : '#ffc107'}}>pending</span>}
            
            </button> </h5>
                </div>
        })}
    </div>
        
        





        </div>
    )
}



export default Practice

