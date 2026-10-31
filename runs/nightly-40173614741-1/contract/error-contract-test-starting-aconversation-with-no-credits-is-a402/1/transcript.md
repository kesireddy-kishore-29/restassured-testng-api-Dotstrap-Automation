# Transcript: With no credits left, starting a conversation is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#startingAConversationWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-ee97fbcc-2f5a-47c2-80ce-b12b61fa9503` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-badd45e1-1665-4faf-a21a-6b36f2ddfc76` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-e550f3bd-52be-4f26-992e-1b826285cc24` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-ee16785b-5793-493f-b321-bddb3c3347dd` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 25 | `qa-2969724a-0464-4b9a-a1b1-926110f7bbb1` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-d28fd448-cec2-4b12-9588-0444bda54615` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-8fb8d27b-0a81-4989-a593-903a8848ca44` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-374efd8d-806d-4628-872f-34906645d2ee` |
| 9 | `GET /v1/credits/balance` | 200 | 19 | `qa-40b634cb-29c7-4734-b182-f7d12d44e3a5` |
| 10 | `POST /v1/conversations` | 402 | 11 | `qa-ac717c1c-90cc-4786-ae96-5d14e70b5346` |
| 11 | `GET /v1/credits/ledger` | 200 | 11 | `qa-1c04a3f5-1d1b-4d1d-abe3-5675dfc230eb` |
| 12 | `POST /v1/auth/token` | 200 | 12 | `qa-2fea07bf-5322-4d44-8ce3-41ee09ed28ad` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-cceb9210-83a5-453d-9c3d-702432e2c410` |
| 14 | `POST /v1/auth/token` | 401 | 9 | `qa-32a2f06c-b949-4440-bd15-dd556147b93a` |
| 15 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-c6afa75b-fbf3-48a6-9b6b-16748120aba7` |
| 16 | `POST /v1/auth/token` | 401 | 11 | `qa-e3c6e957-7650-480e-a68e-50d56e9183af` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ee97fbcc-2f5a-47c2-80ce-b12b61fa9503

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee97fbcc-2f5a-47c2-80ce-b12b61fa9503
Content-Type: application/json

--- request body ---
{"handle":"qa-f91ce0fe73c6","displayName":"QA f91ce0fe73c6","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee97fbcc-2f5a-47c2-80ce-b12b61fa9503
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 7
Location: /v1/accounts/qa-f91ce0fe73c6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d242b092-0504-4cea-a6e2-d35498fde051","handle":"qa-f91ce0fe73c6","displayName":"QA f91ce0fe73c6","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.397346624Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-badd45e1-1665-4faf-a21a-6b36f2ddfc76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-badd45e1-1665-4faf-a21a-6b36f2ddfc76
Content-Type: application/json

--- request body ---
{"handle":"qa-213b7a0b936e","displayName":"QA 213b7a0b936e","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-badd45e1-1665-4faf-a21a-6b36f2ddfc76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 7
Location: /v1/accounts/qa-213b7a0b936e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a2fd91b8-fff8-4c41-bc16-b1103d0dec86","handle":"qa-213b7a0b936e","displayName":"QA 213b7a0b936e","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.448122841Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e550f3bd-52be-4f26-992e-1b826285cc24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e550f3bd-52be-4f26-992e-1b826285cc24
Content-Type: application/json

--- request body ---
{"handle":"qa-f91ce0fe73c6","password":"****"}

--- response: 200 in 42 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-e550f3bd-52be-4f26-992e-1b826285cc24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d242b092-0504-4cea-a6e2-d35498fde051"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ee16785b-5793-493f-b321-bddb3c3347dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee16785b-5793-493f-b321-bddb3c3347dd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-213b7a0b936e","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee16785b-5793-493f-b321-bddb3c3347dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_a032977e-779d-4edc-a075-c73bbac4ae0c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a032977e-779d-4edc-a075-c73bbac4ae0c","subject":"Error contract","status":"open","region":"eu","participants":["qa-f91ce0fe73c6","qa-213b7a0b936e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.592330709Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_a032977e-779d-4edc-a075-c73bbac4ae0c/messages
correlation: qa-2969724a-0464-4b9a-a1b1-926110f7bbb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2969724a-0464-4b9a-a1b1-926110f7bbb1
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-2969724a-0464-4b9a-a1b1-926110f7bbb1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_0df038b8-cdd5-495f-90f6-48b43f5deab9","conversationId":"cnv_a032977e-779d-4edc-a075-c73bbac4ae0c","sender":"qa-f91ce0fe73c6","body":"2","createdAt":"2026-10-25T07:40:26.626018007Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_a032977e-779d-4edc-a075-c73bbac4ae0c/messages
correlation: qa-d28fd448-cec2-4b12-9588-0444bda54615

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d28fd448-cec2-4b12-9588-0444bda54615
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-d28fd448-cec2-4b12-9588-0444bda54615
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_7bbd55d1-bf40-4139-a0b5-524a0eb09b19","conversationId":"cnv_a032977e-779d-4edc-a075-c73bbac4ae0c","sender":"qa-f91ce0fe73c6","body":"3","createdAt":"2026-10-25T07:40:26.640651647Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_a032977e-779d-4edc-a075-c73bbac4ae0c/messages
correlation: qa-8fb8d27b-0a81-4989-a593-903a8848ca44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fb8d27b-0a81-4989-a593-903a8848ca44
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fb8d27b-0a81-4989-a593-903a8848ca44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_02fac279-ea88-4f2a-bde7-0a4c45bba214","conversationId":"cnv_a032977e-779d-4edc-a075-c73bbac4ae0c","sender":"qa-f91ce0fe73c6","body":"4","createdAt":"2026-10-25T07:40:26.665520075Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_a032977e-779d-4edc-a075-c73bbac4ae0c/messages
correlation: qa-374efd8d-806d-4628-872f-34906645d2ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-374efd8d-806d-4628-872f-34906645d2ee
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-374efd8d-806d-4628-872f-34906645d2ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_261f8af6-4dbd-4485-96e1-f024640de03c","conversationId":"cnv_a032977e-779d-4edc-a075-c73bbac4ae0c","sender":"qa-f91ce0fe73c6","body":"5","createdAt":"2026-10-25T07:40:26.693449367Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-40b634cb-29c7-4734-b182-f7d12d44e3a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40b634cb-29c7-4734-b182-f7d12d44e3a5
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-40b634cb-29c7-4734-b182-f7d12d44e3a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":0,"currency":"credits","accountId":"acc_d242b092-0504-4cea-a6e2-d35498fde051"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-ac717c1c-90cc-4786-ae96-5d14e70b5346

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac717c1c-90cc-4786-ae96-5d14e70b5346
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-213b7a0b936e","subject":"One more","message":"Hi"}

--- response: 402 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ac717c1c-90cc-4786-ae96-5d14e70b5346
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 270

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-ac717c1c-90cc-4786-ae96-5d14e70b5346"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-1c04a3f5-1d1b-4d1d-abe3-5675dfc230eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c04a3f5-1d1b-4d1d-abe3-5675dfc230eb
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c04a3f5-1d1b-4d1d-abe3-5675dfc230eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 1169

{"items":[{"id":"led_0ae39ab9-d3e9-4fef-9e14-076cabddc783","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-25T07:40:26.397358432Z"},{"id":"led_3bdbd0b9-2f56-426b-8ccd-fada4e2abd3d","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_a032977e-779d-4edc-a075-c73bbac4ae0c","createdAt":"2026-10-25T07:40:26.592320944Z"},{"id":"led_6f8a4bac-c20f-451b-aab5-a127536fd7b3","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_0df038b8-cdd5-495f-90f6-48b43f5deab9","createdAt":"2026-10-25T07:40:26.626009935Z"},{"id":"led_f8d25c63-28eb-45e2-8e5f-89ba927ee6ef","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_7bbd55d1-bf40-4139-a0b5-524a0eb09b19","createdAt":"2026-10-25T07:40:26.640628862Z"},{"id":"led_d9635aa6-701b-44b0-b77e-08f1358695af","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_02fac279-ea88-4f2a-bde7-0a4c45bba214","createdAt":"2026-10-25T07:40:26.665505273Z"},{"id":"led_d427380b-5894-4924-9c3a-b2dce61c01cc","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_261f8af6-4dbd-4485-96e1-f024640de03c","createdAt":"2026-10-25T07:40:26.693443899Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-2fea07bf-5322-4d44-8ce3-41ee09ed28ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fea07bf-5322-4d44-8ce3-41ee09ed28ad
Content-Type: application/json

--- request body ---
{"handle":"qa-213b7a0b936e","password":"****"}

--- response: 200 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fea07bf-5322-4d44-8ce3-41ee09ed28ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a2fd91b8-fff8-4c41-bc16-b1103d0dec86"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cceb9210-83a5-453d-9c3d-702432e2c410

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cceb9210-83a5-453d-9c3d-702432e2c410
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cceb9210-83a5-453d-9c3d-702432e2c410
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-32a2f06c-b949-4440-bd15-dd556147b93a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32a2f06c-b949-4440-bd15-dd556147b93a
Content-Type: application/json

--- request body ---
{"handle":"qa-213b7a0b936e","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32a2f06c-b949-4440-bd15-dd556147b93a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-32a2f06c-b949-4440-bd15-dd556147b93a"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c6afa75b-fbf3-48a6-9b6b-16748120aba7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6afa75b-fbf3-48a6-9b6b-16748120aba7
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c6afa75b-fbf3-48a6-9b6b-16748120aba7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
```

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-e3c6e957-7650-480e-a68e-50d56e9183af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3c6e957-7650-480e-a68e-50d56e9183af
Content-Type: application/json

--- request body ---
{"handle":"qa-f91ce0fe73c6","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e3c6e957-7650-480e-a68e-50d56e9183af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e3c6e957-7650-480e-a68e-50d56e9183af"}
```
