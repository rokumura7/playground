<template>
  <div class="h-full flex justify-center items-center">
    <div class="border rounded">
      <CardHeader label="SIGN UP" />
      <form class="p-5 space-y-5">
        <div>
          <MyInput placeholder="user name" @change-value="changeUserName" />
        </div>
        <div>
          <MyInput
            type="email"
            placeholder="email"
            @change-value="changeEmail"
          />
        </div>
        <div>
          <MyInput
            type="password"
            placeholder="password"
            @change-value="changePassword"
          />
        </div>
        <div class="text-right">
          <MyButton label="SIGN UP" @click="signup" />
        </div>
        <div class="text-right border-t pt-5">
          <router-link to="/"><MyButton label="SIGN IN" /></router-link>
        </div>
      </form>
    </div>
  </div>
</template>

<script lang="ts">
import { defineComponent, reactive } from 'vue'
import { MyButton, MyInput, CardHeader } from '@/components/atoms'
import { post } from '@/helpers/Http'

export default defineComponent({
  name: 'Signup',
  components: { MyButton, MyInput, CardHeader },
  setup() {
    const state = reactive({
      userName: '',
      email: '',
      password: '',
    })

    const changeUserName = (userName: string) => (state.userName = userName)
    const changeEmail = (email: string) => (state.email = email)
    const changePassword = (password: string) => (state.password = password)

    const signup = () => {
      console.log(state)
      post('signUp', state)
    }
    return {
      state,
      changeUserName,
      changeEmail,
      changePassword,
      signup,
    }
  },
})
</script>
