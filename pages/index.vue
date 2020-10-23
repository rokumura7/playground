<template>
  <div class="h-full w-full flex items-stretch justify-center bg-gray-300">
    <div class="m-4 p-4 w-full rounded bg-white">
      <h1 class="text-lg">TODO</h1>
      <form class="flex" @submit="add">
        <MyInput :value="task" :type="text" :is-full-width="true" />
        <MyButton label="add" color="primary" :bordered="true" @click="add" />
      </form>
      <div class="flex justify-center">
        <MyButton label="all" @click="showAll" />
        <MyButton label="stock" color="primary" @click="filterBy(1)" />
        <MyButton label="doing" color="success" @click="filterBy(2)" />
        <MyButton label="done" color="warning" @click="filterBy(9)" />
      </div>
      <div>
        <div
          v-for="(todo, index) in todoList"
          :key="index"
          class="flex mb-2 p-2 border border-opacity-0 hover:border-opacity-50 border-blue-500 item-center"
        >
          <p class="mr-4 p-2 w-full">{{ todo.task }}</p>
          <MySelect
            :options="options"
            :status="todo.status"
            @change="update(index, $event.target)"
          />
          <MyButton
            label="remove"
            color="danger"
            :bordered="true"
            @click="remove(index)"
          />
        </div>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import Vue from 'vue'
import { Todo } from '../store'
import MyButton from '../components/atoms/MyButton.vue'
import MySelect from '../components/atoms/MySelect.vue'
import MyInput from '../components/atoms/MyInput.vue'

export type DataType = {
  todoList: Todo[]
  task: string
  options: { [key: string]: string }[]
}

export default Vue.extend({
  components: {
    MyButton,
    MySelect,
    MyInput,
  },
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
      console.log(this.task)
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
      this.todoList = [...this.$accessor.todoList].filter(
        (t) => t.status === status + ''
      )
    },
  },
})
</script>
