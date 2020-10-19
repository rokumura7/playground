import { getAccessorType, mutationTree, actionTree } from 'nuxt-typed-vuex'

export type Todo = {
  task: string
  status: number
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
  addTodoList(state, newValue: Todo) {
    state.todoList.push(newValue)
  },
})

export const actions = actionTree(
  { state, getters, mutations },
  {
    resetTodoList({ commit }) {
      commit('setTodoList', [{ task: 'Practice Nuxt', status: 2 }])
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
