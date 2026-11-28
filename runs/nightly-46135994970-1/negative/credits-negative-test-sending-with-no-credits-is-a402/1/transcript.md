# Transcript: With no credits left, a message is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#sendingWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-5af73db8-1105-4ba9-93fa-b49ee6bebfab` |
| 2 | `POST /v1/accounts` | 201 | 11 | `qa-c4714be4-bee3-450b-a427-467f12ac9c0c` |
| 3 | `POST /v1/auth/token` | 200 | 10 | `qa-6a72d795-0d03-4503-8e71-5aeadfb4eb60` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-35ac08b9-2f8a-4c7a-b7f8-2fb32494f930` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-a71f832a-aa44-4148-a6fe-93b5d6216206` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-88c9da24-239a-4a9f-adfd-f97c472facb2` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-97a463bd-c959-4839-90cf-bb4715b6acf4` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-34a075ff-eb2b-4f8f-bbdf-8028ddfd2b6b` |
| 9 | `GET /v1/credits/balance` | 200 | 8 | `qa-bf037101-5a15-4d17-939e-79ac62edeaed` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 13 | `qa-ebc54a6a-0a84-409f-bad1-be274791b89f` |
| 11 | `GET /v1/credits/ledger` | 200 | 15 | `qa-feca10f1-49ba-46f1-8f12-7df97f5a14ef` |
| 12 | `POST /v1/auth/token` | 200 | 35 | `qa-2b070388-63fe-4357-8fa9-756ac5ad9cce` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-ae6abf1b-37b7-4e78-a51c-41fd28ed15de` |
| 14 | `POST /v1/auth/token` | 401 | 5 | `qa-a82eaec6-1f7a-41bb-8274-9ace60b38670` |
| 15 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-257d2cb7-7ce5-4d32-996c-918ca45fa957` |
| 16 | `POST /v1/auth/token` | 401 | 13 | `qa-53e55f2f-1d52-4fc8-b99e-9b1e888ced16` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5af73db8-1105-4ba9-93fa-b49ee6bebfab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5af73db8-1105-4ba9-93fa-b49ee6bebfab
Content-Type: application/json

--- request body ---
{"handle":"qa-824fd0aa86a5","displayName":"QA 824fd0aa86a5","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-5af73db8-1105-4ba9-93fa-b49ee6bebfab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Location: /v1/accounts/qa-824fd0aa86a5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ab2574d1-fa82-4cce-9a15-9ab03b51bd7b","handle":"qa-824fd0aa86a5","displayName":"QA 824fd0aa86a5","region":"eu","role":"user","createdAt":"2026-11-28T10:37:15.011010456Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c4714be4-bee3-450b-a427-467f12ac9c0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4714be4-bee3-450b-a427-467f12ac9c0c
Content-Type: application/json

--- request body ---
{"handle":"qa-539bd2014dca","displayName":"QA 539bd2014dca","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4714be4-bee3-450b-a427-467f12ac9c0c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Location: /v1/accounts/qa-539bd2014dca
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d7794373-f65a-4d05-8bc0-35d5337bb7f3","handle":"qa-539bd2014dca","displayName":"QA 539bd2014dca","region":"eu","role":"user","createdAt":"2026-11-28T10:37:15.033005763Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6a72d795-0d03-4503-8e71-5aeadfb4eb60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a72d795-0d03-4503-8e71-5aeadfb4eb60
Content-Type: application/json

--- request body ---
{"handle":"qa-824fd0aa86a5","password":"****"}

--- response: 200 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a72d795-0d03-4503-8e71-5aeadfb4eb60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ab2574d1-fa82-4cce-9a15-9ab03b51bd7b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-35ac08b9-2f8a-4c7a-b7f8-2fb32494f930

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35ac08b9-2f8a-4c7a-b7f8-2fb32494f930
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-539bd2014dca","subject":"Many messages","message":"1"}

--- response: 201 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-35ac08b9-2f8a-4c7a-b7f8-2fb32494f930
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
Location: /v1/conversations/cnv_a3406253-00fc-42c0-bcb4-e01d1482d56d
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_a3406253-00fc-42c0-bcb4-e01d1482d56d","subject":"Many messages","status":"open","region":"eu","participants":["qa-824fd0aa86a5","qa-539bd2014dca"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:15.086747430Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_a3406253-00fc-42c0-bcb4-e01d1482d56d/messages
correlation: qa-a71f832a-aa44-4148-a6fe-93b5d6216206

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a71f832a-aa44-4148-a6fe-93b5d6216206
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-a71f832a-aa44-4148-a6fe-93b5d6216206
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

{"id":"msg_c3f01754-7312-4a24-b9fb-a97ad1594c06","conversationId":"cnv_a3406253-00fc-42c0-bcb4-e01d1482d56d","sender":"qa-824fd0aa86a5","body":"2","createdAt":"2026-11-28T10:37:15.116284432Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_a3406253-00fc-42c0-bcb4-e01d1482d56d/messages
correlation: qa-88c9da24-239a-4a9f-adfd-f97c472facb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88c9da24-239a-4a9f-adfd-f97c472facb2
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-88c9da24-239a-4a9f-adfd-f97c472facb2
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

{"id":"msg_6ce6cf90-2a6e-4233-ab44-31adefaecb16","conversationId":"cnv_a3406253-00fc-42c0-bcb4-e01d1482d56d","sender":"qa-824fd0aa86a5","body":"3","createdAt":"2026-11-28T10:37:15.142353338Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_a3406253-00fc-42c0-bcb4-e01d1482d56d/messages
correlation: qa-97a463bd-c959-4839-90cf-bb4715b6acf4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97a463bd-c959-4839-90cf-bb4715b6acf4
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-97a463bd-c959-4839-90cf-bb4715b6acf4
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

{"id":"msg_001bfd7c-38d1-4545-aeed-ba6a8cc05e5b","conversationId":"cnv_a3406253-00fc-42c0-bcb4-e01d1482d56d","sender":"qa-824fd0aa86a5","body":"4","createdAt":"2026-11-28T10:37:15.160472455Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_a3406253-00fc-42c0-bcb4-e01d1482d56d/messages
correlation: qa-34a075ff-eb2b-4f8f-bbdf-8028ddfd2b6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34a075ff-eb2b-4f8f-bbdf-8028ddfd2b6b
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-34a075ff-eb2b-4f8f-bbdf-8028ddfd2b6b
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

{"id":"msg_95bbf619-9ba3-4eaa-a779-12e984708e20","conversationId":"cnv_a3406253-00fc-42c0-bcb4-e01d1482d56d","sender":"qa-824fd0aa86a5","body":"5","createdAt":"2026-11-28T10:37:15.175199729Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-bf037101-5a15-4d17-939e-79ac62edeaed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf037101-5a15-4d17-939e-79ac62edeaed
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf037101-5a15-4d17-939e-79ac62edeaed
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

{"balance":0,"currency":"credits","accountId":"acc_ab2574d1-fa82-4cce-9a15-9ab03b51bd7b"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_a3406253-00fc-42c0-bcb4-e01d1482d56d/messages
correlation: qa-ebc54a6a-0a84-409f-bad1-be274791b89f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebc54a6a-0a84-409f-bad1-be274791b89f
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ebc54a6a-0a84-409f-bad1-be274791b89f
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
Content-Length: 320

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_a3406253-00fc-42c0-bcb4-e01d1482d56d/messages","correlationId":"qa-ebc54a6a-0a84-409f-bad1-be274791b89f"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-feca10f1-49ba-46f1-8f12-7df97f5a14ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-feca10f1-49ba-46f1-8f12-7df97f5a14ef
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-feca10f1-49ba-46f1-8f12-7df97f5a14ef
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

{"items":[{"id":"led_56ebd587-7c39-4096-9bac-a112a8b10ab9","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-28T10:37:15.011022278Z"},{"id":"led_732cf077-3736-4503-8afe-b4375efa9094","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_a3406253-00fc-42c0-bcb4-e01d1482d56d","createdAt":"2026-11-28T10:37:15.086706693Z"},{"id":"led_668eaf1c-fd90-47fe-a2a5-d4f90a67cd6f","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_c3f01754-7312-4a24-b9fb-a97ad1594c06","createdAt":"2026-11-28T10:37:15.116245118Z"},{"id":"led_48577a33-f135-4911-ba07-4a1e08951c0b","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_6ce6cf90-2a6e-4233-ab44-31adefaecb16","createdAt":"2026-11-28T10:37:15.142311370Z"},{"id":"led_15799e3d-bc49-45ea-ab79-a06319b63bba","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_001bfd7c-38d1-4545-aeed-ba6a8cc05e5b","createdAt":"2026-11-28T10:37:15.160422472Z"},{"id":"led_6698c876-a761-4eb1-89b9-b4e936ec6661","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_95bbf619-9ba3-4eaa-a779-12e984708e20","createdAt":"2026-11-28T10:37:15.175159464Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-2b070388-63fe-4357-8fa9-756ac5ad9cce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b070388-63fe-4357-8fa9-756ac5ad9cce
Content-Type: application/json

--- request body ---
{"handle":"qa-539bd2014dca","password":"****"}

--- response: 200 in 35 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b070388-63fe-4357-8fa9-756ac5ad9cce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d7794373-f65a-4d05-8bc0-35d5337bb7f3"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ae6abf1b-37b7-4e78-a51c-41fd28ed15de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae6abf1b-37b7-4e78-a51c-41fd28ed15de
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ae6abf1b-37b7-4e78-a51c-41fd28ed15de
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
correlation: qa-a82eaec6-1f7a-41bb-8274-9ace60b38670

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a82eaec6-1f7a-41bb-8274-9ace60b38670
Content-Type: application/json

--- request body ---
{"handle":"qa-539bd2014dca","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a82eaec6-1f7a-41bb-8274-9ace60b38670
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a82eaec6-1f7a-41bb-8274-9ace60b38670"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-257d2cb7-7ce5-4d32-996c-918ca45fa957

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-257d2cb7-7ce5-4d32-996c-918ca45fa957
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-257d2cb7-7ce5-4d32-996c-918ca45fa957
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
correlation: qa-53e55f2f-1d52-4fc8-b99e-9b1e888ced16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53e55f2f-1d52-4fc8-b99e-9b1e888ced16
Content-Type: application/json

--- request body ---
{"handle":"qa-824fd0aa86a5","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-53e55f2f-1d52-4fc8-b99e-9b1e888ced16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-53e55f2f-1d52-4fc8-b99e-9b1e888ced16"}
```
