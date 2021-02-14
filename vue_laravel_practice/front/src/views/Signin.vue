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
          <input
            class="px-2 w-full rounded border border-blue-100 border-transparent focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-transparent"
            type="email"
            placeholder="email"
          />
        </div>
        <div>
          <input
            class="px-2 w-full rounded border border-blue-100 border-transparent focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-transparent"
            type="password"
            placeholder="password"
          />
        </div>
        <div class="text-right">
          <button
            class="px-2 text-white bg-blue-500 rounded hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-500 focus:ring-opacity-50"
          >
            SIGN IN
          </button>
        </div>
        <div class="text-right border-t pt-5">
          <router-link to="/signup"
            ><button
              class="px-2 text-white bg-blue-500 rounded hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-500 focus:ring-opacity-50"
            >
              SIGN UP
            </button>
          </router-link>
        </div>
      </form>
    </div>
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue'

export default defineComponent({
  name: 'Signin',
})
</script>
