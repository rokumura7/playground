import { getAccessorType, mutationTree, actionTree } from 'nuxt-typed-vuex'

export type Todo = {
  task: string
  status: string
}

export const state = () => ({
  todoList: [] as Todo[],
})

type RootState = ReturnType<typeof state>

export const getters = {
  todoList: (state: RootState) => state.todoList,
}

export const mutations = mutationTree(state, {
  setTodoList(state, newTodoList: Todo[]) {
    state.todoList = newTodoList
  },
  addTodoList(state, newTodo: Todo) {
    state.todoList.push(newTodo)
  },
  removeFromTodoList(state, removeTodo: Todo) {
    state.todoList = state.todoList.filter((todo) => todo !== removeTodo)
  },
  chengeStatus(state, todo: Todo) {
    state.todoList = state.todoList.map((t) => {
      if (t.task === todo.task) {
        t.status = todo.status
      }
      return t
    })
  },
})

export const actions = actionTree(
  { state, getters, mutations },
  {
    resetTodoList({ commit }) {
      commit('setTodoList', [
        { task: 'Practice Nuxt', status: '2' },
        { task: 'Practice TypeScript', status: '2' },
        { task: 'Practice Scala', status: '2' },
        { task: 'Practice Playframework', status: '1' },
        { task: 'Practice AWS', status: '1' },
        { task: 'Practice Typing', status: '9' },
      ])
    },
  }
)

export const accessorType = getAccessorType({
  state,
  getters,
  mutations,
  actions,
  modules: {},
})
