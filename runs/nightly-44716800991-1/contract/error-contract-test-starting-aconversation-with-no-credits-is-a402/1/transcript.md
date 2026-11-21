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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-e55deb67-59ee-422e-acfd-580ac8be944a` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-48ea1e94-6712-4e19-8da6-2ec3467637d7` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-6e1d5982-ce4d-45b2-b00b-5f349691ae92` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-1e5ad75b-822d-41a9-a7fa-16890ca317ad` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 15 | `qa-3701ee1f-2705-4bc3-b896-823670ea7d2c` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 27 | `qa-97cc2b25-1a79-4008-aab6-994086fedadb` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 35 | `qa-7882e2b9-3d2a-4ecf-9c55-ca6fdb9a0a46` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 29 | `qa-1eed6a9b-5be4-4fff-8192-64fc2e586135` |
| 9 | `GET /v1/credits/balance` | 200 | 12 | `qa-51c5fbac-7abf-4369-b877-4b5f187af173` |
| 10 | `POST /v1/conversations` | 402 | 13 | `qa-2039344f-2475-4842-a4c9-b9743bd40abf` |
| 11 | `GET /v1/credits/ledger` | 200 | 10 | `qa-cd9712a8-e341-41de-b783-9b10142ed38e` |
| 12 | `POST /v1/auth/token` | 200 | 16 | `qa-a7c17c83-ec71-4b8c-90dc-3dcfe0dbbb0e` |
| 13 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-2b170a83-54c0-463d-bdd6-b47f13437b94` |
| 14 | `POST /v1/auth/token` | 401 | 10 | `qa-42831f68-0a9b-4d60-8803-aa1a1b3e5c37` |
| 15 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-5cad63d8-cfcf-4cc0-851e-9cb51ce0c19a` |
| 16 | `POST /v1/auth/token` | 401 | 7 | `qa-60cfb06c-23d8-4c2f-94ca-a49e822f420c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e55deb67-59ee-422e-acfd-580ac8be944a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e55deb67-59ee-422e-acfd-580ac8be944a
Content-Type: application/json

--- request body ---
{"handle":"qa-8284a09a68e9","displayName":"QA 8284a09a68e9","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-e55deb67-59ee-422e-acfd-580ac8be944a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 7
Location: /v1/accounts/qa-8284a09a68e9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_53b6df62-7c18-4204-b03f-d7d480090b45","handle":"qa-8284a09a68e9","displayName":"QA 8284a09a68e9","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.983227408Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-48ea1e94-6712-4e19-8da6-2ec3467637d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48ea1e94-6712-4e19-8da6-2ec3467637d7
Content-Type: application/json

--- request body ---
{"handle":"qa-64064d201521","displayName":"QA 64064d201521","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-48ea1e94-6712-4e19-8da6-2ec3467637d7
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
Location: /v1/accounts/qa-64064d201521
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4b8ca650-6b16-4882-be70-fabf0c2392ae","handle":"qa-64064d201521","displayName":"QA 64064d201521","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.025441992Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6e1d5982-ce4d-45b2-b00b-5f349691ae92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e1d5982-ce4d-45b2-b00b-5f349691ae92
Content-Type: application/json

--- request body ---
{"handle":"qa-8284a09a68e9","password":"****"}

--- response: 200 in 23 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e1d5982-ce4d-45b2-b00b-5f349691ae92
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_53b6df62-7c18-4204-b03f-d7d480090b45"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1e5ad75b-822d-41a9-a7fa-16890ca317ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e5ad75b-822d-41a9-a7fa-16890ca317ad
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-64064d201521","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e5ad75b-822d-41a9-a7fa-16890ca317ad
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
Location: /v1/conversations/cnv_7a4d4971-ee67-45f9-b2e0-73f52020f970
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7a4d4971-ee67-45f9-b2e0-73f52020f970","subject":"Error contract","status":"open","region":"eu","participants":["qa-8284a09a68e9","qa-64064d201521"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:03.096744172Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_7a4d4971-ee67-45f9-b2e0-73f52020f970/messages
correlation: qa-3701ee1f-2705-4bc3-b896-823670ea7d2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3701ee1f-2705-4bc3-b896-823670ea7d2c
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3701ee1f-2705-4bc3-b896-823670ea7d2c
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

{"id":"msg_6eaec20f-6ebf-4d5c-8a9c-3604eb049c3f","conversationId":"cnv_7a4d4971-ee67-45f9-b2e0-73f52020f970","sender":"qa-8284a09a68e9","body":"2","createdAt":"2026-11-20T10:10:03.128264413Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_7a4d4971-ee67-45f9-b2e0-73f52020f970/messages
correlation: qa-97cc2b25-1a79-4008-aab6-994086fedadb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97cc2b25-1a79-4008-aab6-994086fedadb
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 27 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-97cc2b25-1a79-4008-aab6-994086fedadb
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

{"id":"msg_6b3342a6-408c-4441-8da4-6649d1ba3801","conversationId":"cnv_7a4d4971-ee67-45f9-b2e0-73f52020f970","sender":"qa-8284a09a68e9","body":"3","createdAt":"2026-11-20T10:10:03.172361623Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_7a4d4971-ee67-45f9-b2e0-73f52020f970/messages
correlation: qa-7882e2b9-3d2a-4ecf-9c55-ca6fdb9a0a46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7882e2b9-3d2a-4ecf-9c55-ca6fdb9a0a46
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 35 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7882e2b9-3d2a-4ecf-9c55-ca6fdb9a0a46
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

{"id":"msg_859bc960-7583-402a-a723-42933c2832a8","conversationId":"cnv_7a4d4971-ee67-45f9-b2e0-73f52020f970","sender":"qa-8284a09a68e9","body":"4","createdAt":"2026-11-20T10:10:03.221086764Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_7a4d4971-ee67-45f9-b2e0-73f52020f970/messages
correlation: qa-1eed6a9b-5be4-4fff-8192-64fc2e586135

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1eed6a9b-5be4-4fff-8192-64fc2e586135
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 29 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1eed6a9b-5be4-4fff-8192-64fc2e586135
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

{"id":"msg_c7ea876d-f26c-4697-ae9d-64b95bdfd18a","conversationId":"cnv_7a4d4971-ee67-45f9-b2e0-73f52020f970","sender":"qa-8284a09a68e9","body":"5","createdAt":"2026-11-20T10:10:03.265350013Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-51c5fbac-7abf-4369-b877-4b5f187af173

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51c5fbac-7abf-4369-b877-4b5f187af173
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-51c5fbac-7abf-4369-b877-4b5f187af173
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

{"balance":0,"currency":"credits","accountId":"acc_53b6df62-7c18-4204-b03f-d7d480090b45"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-2039344f-2475-4842-a4c9-b9743bd40abf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2039344f-2475-4842-a4c9-b9743bd40abf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-64064d201521","subject":"One more","message":"Hi"}

--- response: 402 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2039344f-2475-4842-a4c9-b9743bd40abf
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-2039344f-2475-4842-a4c9-b9743bd40abf"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-cd9712a8-e341-41de-b783-9b10142ed38e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd9712a8-e341-41de-b783-9b10142ed38e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd9712a8-e341-41de-b783-9b10142ed38e
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

{"items":[{"id":"led_54707619-6137-4bca-bdd6-b237a2a6b76c","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-20T10:10:02.983235764Z"},{"id":"led_dffc1c70-e2bd-462e-982d-667025a1c222","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_7a4d4971-ee67-45f9-b2e0-73f52020f970","createdAt":"2026-11-20T10:10:03.096720758Z"},{"id":"led_b05424ed-8a6e-44ba-a1ec-d73a463ddbaf","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_6eaec20f-6ebf-4d5c-8a9c-3604eb049c3f","createdAt":"2026-11-20T10:10:03.128242902Z"},{"id":"led_913419a9-8ef3-40d4-addf-1ae4881ffb8f","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_6b3342a6-408c-4441-8da4-6649d1ba3801","createdAt":"2026-11-20T10:10:03.172332148Z"},{"id":"led_18d1bcca-6da9-4ead-ab82-213296c6fe72","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_859bc960-7583-402a-a723-42933c2832a8","createdAt":"2026-11-20T10:10:03.221077306Z"},{"id":"led_8428cd72-211b-458a-b5eb-a37c09b272d9","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_c7ea876d-f26c-4697-ae9d-64b95bdfd18a","createdAt":"2026-11-20T10:10:03.265343802Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-a7c17c83-ec71-4b8c-90dc-3dcfe0dbbb0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7c17c83-ec71-4b8c-90dc-3dcfe0dbbb0e
Content-Type: application/json

--- request body ---
{"handle":"qa-64064d201521","password":"****"}

--- response: 200 in 16 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7c17c83-ec71-4b8c-90dc-3dcfe0dbbb0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4b8ca650-6b16-4882-be70-fabf0c2392ae"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2b170a83-54c0-463d-bdd6-b47f13437b94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b170a83-54c0-463d-bdd6-b47f13437b94
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2b170a83-54c0-463d-bdd6-b47f13437b94
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
correlation: qa-42831f68-0a9b-4d60-8803-aa1a1b3e5c37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42831f68-0a9b-4d60-8803-aa1a1b3e5c37
Content-Type: application/json

--- request body ---
{"handle":"qa-64064d201521","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-42831f68-0a9b-4d60-8803-aa1a1b3e5c37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-42831f68-0a9b-4d60-8803-aa1a1b3e5c37"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5cad63d8-cfcf-4cc0-851e-9cb51ce0c19a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cad63d8-cfcf-4cc0-851e-9cb51ce0c19a
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5cad63d8-cfcf-4cc0-851e-9cb51ce0c19a
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
correlation: qa-60cfb06c-23d8-4c2f-94ca-a49e822f420c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60cfb06c-23d8-4c2f-94ca-a49e822f420c
Content-Type: application/json

--- request body ---
{"handle":"qa-8284a09a68e9","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60cfb06c-23d8-4c2f-94ca-a49e822f420c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-60cfb06c-23d8-4c2f-94ca-a49e822f420c"}
```
