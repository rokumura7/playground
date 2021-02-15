<template>
  <div class="h-full flex justify-center items-center">
    <div class="border rounded">
      <h2
        class="font-bold text-white bg-gradient-to-r from-green-400 to-blue-500 text-center px-20 py-5"
      >
        Vue Laravel Practice
      </h2>
      <form class="p-5 space-y-5">
        <div>
          <MyInput placeholder="user name" />
        </div>
        <div>
          <MyInput type="email" placeholder="email" />
        </div>
        <div>
          <MyInput type="password" placeholder="password" />
        </div>
        <div class="text-right">
          <MyButton label="SIGN UP" />
        </div>
        <div class="text-right border-t pt-5">
          <router-link to="/"><MyButton label="SIGN IN" /></router-link>
        </div>
      </form>
    </div>
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue'
import { MyButton, MyInput } from '@/components/atoms'

export default defineComponent({
  name: 'Signup',
  components: { MyButton, MyInput },
})
</script>
