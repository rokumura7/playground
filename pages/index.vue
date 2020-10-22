<template>
  <div class="h-full w-full flex items-stretch justify-center bg-gray-300">
    <div class="m-4 p-4 w-full rounded bg-white">
      <h1 class="text-lg">TODO</h1>
      <form class="flex" @submit="add">
        <input
          v-model="task"
          type="text"
          class="my-4 mr-4 p-2 w-full border rounded"
        />
        <button
          class="m-4 p-2 border-blue-500 hover:bg-blue-500 text-blue-500 hover:text-white font-bold border rounded"
          @click="add"
        >
          Add
        </button>
      </form>
      <div class="flex justify-center">
        <button
          class="m-4 p-2 border-blue-500 hover:bg-blue-500 text-blue-500 hover:text-white font-bold border rounded"
          @click="showAll"
        >
          ALL
        </button>
        <button
          class="m-4 p-2 border-teal-500 hover:bg-teal-500 text-teal-500 hover:text-white font-bold border rounded"
          @click="filterBy(1)"
        >
          STOCK
        </button>
        <button
          class="m-4 p-2 border-green-500 hover:bg-green-500 text-green-500 hover:text-white font-bold border rounded"
          @click="filterBy(2)"
        >
          DOING
        </button>
        <button
          class="m-4 p-2 border-gray-500 hover:bg-gray-500 text-gray-500 hover:text-white font-bold border rounded"
          @click="filterBy(9)"
        >
          DONE
        </button>
      </div>
      <div>
        <div
          v-for="(todo, index) in todoList"
          :key="index"
          class="flex mb-2 p-2 border border-opacity-0 hover:border-opacity-50 border-blue-500 item-center"
        >
          <p class="mr-4 p-2 w-full">{{ todo.task }}</p>
          <select
            class="mr-4 p-2"
            :value="todo.status"
            @change="update(index, $event.target)"
          >
            <option
              v-for="(opt, _index) in options"
              :key="_index"
              :value="opt.status"
            >
              {{ opt.label }}
            </option>
          </select>
          <button
            class="p-2 border-red-500 hover:bg-red-500 text-red-500 hover:text-white font-bold border rounded"
            @click="remove(index)"
          >
            REMOVE
          </button>
        </div>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import Vue from 'vue'
import { Todo } from '../store'

export type DataType = {
  todoList: Todo[]
  task: string
  options: { [key: string]: string }[]
}

export default Vue.extend({
  data(): DataType {
    return {
      todoList: [],
      task: '',
      options: [
        { label: 'STOCK', status: '1' },
        { label: 'DOING', status: '2' },
        { label: 'DONE', status: '9' },
      ],
    }
  },
  created() {
    this.$accessor.resetTodoList()
    this.showAll()
  },
  methods: {
    showAll() {
      this.todoList = [...this.$accessor.todoList]
    },
    add(evt: Event) {
      evt.preventDefault()
      if (this.task !== '') {
        const todo = { task: this.task, status: '1' }
        this.$accessor.addTodoList(todo)
        this.todoList.push(todo)
        this.task = ''
      }
    },
    remove(index: number) {
      const todo = this.todoList[index]
      this.$accessor.removeFromTodoList(todo)
      this.todoList.splice(index, 1)
    },
    update(index: number, elm: HTMLSelectElement) {
      const status = elm.selectedOptions[0].value
      const todo = this.todoList[index]
      todo.status = status
      this.$accessor.chengeStatus(todo)
    },
    filterBy(status: string) {
      this.todoList = this.todoList.filter((t) => t.status === status + '')
    },
  },
})
</script>
